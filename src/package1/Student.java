package package1;

public class Student {
	
	int roll_no,age;
	
	public void method1() {
		System.out.println("Welcome to all of you");
		
	}
	
	public void method2() {
		System.out.println("Automation is very easy");
		
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.method1();
		s1.method2();
		
		s1.roll_no=17;
		s1.age=23;
		
		System.out.println(s1.roll_no);
		System.out.println(s1.age);
	}

}
