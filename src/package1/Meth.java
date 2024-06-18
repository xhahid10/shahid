package package1;

public class Meth {

	
	public void method() {
		this.method(2, 3,4); 
		System.out.println("default method");
		this.method(2);
		this.method(2, 3);
		this.method(2, 3,4,5);
	}
	public void method(int a) {
		System.out.println("one parameterized method");
	}
    public void method(int a, int b) {
    	System.out.println("two parameterized method");
	}
    public void method(int a, int b , int c) {
    	System.out.println("three parameterized method");
  }
    public void method(int a, int b , int c ,int d) {
    	
    
    	System.out.println("four parameterized method");
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Meth obj =new Meth();
   obj.method();
	}

}
