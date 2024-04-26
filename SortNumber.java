import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class SortNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numSort = new int[3];
        int[] digite = new int[3];
        boolean errou = true;

        while (errou) {
            int ten = 0;
            Random gerador = new Random();
            for (int v = 0; v < 3; v++) {
                numSort[v] = gerador.nextInt(10);
            }

            for (int j = 0; j < numSort.length; j++) {
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
                    String fraseSorteada = "";

                    switch (numSort[j]) {
                        case 0:
                            if (ten == 0) {
                                fraseSorteada = frases[0];
                                ten = 1;
                            } else if (ten == 1) {
                                fraseSorteada = frases[1];
                                ten = 2;
                            }
                            break;
                        case 1:
                            if (ten == 0) {
                                fraseSorteada = frases[2];
                                ten = 1;
                            } else if (ten == 1) {
                                fraseSorteada = frases[3];
                                ten = 2;
                            }
                            break;
                        case 2:
                            if (ten == 0) {
                                fraseSorteada = frases[4];
                                ten = 1;
                            } else if (ten == 1) {
                                fraseSorteada = frases[5];
                                ten = 2;
                            }
                            break;

                        case 3:
                            if (ten == 0) {
                                fraseSorteada = frases[6];
                                ten = 1;
                            } else if (ten == 1) {
                                fraseSorteada = frases[7];
                                ten = 2;
                            }
                            break;
                        case 4:
                            if (ten == 0) {
                                fraseSorteada = frases[8];
                                ten = 1;
                            } else if (ten == 1) {
                                fraseSorteada = frases[9];
                                ten = 2;
                            }
                            break;
                        case 5:
                            if (ten == 0) {
                                fraseSorteada = frases[10];
                                ten = 1;
                            } else if (ten == 1) {
                                fraseSorteada = frases[11];
                                ten = 2;
                            }
                            break;
                        case 6:
                            if (ten == 0) {
                                fraseSorteada = frases[12];
                                ten = 1;
                            } else if (ten == 1) {
                                fraseSorteada = frases[13];
                                ten = 2;
                            }
                            break;
                        case 7:
                            if (ten == 0) {
                                fraseSorteada = frases[14];
                                ten = 1;
                            } else if (ten == 1) {
                                fraseSorteada = frases[15];
                                ten = 2;
                            }
                            break;
                        case 8:
                            if (ten == 0) {
                                fraseSorteada = frases[16];
                                ten = 1;
                            } else if (ten == 1) {
                                fraseSorteada = frases[17];
                                ten = 2;
                            }
                            break;
                        case 9:
                            if (ten == 0) {
                                fraseSorteada = frases[18];
                                ten = 1;
                            } else if (ten == 1) {
                                fraseSorteada = frases[19];
                                ten = 2;
                            }
                            break;
                        default:
                            break;
                    }

                    System.out.println(fraseSorteada);
                }

                System.out.println("Dê seu chute");
                digite[j] = sc.nextInt();
                if (digite[j] != numSort[j]) {
                    if (ten == 1) {
                        System.out.println("Ops, tente novamente");
                    }

                    j--;
                    if (ten == 2) {
                        break;
                    }

                } else if (digite[j] == (numSort[j]) && j < 2) {
                    System.out.println("Isso ai, esta no caminho");
                    ten = 0;
                }

            }

            if (digite[0] == numSort[0] && digite[1] == numSort[1] && digite[2] == numSort[2]) {
                System.out.println("Você acertou,o número sorteado era: ");
                lerNum(numSort);
                System.out.println("!Parabéns :)");
                System.out.println(" ");
                errou = false;
            } else {
                System.out.println("Não foi desta vez :(\nO número sorteado era:");
                lerNum(numSort);
                System.out.println(" ");

            }

        }
        sc.close();
    }

    public static void lerNum(int[] numSort) {
        for (int ler = 0; ler < 3; ler++) {
            System.out.println(numSort[ler]);
        }
    }

}
