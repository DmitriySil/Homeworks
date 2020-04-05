package Homework.TemperatureConverter;

public class Celsius extends Temperature implements Converter {


    @Override
    public void convert(String t, double val, String t1) {
        double C;
        if (t.equals("KL")){
            C = val-275.15;
            System.out.println(C);
            if (t.equals("FR")){
                C = 5*(val - 32)/9;
                System.out.println(C);
            }
        }
    }
}
