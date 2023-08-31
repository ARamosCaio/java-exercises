package com.mycompany.java.exercises;
import java.util.Scanner;

public class Temperatura {

    public static void main(String args[]) {
        double C, K, F;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Insira a Temperatura em Celsius: ");
        C = input.nextDouble();
        K = C + 273;
        F = (1.8*C) + 32;
        
        System.out.println(String.format("Temperatura em Kelvin: %.2f", K));
        System.out.println(String.format("Temperatura em Farenheit: %.2f", F));
       
    }
}
