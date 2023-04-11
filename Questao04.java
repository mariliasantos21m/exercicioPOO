import java.util.Scanner;
import java.lang.Math;

class CalculaRaiz{
    public double raizQuadrada(float num){
        return Math.sqrt(num);
    }
    public double raizCubica(float num){
        return Math.pow(num, (0.333));
    }
}

public class Questao04 {
    public static void main(String[] args) {
        CalculaRaiz objCalculaRaiz= new CalculaRaiz();
        Scanner objScanner= new Scanner(System.in);
        float num;

        System.out.printf("Número:");
        num= objScanner.nextFloat();

        if(num%2 ==0){
            System.out.printf("Raiz cúbica: %.1f", objCalculaRaiz.raizCubica(num));
        }else{
            System.out.printf("Raiz quadrada: %.1f", objCalculaRaiz.raizQuadrada(num));
        }
    }
}