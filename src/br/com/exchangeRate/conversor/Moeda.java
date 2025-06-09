package br.com.exchangeRate.conversor;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;

public class Moeda {
    private String base;
    private String target;
    private double conversionResult;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public double getConversionRate() {
        return conversionResult;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionResult = conversionRate;
    }


    @Override
    public String toString() {
        return "A conversao de " + '\''+ base + '\''+ " para " + '\'' + target + '\'' + ", e igual a " + conversionResult;
    }
}
