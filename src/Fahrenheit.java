public class Fahrenheit extends TemperatureConverter{
    public Fahrenheit(float temperature) {
        super(temperature);
    }

    @Override
    public String toCelsius() {
        return df.format((temperature - FAHRENHEIT_CONSTANT) * CELSIUS_FACTOR) + "°C";
    }

    @Override
    public String toFahrenheit() {
        return df.format(temperature) + "°F";
    }

    @Override
    public String toKelvin() {
        return df.format((temperature - FAHRENHEIT_CONSTANT) * CELSIUS_FACTOR + KELVIN_CONSTANT) + "K";
    }
}
