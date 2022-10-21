public class Kelvin extends TemperatureConverter {
    public Kelvin(float temperature) {
        super(temperature);
    }

    @Override
    public String toCelsius() {
        return df.format(this.temperature - KELVIN_CONSTANT) + "°C";
    }

    @Override
    public String toFahrenheit() {
        return df.format((this.temperature - KELVIN_CONSTANT) * FAHRENHEIT_FACTOR + FAHRENHEIT_CONSTANT) + "ºF";
    }

    @Override
    public String toKelvin() {
        return df.format(this.temperature) + "K";
    }
}

