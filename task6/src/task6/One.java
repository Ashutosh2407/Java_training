package task6;

class Complex{
	int real_ = 0;
	int complex = 0;
	
	Complex(int real,int complex){
		this.real_ = real;
		this.complex = complex;
	}
	
	void add(Complex num2) {
		int real_ = this.real_ + num2.real_;
		int complex = this.complex + num2.complex;
		System.out.println("The sum is "+real_+" +  "+complex+"i");
	}
	
	void diff(Complex num2) {
		int real_ = this.real_ - num2.real_;
		int complex = this.complex - num2.complex;
		System.out.println("The sum is "+real_+" + ("+complex+")i");
	}
	
	void product(Complex num2) {
		int real_ =this.real_ * num2.real_;
		int complex = -1*this.complex * num2.complex;
		int answer = real_ + complex;
		System.out.println("The product is "+answer);
	}
}

public class One {

	public static void main(String[] args) {
		Complex num1 = new Complex(1,2);
		Complex num2 = new Complex(3,4);
		num1.add(num2);
		num1.diff(num2);
		num1.product(num2);
		

	}

}


