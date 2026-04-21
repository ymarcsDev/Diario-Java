package condicionais;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor;

        System.out.println("Mê de um valor qualquer e lhe direi onde ele se apresenta");
        valor = sc.nextDouble();

        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo entre [0 a 25]");
        } else if (valor >= 25 && valor <= 50) {
            System.out.println("Intervalo entre[25 a 50]");
        } else if (valor >= 50 && valor <= 75) {
            System.out.println("Intervalo entre[50 a 75]");
        } else if (valor >= 75 && valor <= 100) {
            System.out.println("Intervalo entre[75 a 100]");
        } else {
            System.out.println("Valor fora do intervalo");
        }
        sc.close();

    }
}
