package com.mycompany.java.exercises;
import java.util.Scanner;

public class IMC{
    public static void main(String[] args) {
        double altura, peso, imc;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a altura em m: ");
        altura = input.nextDouble();
        
        System.out.print("Digite o peso em kg: ");
        peso = input.nextDouble();
        
        imc = peso/(altura*altura);
        
        if (imc < 18.5){
            System.out.println("IMC: "+imc+ " Abaixo do peso");
        
        }else if (imc >=18.5 && imc <25){
            System.out.println("IMC: "+imc+ " Peso normal");
            
        }else if (imc >= 25 && imc <30){
            System.out.println("IMC: "+imc+" Sobrepeso");
            
        }else if (imc >= 30 && imc <40){
            System.out.println("IMC: "+imc+" Obesidade");
            
        }else{
            System.out.println("IMC: "+imc+" Obesidade Grave");
        }   

    }
}
