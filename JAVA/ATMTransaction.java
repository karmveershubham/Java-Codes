
/*
Assignment:
WAP to demonstrate BankTransaction process?

a.Enter pinNo
  =>pinNo must be available in 1111 or 2222 or 3333,if not 'Invalid pinNo'
       (verify using SubClass 'CheckPinNo')
  =>If the pinNo is wrong for three times then display the msg as "Transaction Blocked...".

b.If the pinNo is correct(verified),then display the following choice:
        1.WithDraw
        2.Deposit

1.WithDraw:
    =>Enter the amt
    =>The amt must be greater than zero and multiples of 100, if not 'Invalid amt"
    =>If the amt is validated then check the amt is less than bal(2000), if not 'Insufficient fund'.
    =>If the amt is less than bal(2000) then pass amt as parameter to the method of WithDraw.

        o/p:
        Amt withDrawn :
        Balance amt   :
        Transaction completed
2.Deposit:
    =>Enter the amt
    =>The amt must be greater than zero and multiples of 100, if not 'Invalid amt"
    =>Pass amt as parameter to the method of Deposit.
         o/p:
         Amt Deposited :
         Balance amt   :
         Transaction completed
*/

import java.util.Scanner;

class CheckPIN 
{
    int pin;
    int pin(int pin)
    {
        if (pin==1111 || pin==2222 || pin==3333)
        {
            System.out.println("valid PIN.");
            return 0;  
        }
        else
        {
            System.out.println("Invalid PIN.");
            return 1;
        }
    }
}

class ATM
{
    int  balance=2000, withdrawAmount, depositAmount;

    // Display current balance in account
    void displayBalance(int balance)
    {
        System.out.println("Current Balance : " + balance);
        System.out.println();
    }

    // Withdraw amount and update the balance
    void amountWithdrawing(int withdrawAmount)
    {
        System.out.println("Withdrawing Amount : "+ withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money and collect the card");
            displayBalance(balance);
        }
        else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
    }

    // Deposit amount and update the balance
    void amountDepositing(int depositAmount)
    {
        System.out.println("Depositing Amount : "+ depositAmount);
        balance = balance + depositAmount;
        System.out.println(
            "Your Money has been successfully deposited");
        displayBalance(balance);       
    }
}



class ATMTransaction
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);
        CheckPIN cp = new CheckPIN(); 
        ATM atm = new ATM();
        int count=0;
        boolean valid=true;
        while(valid  && count<3 ){
            System.out.print("\nEnter PIN.:\t");
            int pin=s.nextInt();
            if(cp.pin(pin)==0){
                break;
            }
            else{
                count=count+1;
                continue;
            }
        }

        if(count==3){
            System.out.println("Transaction Blocked");
            System.exit(0);
            
        }
        System.out.println("\nWELCOME");
        System.out.print("Enter a Choice.:");
        System.out.println("\n1.WithDraw\n2.Deposit");
        int choice=s.nextInt();
        switch(choice){
            case 1:
            System.out.println("\nWithdrawing Operation:");
            System.out.print("Enter amount.:\t");
            int withdrawAmount=s.nextInt();
            if ((withdrawAmount%100)!=0 || (withdrawAmount<0)){
                System.out.println("Invalid Amount.");
            }else{
                atm.amountWithdrawing(withdrawAmount);
                System.out.println("Transaction Completed");
            }
            
            break;

            case 2:
            System.out.println("\nDeposit Operation:");
            System.out.print("Enter amount.:\t");
            int depositAmount=s.nextInt();
            if ((depositAmount%100!=0) || (depositAmount<0)){
                System.out.println("Invalid Amount.");
            }else{
                atm.amountDepositing(depositAmount);
                System.out.println("Transaction Completed");
            }
            break;
            
            default:
            System.out.println("Enter a valid Choice");    
        }
        System.out.println("\nThanks!\nHave A Nice Day.");

        s.close();
        
    }
}