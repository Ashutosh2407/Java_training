package task6;

class AddAmount{
	int amount = 50;
	int transactions =0;
	
	AddAmount(){
		this.amount+=0;
	}
	
	AddAmount(int amount){
		this.amount+=amount;
		transactions++;
	}
	
	void final_amount() {
		System.out.println("The final amount in saving box "+(this.amount));
	}
	
	void number_of_transactions() {
		System.out.println("The number of transactions are "+transactions);
	}
}


public class Six {

	public static void main(String[] args) {
		AddAmount a1 = new AddAmount();
		a1.final_amount();
		a1.number_of_transactions();
		AddAmount a2 = new AddAmount(10);
		a2.final_amount();
		a2.number_of_transactions();
		
		

	}

}
