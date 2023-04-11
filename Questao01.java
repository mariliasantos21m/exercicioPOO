import java.lang.Math;
import java.util.Scanner;
class Calculadora{
    public float soma(float num1, float num2){
        return num1+num2;
    }
    public float subtracao(float num1, float num2){
        return num1-num2;
    }
    public float divisao(float num1, float num2){
        return num1/num2;
    }
    public float multiplicacao(float num1, float num2){
        return num1*num2;
    }
    public double potencia(float num1, float num2){
        return Math.pow(num1, num2);
    }
    public double raiz(float num1, int tipoRaiz){
        if(tipoRaiz ==2){
            return Math.sqrt(num1);
        }else{
            return Math.round(Math.pow(num1, 0.333));
        }
    }
}

public class Questao01 {
    public static void main(String[] args) {
        Scanner objScanner= new Scanner(System.in);
        Calculadora calctest= new Calculadora();
        int operacao;
        float num1, num2;

        System.out.printf("1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão\n" +
                "5-Raiz Quadrada\n6-Raiz Cúbica\n7-Potência\nDigite a operação:");
        operacao= objScanner.nextInt();
        if(operacao==5 || operacao==6){
            System.out.printf("Número:");
            num1= objScanner.nextFloat();
            num2=0;
        }else{
            System.out.printf("Número 1:");
            num1= objScanner.nextFloat();

            System.out.printf("Número 2:");
            num2= objScanner.nextFloat();

            if(num2==0 && operacao==4){
                System.out.printf("Divisão por zero inválida. Digite outro número:");
                num2= objScanner.nextFloat();
            }
        }

        switch (operacao){
            case 1:
                System.out.printf("%.1f + %.1f= %.1f", num1, num2 ,calctest.soma(num1, num2));
                break;
            case 2:
                System.out.printf("%.1f - %.1f= %.1f", num1, num2, calctest.subtracao(num1, num2));
                break;
            case 3:
                System.out.printf("%.1f x %.1f= %.1f", num1, num2, calctest.multiplicacao(num1, num2));
                break;
            case 4:
                System.out.printf("%.1f / %.1f= %.1f", num1, num2,calctest.divisao(num1, num2));
                break;
            case 5:
                System.out.printf("Raiz quadrada de %.1f: %.1f", num1, calctest.raiz(num1, 2));
                break;
            case 6:
                System.out.printf("Raiz cúbica de %.1f: %.1f", num1, calctest.raiz(num1, 3));
                break;
            case 7:
                System.out.printf("%.1f^%.1f= %.1f", num1, num2, calctest.potencia(num1, num2));
                break;
            default:
                System.out.printf("Operação inválida");
        }
    }
}