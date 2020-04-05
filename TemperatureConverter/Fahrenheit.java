package Homework.TemperatureConverter;

public class Fahrenheit extends Temperature implements Converter {
protected double value;
protected double conValue;
protected final double coef = 1.8;
protected final double coef2 = 32;
protected final double coef3 = 273;


    @Override
    public final void convert(String t,double value) {
        if (t.equals("CE")){
        value2 = (value * coef)+coef2;
        System.out.println(value+"CE"+" = "+value2+"FR");}
        if (t.equals("KL")){
            value2 = coef*(value-coef3)+coef2;
            System.out.println(value+"KL"+" = "+value2+"FR");
        }

    }
}
