package Functions;

public class TemperatureConversion {
    public double CelsiusToFahrenheit(float Celsius){
        return (Celsius * 9/5) + 32;
    }

    void main() {
        double temp = CelsiusToFahrenheit(35.08f);
        System.out.print(temp + " Fahrenheit");
    }
}
