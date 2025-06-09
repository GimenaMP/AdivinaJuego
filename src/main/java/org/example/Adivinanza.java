package org.example;

import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        Adivinanza adivinanza = new Adivinanza();
        System.out.println("Bienvenido al juego de adivinanza");
        adivinanza.jugar();
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100) + 1; // +1 para que sea 1-100
        int intentosRestantes = 5;
        boolean adivinado = false;

        while (intentosRestantes > 0 && !adivinado) {
            System.out.println("Te quedan " + intentosRestantes + " intentos");
            System.out.println("Ingresa un número entre 1 y 100:");

            int numero = scanner.nextInt();

            if (numero < 1 || numero > 100) {
                System.out.println("El número debe estar entre 1 y 100");
                continue; // No cuenta como intento válido
            }

            if (numero == numeroAleatorio) {
                System.out.println("¡Felicidades, adivinaste el número!");
                adivinado = true;
            } else if (numero < numeroAleatorio) {
                System.out.println("El número es mayor");
                intentosRestantes--;
            } else {
                System.out.println("El número es menor");
                intentosRestantes--;
            }
        }

        if (!adivinado) {
            System.out.println("¡Se acabaron los intentos! El número era: " + numeroAleatorio);
        }

        scanner.close();
    }
}