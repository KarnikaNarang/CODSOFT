import java.util.*;
class BankAccount{
    double balance;
    
    BankAccount(double balance)
    {
        if(balance>0)
        this.balance=balance;
        else
        {
        this.balance=0;
        System.out.println("Invalid Balance Entered. Setting balance to 0.");
        }
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount)
    {
        if (amount>0) {
            balance=balance+amount;
            
        }
    }

    void withdraw(double amount){
        if (amount>0 && amount<=balance) {
            balance=balance-amount;
        }
    }
}



class ATM
{
    BankAccount ob;
    ATM(BankAccount ob){
        this.ob=ob;
    }
    void choose()
    {
        System.out.println("Welcome to the ATM Machine: ");
        System.out.println("Press 1 to Check your balance");
        System.out.println("Press 2 to Deposit Money");
        System.out.println("Press 3 to Withdraw money");
        System.out.println("Press 4 to Exit");
    }

    void balance()
    {
        double bal=ob.getBalance();
        System.out.println("Your Balance is : "+bal);
        System.out.println();
    }

    void deposit(double amount){
        if( amount > 0){
            ob.deposit(amount);
            System.out.println("Amount " + amount +" Successfully Deposited");
            System.out.println();
        }
        else{
            System.out.println("Invalid amount");
            System.out.println();
        }
    }

    void withdraw(double amount){
        double bal=ob.getBalance();
        if (amount>0 && amount<=bal) {
            ob.withdraw(amount);
            System.out.println("Amount "+ amount + "Successfully Withdrawn");
            System.out.println();
        }
        else if(amount<0)
        {
            System.out.println("Invalid Amount Entered");
            System.out.println();
        }
        else{
            System.out.println("Insuffient Balance");
            System.out.println();
        }
    }
}

class task3 {

public static void main(String args[])
{
    BankAccount ob= new BankAccount(100000);
    ATM ob2=new ATM(ob);
    Scanner sc=new Scanner(System.in);
    while (true) {
        
    ob2.choose();
    System.out.println("Enter Your Choice");
    int ch=sc.nextInt();

    switch (ch) {
        case 1:
            ob2.balance();
            break;
        
        case 2:
            double amt;
            System.out.println("Enter the amount to deposit");
            amt=sc.nextDouble();
            ob2.deposit(amt);
            break;

        case 3:
            double withdrawamt;
            System.out.println("Enter the amount to be withdrawn");
            withdrawamt=sc.nextDouble();
            ob2.withdraw(withdrawamt);
            break;
        
        case 4:
            System.out.println("Thankyou for using our ATM. Have a nice Day");
            return;

    
        default:
            System.out.println("You have entered a wrong choice!");
            break;
    }
}
}
}