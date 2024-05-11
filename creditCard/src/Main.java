import service.BankAccount;
import service.CreditCard;
import serviceImpl.CreditCardProxy;
import serviceImpl.RealBankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new RealBankAccount(500,2000);


        CreditCard creditCard = new CreditCardProxy(bankAccount);



        creditCard.makePayment(300);


        creditCard.makePayment(400);
    }
}