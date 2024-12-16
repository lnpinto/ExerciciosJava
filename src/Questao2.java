import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        //Questão 2
        //Dada uma turma de alunos com N alunos, sendo que essa quantidade deve ser solicitada e
        //definida pelo usuário, solicite o nome e a nota de cada um dos alunos. Seu programa deve
        //imprimir apenas aqueles alunos que tiraram nota maior que a média da nota de todos os alunos.

        //Primeiro foi criado um Scanner
        Scanner input = new Scanner(System.in);

        //Depois foi pedido para ser informada a quantidade de alunos
        System.out.println("Quantos alunos há na turma?");
        int qntAlunos = input.nextInt();

        //Em seguida foram criados arrays para os nomes e as notas dos alunos
        String[] nomes = new String[qntAlunos];
        double[] notas = new double[qntAlunos];

        //Foi criada uma variável para armazenar a soma das notas
        double somaNotas = 0;



        for (int i = 0; i < qntAlunos; i++) {
            input.nextLine();
            //Depois foi pedido para ser informados os nomes dos alunos
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = input.nextLine();
            //Depois foi pedido para ser informada a nota do aluno
            System.out.print("Digite a nota do aluno: ");
            notas[i] = input.nextDouble();

            //As notas foram somadas em uma variável
            somaNotas += notas[i];


            }

        //Foi criada uma variável para armazenar a média das notas
        double mediaNotas = somaNotas / qntAlunos;

        //Foi feito um for para ver se a nota do aluno era maior que a média das notas
        for (int i = 0; i < qntAlunos; i++) {
            if (notas[i] >= mediaNotas) {
                //Se a nota do aluno era maior que a média das notas, ele foi impresso
                System.out.println("Aluna(o): " + nomes[i]);
                System.out.println("Nota: " + notas[i]);
            }

        }

    }

}