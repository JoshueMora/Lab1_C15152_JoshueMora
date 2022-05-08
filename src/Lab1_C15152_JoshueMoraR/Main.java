package Lab1_C15152_JoshueMoraR;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Ejercicio1 primer = new Ejercicio1();
        long a1, a2, dif1;
        Calendar ahoraa1 = Calendar.getInstance();
        a1 = ahoraa1.getTimeInMillis();
        primer.imprimirLista("10000.csv");
        Calendar ahoraa2 = Calendar.getInstance();
        a2 = ahoraa2.getTimeInMillis();
        dif1 = a2 - a1;
        System.out.println("Se tomaron " + dif1 + "ms");

        Ejercicio2 segundo = new Ejercicio2();
        long b1, b2, dif2;
        Calendar ahorab1 = Calendar.getInstance();
        b1 = ahorab1.getTimeInMillis();
        segundo.imprimirBubbleSort("10000.csv");
        Calendar ahorab2 = Calendar.getInstance();
        b2 = ahorab2.getTimeInMillis();
        dif2 = b2 - b1;
        System.out.println("Se tomaron " + dif2 + "ms");

        Ejercicio3 tercer = new Ejercicio3();
        long c1, c2, dif3;
        Calendar ahorac1 = Calendar.getInstance();
        c1 = ahorac1.getTimeInMillis();
        tercer.imprimirListaOrdenada("10000.csv");
        Calendar ahorac2 = Calendar.getInstance();
        c2 = ahorac2.getTimeInMillis();
        dif3 = c2 - c1;
        System.out.println("Se tomaron " + dif3 + "ms");

    }
}