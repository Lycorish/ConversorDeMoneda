package Main;

import javax.swing.JOptionPane;

import ConversorMonedas.function;
import ConversorTemperatura.temperaturaFunction;

public class MainMenu {
    public static void main(String[] args) {

        // function convertidor = new function();
        temperaturaFunction temperatura = new temperaturaFunction();

        String[] options = { "Conversor de Monedas", "Conversor de temperatura", "Salir" };

        while (true) {
            int choice = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opción:",
                    "Menú de Opciones",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]);
            if (choice == 0) {

                try {
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero a transformar:");
                    double Minput = Double.parseDouble(input);
                    function convertidor = new function();
                    convertidor.ConvertirMonedas(Minput);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido. Ingrese un número válido.");
                }

            } else if (choice == 1) {
                String input = JOptionPane.showInputDialog("Ingresa los grados a transformar:");
                double Minput = Double.parseDouble(input);
                temperatura.ConvertirTemperatura(Minput);

            } else if (choice == 2) {
                // Salir del programa
                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                System.exit(0);
            }

        }
    }
}