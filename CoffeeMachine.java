import coffeeMachine.*;
import java.util.Scanner;

class CoffeeMachine {
	public static void main(String args[]){
		
		CashBox pCashBox = new CashBox();
		Selector pSelector = new Selector();

		int drink;
		int money;
		int sugar;
		String choice;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insert coins: ");
		money = in.nextInt();
			if (money!=0){
				pCashBox.deposit(money);
			}
			
		System.out.println("\tSelect drinks: ");
		System.out.println("\tEnter 1 if you want black coffee.");
		System.out.println("\tEnter 2 if you want coffee with creamer.");
		System.out.println("\tEnter 3 if you want a bouillon.");
		drink = in.nextInt();
			if (drink==1){
				System.out.println("\tDo you want to add? sugar?");
				System.out.println("\tEnter 1 if you want to add sugar.");
				System.out.println("\tEnter 2 if you dont want to add sugar.");
				sugar = in.nextInt();
					if (sugar==1){
						choice = "black coffee with sugar";
						pSelector.select(choice, pCashBox);
					}
					else if(sugar==2){
						choice = "black coffee no sugar";
						pSelector.select(choice, pCashBox);
					}
			}
			else if (drink==2){
				System.out.println("\tDo you want to add? sugar?");
				System.out.println("\tEnter 1 if you want to add sugar.");
				System.out.println("\tEnter 2 if you dont want to add sugar.");
				sugar = in.nextInt();
					if (sugar==1){
						choice = "white coffee with sugar";
						pSelector.select(choice, pCashBox);
					}
					else if(sugar==2){
						choice = "white coffee no sugar";
						pSelector.select(choice, pCashBox);
					}
			}
			else if (drink==3){
				choice = "bouillon";
				pSelector.select(choice, pCashBox);
			}
	}
}