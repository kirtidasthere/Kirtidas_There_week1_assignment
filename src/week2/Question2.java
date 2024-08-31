package week2;


class BankAccount
{
    private double balance;
    public BankAccount(double initialBalance)
    {
        this.balance=initialBalance;
    }

    public void deposit(double amount)
    {
        if(amount >0)
        {
            balance=balance + amount;
            System.out.println("Deposited: "+amount);
        }
        else
        {
            System.out.println("Deposite amount must be positive");
        }

    }

    public void withdrawal(double amount)
    {
        if(amount >0 && amount <= balance)
        {
            balance=balance - amount;
            System.out.println("Withdrawn: "+amount);
        }
        else if (amount > balance)
        {
            System.out.println("Insufficient balance.");
        }
        else
        {
            System.out.println("Withdrawn amount must be positive");
        }
    }
    public void displayBalance()
    {
        System.out.println("Current Balance: "+balance);
    }
}
public class Question2 {
    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount(500.00);

        bankAccount.deposit(150);
        bankAccount.withdrawal(50);
        bankAccount.displayBalance();

    }
}
