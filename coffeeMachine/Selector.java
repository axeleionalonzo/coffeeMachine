package coffeeMachine;

// Selector class:
// Checks credit; Dispenses product.
public class Selector{
	Selection pSelection = new Selection();
	Mixer pMixer = new Mixer();

	public final void select(String selected, CashBox cash){
		int amount = pSelection.priceOf(selected);
		
		if (cash.haveYou(amount)){
			pMixer.make(selected);
			cash.deduct(amount);
			System.out.printf("\t%s Served.\n\n", selected.toString());
		}
		else{
			System.out.println("\tSelector: Insufficient funds");
			cash.returnCoins();
		}
	}

}