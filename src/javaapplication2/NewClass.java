package javaapplication2;
import java.util.Scanner;
public class NewClass {
    
    public static void main(String[] args) {
        String senha_str, senha_sistema = "QWERTY5";
        int tentativas = 1;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Digite sua senha: ");
            senha_str = entrada.nextLine();
            if (!senha_str.equals(senha_sistema)) {
                System.out.println("Senha inválida.");
                tentativas++;
                if (tentativas==4){
                     System.out.println("Suas tentativas acabaram.");
                }
            } else {
                System.out.println("Acesso liberado");
                break;
            }
        } while (tentativas <= 3);
    } 
}
