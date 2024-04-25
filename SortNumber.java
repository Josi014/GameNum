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
            ten = 0;
            Random gerador = new Random();
            for (int v = 0; v < 3; v++) {
                numSort[v] = gerador.nextInt(10);
            }
            for (int j = 0; j < numSort.length; j++) {
                String fraseSorteada = "";
                for (int i = 0; i < 1; i++) {

                    String[] frases = {
                            "O número de três digitos sorteado possui um algarismo com a letra Z",
                            "O número de três digitos sorteado possui um algarismo entre -1 e 1",
                            "O número de três digitos sorteado possui um algarismo com a letra U",
                            "O número de três digitos sorteado possui um algarismo entre 0 e 2",
                            "O número de três digitos sorteado possui um algarismo com a letra D",
                            "O número de três digitos sorteado possui um algarismo entre 1 e 3",
                            "O número de três digitos sorteado possui um algarismo com a letra T",
                            "O número de três digitos sorteado possui um algarismo entre 2 e 4",
                            "O número de três digitos sorteado possui um algarismo com a letra Q",
                            "O número de três digitos sorteado possui um algarismo entre 3 e 5",
                            "O número de três digitos sorteado possui um algarismo com a letra C",
                            "O número de três digitos sorteado possui um algarismo entre 4 e 6",
                            "O número de três digitos sorteado possui um algarismo com a letra S",
                            "O número de três digitos sorteado possui um algarismo entre 5 e 7",
                            "O número de três digitos sorteado possui um algarismo com as letras S e T",
                            "O número de três digitos sorteado possui um algarismo entre 6 e 8",
                            "O número de três digitos sorteado possui um algarismo com a letra O",
                            "O número de três digitos sorteado possui um algarismo entre 7 e 9",
                            "O número de três digitos sorteado possui um algarismo com a letra N",
                            "O número de três digitos sorteado possui um algarismo entre 8 e 10"

                    };

                    if (numSort[j] == 0 && ten == 0) {
                        fraseSorteada = frases[0];
                    } else if (numSort[j] == 0 && ten == 1) {
                        fraseSorteada = frases[1];
                        ten = 2;
                    } else if (numSort[j] == 1 && ten == 0) {
                        fraseSorteada = frases[2];
                    } else if (numSort[j] == 1 && ten == 1) {
                        fraseSorteada = frases[3];
                        ten = 2;
                    } else if (numSort[j] == 2 && ten == 0) {
                        fraseSorteada = frases[4];
                    } else if (numSort[j] == 2 && ten == 1) {
                        fraseSorteada = frases[5];
                        ten = 2;
                    } else if (numSort[j] == 3 && ten == 0) {
                        fraseSorteada = frases[6];
                    } else if (numSort[j] == 3 && ten == 1) {
                        fraseSorteada = frases[7];
                        ten = 2;
                    } else if (numSort[j] == 4 && ten == 0) {
                        fraseSorteada = frases[8];
                    } else if (numSort[j] == 4 && ten == 1) {
                        fraseSorteada = frases[9];
                        ten = 2;
                    } else if (numSort[j] == 5 && ten == 0) {
                        fraseSorteada = frases[10];
                    } else if (numSort[j] == 5 && ten == 1) {
                        fraseSorteada = frases[11];
                        ten = 2;
                    } else if (numSort[j] == 6 && ten == 0) {
                        fraseSorteada = frases[12];
                    } else if (numSort[j] == 6 && ten == 1) {
                        fraseSorteada = frases[13];
                        ten = 2;
                    } else if (numSort[j] == 7 && ten == 0) {
                        fraseSorteada = frases[14];
                    } else if (numSort[j] == 7 && ten == 1) {
                        fraseSorteada = frases[15];
                        ten = 2;
                    } else if (numSort[j] == 8 && ten == 0) {
                        fraseSorteada = frases[16];
                    } else if (numSort[j] == 8 && ten == 1) {
                        fraseSorteada = frases[17];
                        ten = 2;
                    } else if (numSort[j] == 9 && ten == 0) {
                        fraseSorteada = frases[18];
                    } else if (numSort[j] == 9 && ten == 1) {
                        fraseSorteada = frases[19];
                        ten = 2;
                    }

                }
                System.out.println(fraseSorteada);
                System.out.println("Dê seu chute");
                digite[j] = sc.nextInt();
                if (digite[j] != numSort[j]) { 
                    System.out.println("Ops, tente novamente");
                    j--;
                    if (ten == 2) {
                        break;
                    }
                    ten = 1;
                } else if (digite[j] == (numSort[j]) && j < 2) {
                    System.out.println("Isso ai, esta no caminho");
                }

            }

            if (digite[0] == numSort[0] && digite[1] == numSort[1] && digite[2] == numSort[2]) {
                System.out.println("Você acertou,o número sorteado era: ");
                for (int ler = 0; ler < 3; ler++) {
                    System.out.println(numSort[ler]);
                }
                System.out.println("!Parabéns :)");
                errou = false;
            } else {
                System.out.println("Não foi desta vez :(");

            }
        }
        sc.close();
    }

}