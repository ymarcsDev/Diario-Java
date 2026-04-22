package Enquanto;

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha, senhavdd;
        senhavdd = 2022;

        System.out.println("Digite a senha");
        senha = sc.nextInt();

        while (senha != senhavdd) {
            System.out.println("Senha incorreta digite novamente");
            senha = sc.nextInt();
            if (senha == 2022) {
                System.out.println("Acesso permitido");
            }
        }

    }
}
