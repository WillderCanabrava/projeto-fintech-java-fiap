package br.com.fintech.model;

public class Invest {

    double investedValue;
    double totalAccount;
    double rate;
    int time;

    public Invest() {
    }

    public Invest(double investedValue, double totalAccount, double rate, int time) {
        this.investedValue = investedValue;
        this.totalAccount = totalAccount;
        this.rate = rate;
        this.time = time;
    }

    public double doInvest(double investedValue, double rate, int time) {
        double amount = investedValue * rate * time;
        totalAccount-= investedValue;
        return amount;
    }

}
