abstract class One{
	void m1() {
		System.out.println("parent m1 method");
	};
}

class Two extends One{
	void m1() {
		System.out.println("child m1 method");

	}
}

public class Test1 {

	public static void main(String[] args) {

		One a=new Two();
		a.m1();
		
	}

}
