package Homework.TemperatureConverter;

public class Kelvin extends Temperature implements Converter {
    protected final double coef = 5;
    protected final double coef1 = 273.15;
    protected final double coef2 = 32;
    protected final double coef4 = 9;

    @Override
    public void convert(String t,double value) {
        if (t.equals("CE")){
            value2 = value + coef1;
            System.out.println(value+"CE"+" = "+value2 + "KL");}
            if (t.equals("FR")){
                value2 = coef*(value - coef2)/coef4+coef1;
                System.out.println(value+"FR"+" = "+value2+"KL");
            }

    }
}
