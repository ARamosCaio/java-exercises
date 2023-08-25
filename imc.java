import java.util.Scanner;
public class Imc {
    public static void main(String args[]){
        double altura, peso, res=0;
        
        Scanner a = new Scanner(System.in);
        
        System.out.print("Insira a altura em m: ");
        altura = a.nextDouble();

        System.out.print("Insira o peso em kg: ");
        peso = a.nextDouble();

        res = peso/altura*altura;
        System.out.println("O IMC calculado é:"+ res);


    }
}
