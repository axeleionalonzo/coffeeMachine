package coffeeMachine;

// Tracks the amount of credit.
public class CashBox {
	private int credit;
	
	public CashBox(){
		credit = 0;
	}
	
	public final void deposit(int amount){
		credit += amount;
		System.out.printf("\tCashBox: Depositing %d cents.",amount);
		System.out.printf("\tYou now have %d cents credit.\n\n",credit);
	}
	
	public final void returnCoins(){
		System.out.printf("\tCashBox: Returning %d cents\n",credit);
		credit = 0;
	}

	public final boolean haveYou(int amount){
		return credit >= amount;
	}
	
	public final void deduct(int amount){
		credit -= amount;
		returnCoins();
	}
}