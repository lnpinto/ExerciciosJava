import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        //Questão 3
        //
        //Uma família está dividindo uma pizza entre seus membros. Crie um programa que solicite o número
        //de membros da família e o número de fatias da pizza. O programa deve calcular quantas fatias cada
        //membro vai receber, e informar se haverá sobras e quantas fatias sobrarão. Se a pizza não puder ser
        //igualmente dividida, o programa deve sugerir quantas fatias adicionais são necessárias para que todos
        //recebam a mesma quantidade.

        //Primeiro foi criado um Scanner
        Scanner input = new Scanner(System.in);

        //Depois foi pedido para ser informada a quantidade de membros da familia
        System.out.println("Quantos membros da familia?");
        int qntMembros = input.nextInt();

        //Depois foi pedido para ser informada a quantidade de fatias da pizza
        System.out.println("Quantas fatias da pizza?");
        int qntFatias = input.nextInt();

        //Em seguida, criou-se as variáveis e transformadas em float para calcular
        //o número de fatias e a quantidade de sobras
        int fatias = qntFatias / qntMembros;
        int sobras = qntFatias % qntMembros;

        //Por fim, foi devolvido para o usuário o número de fatias e a quantidade de sobras
        System.out.println("Quantidade de fatias: " + fatias);
        //Foi feito um if para ver se houve sobras
        if (sobras == 0) {
            System.out.println("Nao sobrou nenhuma fatia.");
        } else if (sobras > 0) {
            System.out.println("Sobrou " + sobras + " fatias.");
            int n = qntMembros - sobras;
            System.out.println("É preciso " + n + " fatias para que todos recebam a mesma quantidade de fatias.");

        }

    }
}
