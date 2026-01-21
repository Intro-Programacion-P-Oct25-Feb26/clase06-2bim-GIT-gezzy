/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes﻿​_
 */
public class Ejemplo051 {

    public static void main(String[] args) {
        boolean bandera = true;
        
        while (bandera) {
            try {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese valor 1:");
                int valor1 = entrada.nextInt(); // se espera un valor entero 
                System.out.println("Ingrese valor 2:");
                int valor2 = entrada.nextInt(); // se espera un valor entero // 0
                int resultado = valor1 / valor2;

                System.out.printf("Resultado %d\n", resultado);
                bandera = false;
                /*
                El codigo se ejecuta y sigue funcionando hasta que el usuario
                ingrese los datos requeridos, en caso de que lo haga se compara
                la variable bander en el ciclo while y se acaba el programa.
                Por otra parte mientras el usuario ingrese valores no validos
                los catch se encargan de presentar el error del que se trata
                y la bandera no cambia, por lo que el programa sigue funcionando
                hasta que el usuario finalmente inghrese los datos correctos.
                */
            } catch (InputMismatchException inputMismatchException) {

                System.out.printf("Existe un error de tipo %s\n",
                        inputMismatchException);
            } catch (ArithmeticException arithmeticException) {

                System.out.println("Lo sentimos hay un error");
                System.out.printf("De tipo %s\n", arithmeticException);

            }
        }

        System.out.println("Continuamos");

    }
}
