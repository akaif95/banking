public class SavingsAccount {
  
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  //------------------------------------------//
  
  
  public void checkBalance(){
    System.out.println("Hello!\n Your balance is " + balance);
    
  }
  
  //------------------------------------------//
  
  
  public void deposit(int amountToDeposit){
    System.out.println("You just deposited " + amountToDeposit);
    balance = balance + amountToDeposit;
  }
  
  //------------------------------------------//
  
  public int withdraw(int amountToWithdraw) {
    System.out.println("You just withdrew " + amountToWithdraw);
    balance = balance - amountToWithdraw;
    return amountToWithdraw;
  }
  
  
  //------------------------------------------//
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
		savings.checkBalance();
    
    //Withdrawing:
		savings.withdraw(100);
    
    //Check balance:

    
    //Deposit:
		savings.deposit(150);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit2 = savings.balance + 600;
    savings.balance = afterDeposit2;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
  }       
}
