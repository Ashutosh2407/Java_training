package task6;

class Rectangle{
	int length;
	int breadth;
	
	Rectangle(){
		this.length =0;
		this.breadth = 0;
	}
	
	Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	Rectangle(int value){
		this.length = value;
		this.breadth = value;
	}
	
	void calculate_area() {
		System.out.println("The area of the rectangle is "+(this.length*this.breadth));
	}
	
	
}

public class Five {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(4);
		Rectangle r3 = new Rectangle(2,5);
		r1.calculate_area();
		r2.calculate_area();
		r3.calculate_area();
		
		

	}

}
