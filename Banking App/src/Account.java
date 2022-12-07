import java.text.*;
import java.util.*;

public class Account 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		DecimalFormat moneyFormat = new DecimalFormat("'Rs '###, ##0.00");
		
	public int setCustomerNumber(int customerNumber)
	{
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	public int getCustomerNumber() {
		return customerNumber
	}
	
	public int setPinNumber(int pinNumber)
	{
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber()
	{
		return pinNumber;
	}
	
	public double getCurrentBalance()
	{
		rerturn currentBalance;
	}
	
	public double getSavingsBalance()
	{
		return savingsBalance;
	}
	
	public double calcCurrentWithdraw(double amount)
	{
		currentBalance = (currentBalance - amount);
		return currentBalance;
	}
	
	public double calcSavingsWithdraw(double amount) {
		savingsBalance = (savingsBalance - amount);
		return savingsBalance;
	}
	}

}
