package ejercicioaerolineas;

import java.util.Scanner;

public class EjercicioAerolineas {

    public static void main(String[] args) {

        //Creando matriz
        int vuelos[][] = new int[6][3];

        //Cargando la matiz
        Scanner teclado = new Scanner(System.in);
        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Insert the number of seats you need for the destiny: " +
                        f + " schedule " + c);
                vuelos[f][c] = teclado.nextInt();
            }
        }

        // venta de asientos
        Scanner teclado2 = new Scanner(System.in);
        String bandera = "";
        int destino, horario, asientos;

        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("Insert the N° of the destiny");
            destino = teclado.nextInt();
            System.out.println("Insert the flight schedule");
            horario = teclado.nextInt();
            System.out.println("Insert the number of seats");
            asientos = teclado.nextInt();

            if (destino >= 0 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {
                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("Your reservation was made successfully");
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos;
                    } else {
                        System.out.println("There's no seats available");
                    }
                } else {
                    System.out.println("Non-existent Schedule, insert between 0 & 2");
                }
            } else {
                System.out.println("Non-existent destiny, insert between 0 & 5");
            }


            System.out.println("Do you want to continue booking more flights? Insert 'finish' to end the program or" +
                    " any value to procede");
            bandera = teclado2.next();
        }


    }
}
