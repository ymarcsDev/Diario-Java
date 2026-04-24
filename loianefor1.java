package Enquanto;

import java.util.Scanner;

public class loianefor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean infovalidas = false;
        do {

            System.out.println("Entre com o nome de usuario");
            String nomeUser = sc.next();
            System.out.println("Entre com a senha");
            String senha = sc.next();

            if (nomeUser.equalsIgnoreCase(senha)) {
                infovalidas = false;
                System.out.println("Senha igual ao usuario digite novamente");
            } else {
                infovalidas = true;
                System.out.println("Senha e usuarios validos");
            }
        } while (!infovalidas);

    }
}
