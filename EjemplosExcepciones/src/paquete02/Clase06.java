/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class Clase06 {

    public static void main(String[] args) {
        System.out.println("Ingrese valor 1:");
        int valor1 = escribirNumero();
        System.out.println("Ingrese valor 2:");
        int valor2 = escribirNumero();
        int suma = obtenerSuma(valor1, valor2);
        imprimirReporte(valor1, valor2, suma);
    }

    public static int escribirNumero() {
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        boolean bandera = true;
        while (bandera)
        try {
            num = entrada.nextInt();
            if (num % 2 != 0 || num < 0) {
                throw new Exception("Número Incorrecto");
            } else {
                bandera = false;
            }
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
            System.out.println("Ingrese Nuevamente:");
        }
        return num;
    }

    public static int obtenerSuma(int v1, int v2) {
        int sum = v1 + v2;
        return sum;
    }

    public static void imprimirReporte(int v1, int v2, int sum) {
        System.out.printf("El resultado de la operacion %d + %d es %d\n",
                v1, v2, sum);

    }

}
