
package atm;

import java.io.Serializable;

class Account implements Serializable
{
    String accno;
    String name;
    double balance;
    
    Account(){}
    
    Account(String a,String n,double b)
    {
        this.accno=a;
        this.name=n;
        this.balance=b;
    }
    public void Deposite(double amount)
    {
        this.balance+=amount;
    }
    public void Withdraw(double amount)
    {
        if(balance-amount>500)
        {
           this.balance = this.balance-amount;
        }
        else
        {
            System.out.println("Your Minimum Balence Should be 500\nSorry you can't withdraw!");
        }
    }
    public double Check_balence()
    {
        return this.balance;
    }
    public String toString()
    {
        return "Account No:"+accno+"\nName :"+name+"\nBalance :"+balance+"\n";
    }
}
