package Homework.TemperatureConverter;

import java.util.Scanner;

public class Calculator {
       protected Celsius celsius;
       protected Kelvin kelvin;
       protected Fahrenheit fahrenheit;

    public Celsius getCelsius() {
        return celsius;
    }

    public void setCelsius(Celsius celsius) {
        this.celsius = celsius;
    }

    public Kelvin getKelvin() {
        return kelvin;
    }

    public void setKelvin(Kelvin kelvin) {
        this.kelvin = kelvin;
    }

    public Fahrenheit getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(Fahrenheit fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public void calc() {
        while (true) {
            System.out.println("Что вы хотите конвертировать FR/KL/CE ");
            Scanner scanner = new Scanner(System.in);
            String t = scanner.nextLine();
            if (t.equals("FR") || t.equals("KL") || t.equals("CE")) {
                System.out.println("Введите значение");
                Scanner scanner1 = new Scanner(System.in);
                double val = scanner1.nextDouble();
                System.out.println("Во что конвертировать FR/KL/CE");
                Scanner scanner2 = new Scanner(System.in);
                String t1 = scanner2.nextLine();
                if (t1.equals("FR") || t1.equals("KL") || t1.equals("CE")) {
                    if (t1.equals("CE")) {
                        celsius.convert(t, val, t1);
                        System.out.println("ce");
                        break;
                    }
                    if (t1.equals("KL")) {
                        kelvin.convert(t, val, t1);
                        System.out.println("kl");
                        break;
                    }
                    if (t1.equals("FR")) {
                        fahrenheit.convert(t, val, t1);
                        System.out.println("fr");
                        break;
                    }
                }
                else ;

            }
            else ;
            System.out.println("Еще раз");
        }
    }

}
