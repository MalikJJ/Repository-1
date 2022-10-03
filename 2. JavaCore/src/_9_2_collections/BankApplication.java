package _9_2_collections;

import java.util.ArrayList;

public class BankApplication {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();
    public BankApplication(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(int i) {
        accounts.remove(i);
    }
    public Account getMaxAccount() {                    /////
        double maxBalance = Integer.MIN_VALUE;
        int indexOfMaxBalanceAccount = -1;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getBalance() > maxBalance) {
                maxBalance = accounts.get(i).getBalance();
                indexOfMaxBalanceAccount = i;
            }
        }
        return accounts.get(indexOfMaxBalanceAccount);
    }
    public Double getAverageBalance() {
        double sumOfBalance = 0;
        for (int i = 0; i < accounts.size(); i++) {
            sumOfBalance += accounts.get(i).getBalance();
        }
        return sumOfBalance / accounts.size();
    }
    public Double getTotalBalance() {
        double sumOfBalance = 0;
        for (int i = 0; i < accounts.size(); i++) {
            sumOfBalance += accounts.get(i).getBalance();
        }
        return sumOfBalance;
    }
    public int totalAccounts() {
        return accounts.size();
    }
    public String getBankData() {
        return "Bank, name " + name +
                ", number of accounts " + accounts.size() +
                ", sum of balance = " + getTotalBalance() + " USD" +
                ", average balance = " + getAverageBalance() + " USD";
    }
}

//=============================================================================

