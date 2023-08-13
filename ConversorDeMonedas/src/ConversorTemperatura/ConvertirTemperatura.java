package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

    public void ConvertirCelciusAFarenheit(double valor) {
        double farenheit = valor * 1.8 + 32;
        farenheit = (double) Math.round(farenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La temperatura es de " + farenheit + "° Farenheit");
    }

    public void ConvertirKelvinAFarenheit(double valor) {
        double kelvinFarenhetit = (valor - 273.15) * 9 / 5 + 32;
        kelvinFarenhetit = (double) Math.round(kelvinFarenhetit * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La temperatura es de " + kelvinFarenhetit + "° Farenheit");
    }

    public void ConvertirCelciusAKelvin(double valor) {
        double kelvin = valor * 273.15;
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La temperatura es de " + kelvin + "° Kelvin");
    }

    public void ConvertirFarenheitAKelvin(double valor) {
        double farenheitKelvin = (valor - 32) * 5 / 9 + 273.15;
        farenheitKelvin = (double) Math.round(farenheitKelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La temperatura es de " + farenheitKelvin + "° Kelvin");
    }

    public void ConvertirFarenheitACelcius(double valor) {
        double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La temperatura es de " + celcius + "° Celcius");
    }

    public void ConvertirKelvinACelcius(double valor) {
        double kelvinCelcius = valor - 273.15;
        kelvinCelcius = (double) Math.round(kelvinCelcius * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La temperatura es de " + kelvinCelcius + "° Celcius");
    }

}