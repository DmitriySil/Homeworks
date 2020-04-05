package Homework.TemperatureConverter;

public class Main {
    public static void main(String[] args) {
        Fahrenheit fahrenheit = new Fahrenheit();
        Kelvin kelvin = new Kelvin();
        Celsius celsius = new Celsius();

        fahrenheit.convert("CE",44);
        fahrenheit.convert("KL",44);

        kelvin.convert("CE",67);
        kelvin.convert("FR",67);

        celsius.convert("FR",6);
        celsius.convert("KL",6);

    }

}
