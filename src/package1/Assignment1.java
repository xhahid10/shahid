package package1;

public class Assignment1 {

	public int sum(int a,int b) {
		int c;
		c=a+b;
		System.out.println("The sum result is "+c);
		return c;
		
	}
	public int subtract(int a1, int a2) {
		int a3;
		a3= a1-a2;
		System.out.println("The subtraction result is "+a3);
		return a3;		
	}
	public int multiply(int s1,int s2) {
		int m;
		m=s1*s2;
		System.out.println("The multiplication result is " +m);
		return m;
		
	}
	public void div(int d1, int d2) {
		int d3;
		d3=d1/d2;
		System.out.println("The divison result is "+d3);
		
		
	}
	public static void main(String[] args) {
		Assignment1 obj1=new Assignment1();
		int sumresult1=obj1.sum(10, 2);
		int subresult=obj1.subtract(sumresult1, 2);
		int sumresult2=obj1.sum(subresult, 2);
		int mul=obj1.multiply(sumresult2,2);
		obj1.div(mul, 2);
		System.out.println("updated git");
						
	}
}
