package Desafio;
import java.io.IOException;
import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        String [] valores = new String [2];

        valores = leitor . nextLine () . split(" ");

        int valorA = Integer. parseInt(valores[0]);
        int valorB = Integer. parseInt(valores[1]);
        int resto = valorB % valorA;
        int resto2 = valorA % valorB;

        if (resto == 0 || resto2 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");

        }
        leitor.close();
    }

}
