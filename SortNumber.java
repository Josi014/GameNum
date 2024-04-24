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
            ten=0;

            Random gerador = new Random();
            for (int v = 0; v < 3; v++) {
                numSort[v] = gerador.nextInt(10);
            }
            for (int j = 0; j < numSort.length; j++) {
                for (int i = 0; i < 1; i++) {
                    if (numSort[j] == 0) {
                        System.out.println("O número de três digitos sorteado possui algarismos com a letra Z");
                    }
                    if (numSort[j] == 1) {
                        System.out.println("O número de três digitos sorteado possui algarismos com a letra U ");
                    }
                    if (numSort[j] == 2) {
                        System.out.println("O número de três digitos sorteado possui algarismos com a letra D");
                    }
                    if (numSort[j] == 3) {
                        System.out.println("O número de três digitos sorteado possui algarismos com a letra T");
                    }
                    if (numSort[j] == 4) {
                        System.out.println("O número de três digitos sorteado possui algarismos com a letra Q");
                    }
                    if (numSort[j] == 5) {
                        System.out.println("O número de três digitos sorteado possui algarismos com a letra C");
                    }
                    if (numSort[j] == 6) {
                        System.out.println("O número de três digitos sorteado possui algarismos com a letra S");
                    }
                    if (numSort[j] == 7) {
                        System.out.println("O número de três digitos sorteado possui algarismos com as letras S e T");
                    }
                    if (numSort[j] == 8) {
                        System.out.println("O número de três digitos sorteado possui algarismos com a letra O");
                    }
                    if (numSort[j] == 9) {
                        System.out.println("O número de três digitos sorteado possui algarismos com a letra N");
                    }
                }

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