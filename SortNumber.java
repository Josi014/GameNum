import java.util.Random;
import java.util.Scanner;

public class SortNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numSort = new int[3];
        int[] digite = new int[3];
        boolean errou = true;
        int ten = 0;

        while (errou) {

            Random gerador = new Random();
            for (int v = 0; v < 3; v++) {
                numSort[v] = gerador.nextInt(10);
            }

            for (int i = 0; i < numSort.length; i++) {
                if (numSort[i] == 0) {
                    System.out.println("O número de três digitos sorteado possui algarismos com a letra Z");
                }
                if (numSort[i] == 1) {
                    System.out.println("O número de três digitos sorteado possui algarismos com a letra U ");
                }
                if (numSort[i] == 2) {
                    System.out.println("O número de três digitos sorteado possui algarismos com a letra D");
                }
                if (numSort[i] == 3) {
                    System.out.println("O número de três digitos sorteado possui algarismos com a letra T");
                }
                if (numSort[i] == 4) {
                    System.out.println("O número de três digitos sorteado possui algarismos com a letra Q");
                }
                if (numSort[i] == 5) {
                    System.out.println("O número de três digitos sorteado possui algarismos com a letra C");
                }
                if (numSort[i] == 6) {
                    System.out.println("O número de três digitos sorteado possui algarismos com a letra S");
                }
                if (numSort[i] == 7) {
                    System.out.println("O número de três digitos sorteado possui algarismos com as letras S e T");
                }
                if (numSort[i] == 8) {
                    System.out.println("O número de três digitos sorteado possui algarismos com a letra O");
                }
                if (numSort[i] == 9) {
                    System.out.println("O número de três digitos sorteado possui algarismos com a letra N");
                }
            }

            for (int j = 0; j < numSort.length; j++) {
                System.out.println("Dê seu chute");
                digite[j] = sc.nextInt();
                if (digite[j] != numSort[j]) {
                    System.out.println("Ops, tente novamente");
                    j--;
                    if (ten == 1) {
                        break;
                    }
                    ten = 1;
                } else if (digite[j] == (numSort[j]) && j < 2) {
                    System.out.println("Isso ai, esta no caminho");
                }

            }

            if (digite[0] == numSort[0] && digite[1] == numSort[1] && digite[2] == numSort[2]) {
                System.out.println("Você acertou!Parabéns :)");
                errou = false;
            } else {
                System.out.println("Não foi desta vez :(");

            }
        }
    }

}