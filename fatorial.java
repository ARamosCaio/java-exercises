package com.mycompany.java.exercises;
import java.util.Scanner;

public class fatorial {

    public static void main(String args[]) {
        int v1, v2=1, fatrec=0, s;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        v1 = input.nextInt();
        s= v1;

        if (v1 == 0 || v1 == 1){
            fatrec = 1;
            System.out.println(String.format("Fatorial de %s: %s", v1, fatrec));

        }else{
            while (v1>1){
                fatrec = v1*v2;
                v2 = fatrec;
                v1--;            
        }
            System.out.println(String.format("Fatorial de %s: %s", s, fatrec));
        }    
    }
}
