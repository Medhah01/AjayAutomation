package Throwinjava;
//date 3/13/2023
public class Bank {

	int balance=10000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.withdraw(15000);
		

	}

  void withdraw(int amount) {
	if(balance<amount) {
		throw new LowAccountBalanceException();
		} 
	else {
		balance=balance-amount;
	}
  }
  }
