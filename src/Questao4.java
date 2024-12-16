import java.util.Scanner;


public class Questao4 {

    public static void main(String[] args) {

        //Questão 4 Um número para ser considerado primo deve ser divisível apenas por 1 e ele mesmo.
        //Considerando isso, crie um programa que vai solicitar um número para o usuário e dizer se ele é primo.

        //Primeiro foi criado um Scanner
        Scanner input = new Scanner(System.in);

        //Depois foi pedido para ser informado um número
        System.out.println("Digite um número: ");
        int num = input.nextInt();

        //Se o número for menor que 2, ele não é primo
        if (num < 2) {
            System.out.println("Número invalido");
        } else if (num == 2) {                          //Se o número for 2, ele é primo
            System.out.println("Esse número é primo");

        } else {                                        //Depois foi feito um for para ver se o número é primo
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {                    //Se o número for divisível por outro número, ele não é primo
                    System.out.println("Esse número não é primo");
                    break;

                } else {                                //Mas se ele não for divisível por nenhum outro número, ele é primo
                    System.out.println("Esse número é primo");
                    break;
                }

            }



}

    }

}

