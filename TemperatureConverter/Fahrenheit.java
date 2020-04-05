package Homework.TemperatureConverter;

public class Fahrenheit extends Temperature implements Converter {


    @Override
    public final void convert(String t, double val, String t1) {
        double F;
        if (t.equals("CE")){
        F = (val * 1.8)+32;
        System.out.println(F);}
        if (t.equals("KL")){
            F = 1.8*(val-273)+32;
            System.out.println(F);
        }

    }
}
