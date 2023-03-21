package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
       int aluno = 1;
       double idade, soma_idade=0;
       int cnt = 0;
       Scanner entrada = new Scanner(System.in);
       do
        {
            System.out.println("Aluno "+ aluno);
            System.out.print("Digite a sua idade: ");
            idade = entrada.nextDouble();
            if (idade >= 16){
                cnt++;
            } else {
                soma_idade += idade;
            }
            aluno ++;
        } while (aluno <= 10);
       System.out.println("A quantidade de alunos que podem ser eleitores é: "+ cnt);
       double media = soma_idade/(double)(10-cnt);
       System.out.println("A média das idades dos alunos que não podem ser eleitores é; "+ media);
       
       
    }
    
}
