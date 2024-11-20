package body_imc;

import java.util.Scanner;

public class Bmiview {

    private Scanner scanner = new Scanner(System.in);

    public double solicitarPeso() {
        double peso = -1;
        while (peso <= 0) { 
            try {
                System.out.print("Ingrese su peso en kilogramos (ejemplo: 70.5): ");
                peso = Double.parseDouble(scanner.nextLine());
                if (peso <= 0) {
                    System.out.println("El peso debe ser mayor a 0. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
        return peso;
    }

    public double solicitarAltura() {
        double altura = -1;
        while (altura <= 0) { 
            try {
                System.out.print("Ingrese su altura en metros (ejemplo: 1.75): ");
                altura = Double.parseDouble(scanner.nextLine());
                if (altura <= 0) {
                    System.out.println("La altura debe ser mayor a 0. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
        return altura;
    }

    
    public void mostrarResultado(String clasificacion, double imc) {
        System.out.printf("Su IMC es %.2f y su clasificación es: %s%n", imc, clasificacion);
    }
}