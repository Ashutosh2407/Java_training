package task6;

class Student{
	String name;
	
	Student(){
		this.name = "unknown";
	}
	
	Student(String name){
		this.name = name;
	}
	
	void print() {
		System.out.println(this.name);
	}
}

public class Three {

	public static void main(String[] args) {
		Student s1 =new Student();
		Student s2 = new Student("Jim");
		s1.print();
		s2.print();

	}

}
