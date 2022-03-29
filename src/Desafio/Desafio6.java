package Desafio;
import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {

        //complete os espaços em branco com sua solução para o problema

        Scanner scan = new Scanner(System.in);
        int inicio, fim, horas;
        inicio = scan.nextInt();
        fim = scan.nextInt();
        horas = fim - inicio;

        if(horas == 0){
            System.out.print("O JOGO DUROU 24 HORA(S)\n");
        }else if(horas < 0 ){
            System.out.printf("O JOGO DUROU %d HORA(S)\n" , (24 - inicio + fim));
        }
        else{
            System.out.printf("O JOGO DUROU %d HORA(S)\n" , horas);
        }
        scan.close();
    }
}
