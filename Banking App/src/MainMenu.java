import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;

public class MainMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat moneyFormat = new DecimalFormat("'Rs '###, ##0.00");
		
		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
		
		public void getLogin() throws IOException
		{
			int x =1;
			do {
				try {
					data.put(987678,990089);
					data.put(887569,682276);
					data.put(923365,744563);
					data.put(989076,324356);
					
					System.out.println("Welcome to Axis Bank ATM!");
					System.out.println("Enter your Customer Number: ");
					setCustomerNumber(menuInput.nextInt());
					
					System.out.println("Enter your PIN: ");
					setPinNumber(menuInput.nextInt());
					
				} catch(Exception e) {
					System.out.println("\n Invalid Character(s). Only numbers are allowed. \n");
					x = 2;
				}
				int customerNumber = getCustomerNumber();
				int pinNumber = getPinNumber();
				
				if(data.containsKey(customerNumber) && data.get(customerNumber) == pinNumber)
				{
					getAccountType();
				}
				else
				{
					System.out.println("\n Wrong Customer Number or PIN");
				} 
				while(x == 1);
			}
		}
		
		public void getAccountType()
		{
			System.out.println("Select the account which you want to access");
			System.out.println("For Current Account - Press 1");
			System.out.println("For Savings Account - Press 2");
			System.out.println("For Exit - Press 3");
			
			int selectNumber = menuInput.nextInt();
			
			switch(selectNumber)
			{
			case 1:
				getCurrent();
				break;
				
			case 2:
				getSavings();
				break;
				
			case 3: 
				System.out.println("Thank you for using our ATM");
				
				default:
					System.out.println("\n Invalid Choice. \n");
					getAccountType();
			}
		}
		public void getCurrent()
		{
			System.out.println("Current Account: ");
			System.out.println("Press 1 - View Balance");
			System.out.println("Press 2 - Withdraw Funds");
			System.out.println("Press 3 - Deposit Funds");
			System.out.println("Press 4 - Exit");
			System.out.println("Choice: ");
			
			int selection = menuInput.nextInt();
			
			
			}
		}

	}

}
