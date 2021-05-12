package task6;

class Programming{
	
	Programming(){
		System.out.println("I love programming languages");
	}
	
	Programming(String str){
		System.out.println("I love "+str);
	}
}

public class Seven {

	public static void main(String[] args) {
		Programming p = new Programming();
		Programming p1 = new Programming("Java");
	}

}
