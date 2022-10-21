import java.text.DecimalFormat;

public class TemperatureConverter {
    protected final float temperature;
    static final float KELVIN_CONSTANT = 273.15F;
    static final float FAHRENHEIT_FACTOR = (9.0F/5.0F);
    static final float CELSIUS_FACTOR = (5.0F/9.0F);
    static final float FAHRENHEIT_CONSTANT = 32;

    static final DecimalFormat df = new DecimalFormat("0.00");

    public TemperatureConverter(float temperature) {
        this.temperature = temperature;
    }

    public String toCelsius() {
        return df.format(this.temperature) + "ºC";
    }
    public String toFahrenheit() {
        return df.format(this.temperature) + "ºF";
    }
    public String toKelvin() {
        return df.format(this.temperature) + "K";
    }
}
