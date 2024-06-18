package package1;

public class Assignment2 {
	
	public int multply(int a, int b) {
	
		int c;
		c= a*b;	
		System.out.println("The multiply result is " +c);
		return c;
	}
	public int subtract(int s1,int s2) {
		int s3;
		s3=s1-s2;
		System.out.println("The subtraction result is " +s3);
		return s3;
		
	}
	public int sum(int a1,int a2) {
		int a3;
		a3=a1+a2;
		System.out.println("The sum result is " +a3);
		return a3;
				
	}
	public void div(int d1,int d2) {
		int d3;
		d3=d1/d2;
		System.out.println("The divison result is " +d3);
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//((((10*2)-2+2)-2)/2)
        Assignment2 obj1= new Assignment2();
        int mul=obj1.multply(10, 2);
        int subresult=obj1.subtract(mul, 2);
        int sumresult=obj1.sum(subresult, 2);
        int subresult2=obj1.subtract(sumresult, 2);
        obj1.div(subresult2, 2);
        

	}

}
