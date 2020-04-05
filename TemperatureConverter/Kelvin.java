package Homework.TemperatureConverter;

public class Kelvin extends Temperature implements Converter {


    @Override
    public void convert(String t, double val, String t1) {
        double K;
        if (t.equals("CE")){
            K = val + 273.15;
            System.out.println(K + " Ce");
            if (t.equals("FR")){
                K = 5*(val - 32)/9+273.15;
                System.out.println(K+"fr");
            }
        }
    }
}
