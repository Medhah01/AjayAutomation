package Throwinjava;
//date 3/13/2023
public class LowAccountBalanceException extends RuntimeException {
LowAccountBalanceException(){
	super("account balance is low");
	
}
}
