import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Questão 1
        //Um motorista precisa abastecer seu carro para uma viagem. O carro tem um consumo médio de combustível
        // de 12 km por litro e o motorista planeja percorrer uma distância de 360 km. Crie um programa que
        // solicite o preço do combustível por litro ao usuário e calcule o custo total da viagem. Além disso,
        // informe quantos litros de combustível serão necessários para completar a viagem.

        //Primeiro foi criado um Scanner
        Scanner input = new Scanner(System.in);

        //Depois pedido para o usuário informar o preço do combustível
        System.out.println("Qual é o preço do combustível por litro?");
        String preco = input.nextLine();

        //Depois foi pedido para ser informada a distância da viagem
        System.out.println("Qual a distancia da viagem?");
        String distancia = input.nextLine();

        //Em seguida, criou-se as variáveis e transformadas em float para calcular
        //o preço total da viagem e a quantidade de combustível necessária
        float combustivel = Float.parseFloat(distancia) / 12;
        float precoTotal = combustivel * Float.parseFloat(preco);

        //Por fim, foi devolvido para o usuário o preço total da viagem e
        // a quantidade de combustível necessária
        System.out.printf("O preço total da viagem é de: %.2f\n", precoTotal);
        System.out.println("Quantidade de combustível necessária: " + combustivel);



    }
}