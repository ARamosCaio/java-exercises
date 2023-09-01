package com.mycompany.java.exercises;
import java.util.Scanner;

public class AnosParaDias {

    public static void main(String args[]) {
        int idade_em_dias, idade;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua idade em anos: ");
               
        idade = input.nextInt();
        idade_em_dias = idade*365;
        
        System.out.println(String.format("Voce tem %s dias de idade", idade_em_dias));
    }
}
