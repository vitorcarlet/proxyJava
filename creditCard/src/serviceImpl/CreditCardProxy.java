package serviceImpl;

import service.BankAccount;
import service.CreditCard;

public class CreditCardProxy implements CreditCard {
    private BankAccount bankAccount;

    public CreditCardProxy(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void makePayment(double amount) {
        // Verifica se há saldo suficiente na conta antes de realizar o pagamento
        if (bankAccount.getBalance() >= amount) {
            bankAccount.withdraw(amount);
            System.out.println("Payment of $" + amount + " processed via debit card.");
        } else if(bankAccount.getLimit() >= amount){
            System.out.println("Payment of $" + amount + " processed via credit card.");
        }
    }
}