package coffeeMachine;

public class Selection{

	public final int priceOf(String menu){
		if(menu!="bouillon"){
			return 35;
		}
		else{
			return 25;
		}
	}
}
