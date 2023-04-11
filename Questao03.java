import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args) {
        Scanner objScanner= new Scanner(System.in);
        String nome, sobrenome;

        System.out.printf("Nome:");
        nome= objScanner.next();
        System.out.printf("Sobrenome:");
        sobrenome= objScanner.next().toLowerCase().trim();

        if(sobrenome.intern().equals("wayne")){
            System.out.printf("Acesso liberado, Sr Wayne.");
        }else if(sobrenome.intern().equals("kent")){
            System.out.printf("Sai daí, mané!");
        }else if(sobrenome.intern().equals("diana")){
            System.out.printf("Bem vinda, Princesa de Themyscara.");
        }else{
            System.out.printf("Cai fora.");
        }
    }
}