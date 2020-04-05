package Homework.TemperatureConverter;

public class Temperature implements Converter{
    protected double value1;
    protected double value2;
    protected String t;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    @Override
    public void convert(String t,double value1) {

    }
}
