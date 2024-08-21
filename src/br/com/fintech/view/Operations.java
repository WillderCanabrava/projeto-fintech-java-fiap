package br.com.fintech.view;


import br.com.fintech.model.Invest;
import br.com.fintech.model.Login;

public class Operations {
    public static void main(String[] args) {

        Invest invest = new Invest();
        double investment = invest.doInvest(1000,0.03,4);
        System.out.println("Seu rendimento é de: R$" + investment);

        Login login = new Login();
        login.showAccessScreen();
        login.accessLogin();

    }
}