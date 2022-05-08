package Lab1_C15152_JoshueMoraR;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Ejercicio2 {

    public void imprimirBubbleSort(String archivo) {
        metodos metodos = new metodos();
        Persona persona = new Persona();

        String linea = "";
        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader("10000.csv"))) {
                while ((linea = bReader.readLine()) != null) {
                    String[] infoPersona = linea.split(",");
                    persona = new Persona(Integer.parseInt(infoPersona[0]), infoPersona[1],
                            Integer.parseInt(infoPersona[2]));
                    metodos.insertarFinal(persona);
                }
                metodos.ordenarBurbuja();
                System.out.println(metodos);
                bReader.close();
            } catch (NumberFormatException e) {
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
