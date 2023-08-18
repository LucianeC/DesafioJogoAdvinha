import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas <5){
            System.out.print("Digite um número entre e 100: ");
            int mumeroDigitado = leitor.nextInt();
            tentativas++;

            if (mumeroDigitado == numeroGerado){
                System.out.println("Parabéns, você acertou em " + tentativas + " tentativas");
                break; //encerra o loop while
            }
            else if (mumeroDigitado < numeroGerado){
                System.out.println("O número digitado é menor que o número gerado. Você já usou " + tentativas + " tentativas");
            }
            else {
                System.out.println("O número digitado é maior que o número gerado. Você já usou " + tentativas + " tentativas" );
            }
        }
        if (tentativas == 5 ){
            System.out.println("Voce não conseguiu advinhar o número gerado! O número gerado foi:" + numeroGerado);
        }
    }
}