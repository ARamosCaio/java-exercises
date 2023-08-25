package com.mycompany.java.exercises;
import java.util.Scanner;

public class IMC{
    public static void main(String[] args) {
        double altura, peso, imc, pMin, pMax;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a altura em m: ");
        altura = input.nextDouble();
        
        System.out.print("Digite o peso em kg: ");
        peso = input.nextDouble();
        
        imc = peso/(altura*altura);
        pMin = 18.5*(altura*altura);
        pMax = 25*(altura*altura);
        
        
        if (imc < 18.5){
            var message = String.format("IMC: %.2f - Abaixo do peso", imc);
            System.out.println(message);
        
        }else if (imc >=18.5 && imc <25){
            var message = String.format("IMC: %.2f - Peso Normal", imc);
            System.out.println(message);
            
        }else if (imc >= 25 && imc <30){
            var message = String.format("IMC: %.2f - Sobrepeso", imc);
            System.out.println(message);
            
        }else if (imc >= 30 && imc <40){
            var message = String.format("IMC: %.2f - Obesidade", imc);
            System.out.println(message);
            
        }else{
            var message = String.format("IMC: %.2f - Obesidade Grave", imc);
            System.out.println(message);
        }   
        var message = String.format("Seu peso ideal é entre %.2f kg e %.2f kg", pMin, pMax);
        System.out.println(message);
        
    }
}
