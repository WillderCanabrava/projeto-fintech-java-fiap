package br.com.fintech.model;

import java.util.Scanner;

public class Login {

    Scanner sc = new Scanner(System.in);

    private String username;
    private String password;
    int count = 1;

    public Login() {
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void showAccessScreen() {
        System.out.println("Username: ");
        username = sc.nextLine();
        System.out.println("Senha: ");
        password = sc.nextLine();
    }


    public void accessLogin() {
        while(!username.equals("luissouza@fintech.com") && password.equals("Fintech1234!") || (count <= 2)) {
            System.out.println("Username ou senha inválido! Você tem mais " + (3 - count) + " tentativas.");
            count++;
            showAccessScreen();
        }
        if (username.equals("luissouza@fintech.com") && (password.equals("Fintech1234!"))) {

            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Acesso bloqueado!");
        }

        sc.close();
    }
}
