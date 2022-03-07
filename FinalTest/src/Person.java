
public class Person {

	String name;
	Person(String name)
	{
		this.name=name;
	}
}

class Employee extends Person{
	int empld;
	Employee(int empld, String name){
		super(name);
		this.empld=empld;
	}
}