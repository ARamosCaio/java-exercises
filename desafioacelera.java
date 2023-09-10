package com.mycompany.java.exercises;
import java.util.Scanner;
public class CincoPatinhos {

    public static void main(String args[]) {
        int p;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de patinhos: ");
        p = input.nextInt();
        
        while (p>2){
            System.out.println(String.format("%s patinhos foram passear, além das montanhas para brincar, a mamãe gritou quá quá quá quá, mas só %s patinhos voltaram de lá", p, (p-1)));
            p = p-1;
        }
        System.out.println("Dois patinhos foram passear, Além das montanhas Para brincar, A mamãe gritou: Quá, quá, quá, quá, Mas só um patinho voltou de lá");
        System.out.println("Um patinho foi passear, além das montanhas para brincar, a mamãe gritou: Quá, quá, quá, quá, Mas nenhum patinho voltou de lá");
    }
}
