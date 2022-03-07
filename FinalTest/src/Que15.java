class A{
	public void method1() {
		System.out.println("inside method 1 of A");
	}
}

class B extends A{

	@Override
	public void method1() {
		System.out.println("inside method 1 of B");
	}
	
}
public class Que15 {

	public static void main(String[] args) {
		
		A a1=new B();
		a1.method1();
		
	}

}
