package package1;

public class Const {
	
	public Const() {
		this(2,3,4);
		System.out.println("Default Constructor");
		
	}
    public Const(int a) {
    	this(12,12);
    	System.out.println("one parameterized constructor");
	}
    public Const(int a, int b) {
    	this();
    	System.out.println("two parameterized constructor");
    }
    public Const(int a,int b, int c) {
    	
    	System.out.println("three parameterized constructor");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Const obj =new Const(22);
    
	}

}
