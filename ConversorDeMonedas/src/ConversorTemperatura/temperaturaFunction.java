package ConversorTemperatura;

import javax.swing.JOptionPane;

public class temperaturaFunction {

    ConvertirTemperatura temperatura = new ConvertirTemperatura();

    public void ConvertirTemperatura(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura",
                JOptionPane.PLAIN_MESSAGE, null,
                new Object[] { "Celcius a Farenheit", "Kelvin a Farenheit",
                        "Celcius a Kelvin", "Farenheit a Kelvin", "Farenheit a Celcius",
                        "Kelvin a Celcius" },
                "Seleccion")).toString();
        switch (opcion) {
            case "Celcius a Farenheit":
                temperatura.ConvertirCelciusAFarenheit(Minput);
                break;
            case "Kelvin a Farenheit":
                temperatura.ConvertirKelvinAFarenheit(Minput);
                break;
            case "Celcius a Kelvin":
                temperatura.ConvertirCelciusAKelvin(Minput);
                break;
            case "Farenheit a Kelvin":
                temperatura.ConvertirFarenheitAKelvin(Minput);
                break;
            case "Farenheit a Celcius":
                temperatura.ConvertirFarenheitACelcius(Minput);
                break;
            case "Kelvin a Celcius":
                temperatura.ConvertirKelvinACelcius(Minput);
        }
    }
}