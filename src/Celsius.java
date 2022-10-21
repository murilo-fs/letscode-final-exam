import java.text.DecimalFormat;

public class Celsius extends TemperatureConverter {

    public Celsius(float temperature) {
        super(temperature);
    }

    @Override
    public String toCelsius() {
        return df.format(this.temperature) + "°C";
    }

    @Override
    public String toFahrenheit() {
        return df.format(this.temperature * FAHRENHEIT_FACTOR + FAHRENHEIT_CONSTANT) + "ºF";
    }

    @Override
    public String toKelvin() {
        return df.format(this.temperature + KELVIN_CONSTANT) + "K";
    }
}
