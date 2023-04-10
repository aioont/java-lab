import java.util.*;
class MinBalExp extends Exception {
  public String ToString() {
    return("Minimum Balance Exceeded");
  }
}

class Account {
  int balance=0;
  public void withdraw(int amt) 
  {
    try{
      if(amt>balance)
          throw new MinBalExp();
      balance=balance-amt;
      System.out.println("Amount withdrawn : "+amt);
      System.out.println("Balance amount : "+balance);
       }
    catch(MinBalExp e)
    {
      System.out.println(e);
    }
  }
  public void deposit (int amt)
  {
    Scanner sn=new Scanner(System.in);
    balance=balance+amt;
    System.out.println("Balance amount : "+balance);  
  }
}

 class Dcoder
 {
   public static void main(String args[])
   { 
    try {
      Account a=new Account();
      Scanner sn=new Scanner(System.in);
      int ch,val;
      do{
        System.out.println("\n1.Deposit \n 2.Withdrawn \n 3.Exit\nEnter your choice : ");
        ch=sn.nextInt();
        switch(ch)
         {
           case 1:
             System.out.println("Enter amount to deposit :");
             val=sn.nextInt();
             a.deposit(val);
             break;
           case 2:
             System.out.println("Enter amount to withdraw :");
             val=sn.nextInt();
             a.withdraw(val);
             break;
           case 3: 
             break;
             
          }
        }
        while(ch!=3);
    }
    catch(Exception e){
    System.out.println(e);
    }
   }
 }
,