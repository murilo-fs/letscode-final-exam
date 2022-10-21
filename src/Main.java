import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfTemperatures;
        String originScale;
        String destinyScale;
        float[] temperatures;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a unidade de origem (celsius, fahrenheit ou kelvin): ");
        originScale = sc.nextLine();

        System.out.print("Informe a unidade a ser transformada (celsius, fahrenheit ou kelvin): ");
        destinyScale = sc.nextLine();

        System.out.print("Digite o número de temperaturas a serem convertidas: ");
        
        try {
            numberOfTemperatures = sc.nextInt();
        } catch (Exception e) {
            System.out.println("O número lido não é válido!");
            return;
        }

        if (numberOfTemperatures <= 0) {
            System.out.println("O número de temperaturas a serem convertidas precisa ser maior que zero.");
            return;
        }

        temperatures = new float[numberOfTemperatures];
        for(int i = 0; i < numberOfTemperatures; i++) {
            try {
                System.out.print("Temperatura " + (i + 1) + ": ");
                temperatures[i] = sc.nextFloat();
            } catch (Exception e) {
                System.out.println("O número lido não é válido!");
                System.exit(1);
            }
        }

        for(int i = 0; i < numberOfTemperatures; i++) {
            try {
                switch (originScale) {
                    case "celsius" -> convert(originScale, destinyScale, new Celsius(temperatures[i]), temperatures[i]);
                    case "fahrenheit" -> convert(originScale, destinyScale, new Fahrenheit(temperatures[i]), temperatures[i]);
                    case "kelvin" -> convert(originScale, destinyScale, new Kelvin(temperatures[i]), temperatures[i]);
                    default -> throw new Exception("Wrong temperature origin scale");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }
        }
    }

    private static void convert(String from, String to, TemperatureConverter converter, float temperature) {
        String fromSymbol = "";
        try {
            fromSymbol = switch (from) {
                case "celsius" -> "°C";
                case "fahrenheit" -> "°F";
                case "kelvin" -> "K";
                default -> throw new Exception("Wrong temperature origin scale");
            };
        } catch (Exception $e) {
            System.out.println($e.getMessage());
            System.exit(1);
        }

        try {
            switch (to) {
                case "celsius" -> System.out.println(temperature + fromSymbol + " = " + converter.toCelsius());
                case "fahrenheit" -> System.out.println(temperature + fromSymbol + " = " + converter.toFahrenheit());
                case "kelvin" -> System.out.println(temperature + fromSymbol + " = " + converter.toKelvin());
                default -> throw new Exception("Wrong temperature destiny scale");
            };
        } catch (Exception $e) {
            System.out.println($e.getMessage());
            System.exit(1);
        }
    }
}
