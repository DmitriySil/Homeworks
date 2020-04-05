package Homework.TemperatureConverter;

public class Celsius extends Temperature implements Converter {
    protected final double coef = 5;
    protected final double coef1 = 32;
    protected final double coef3 = 9;
    protected final double coef4 = 275.15;

    @Override
    public void convert(String t,double value) {
        if (t.equals("KL")){
            value2 = value1-coef4;
            System.out.println(value+"KL"+" = "+value2+"CE");}
            if (t.equals("FR")){
                value2 = coef*(value - coef1)/coef3;
                System.out.println(value+"FR"+" = "+value2+"CE");
            }

    }
}
