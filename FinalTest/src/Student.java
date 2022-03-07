
public class Student {
	
	int age;
	double marks;
	Student(){}
	
	Student(int age, double marks){
		
		System.out.println("inside Student(age, marks) Constructor");
		this.age=age;
		this.marks=marks;
		
		}
	
Student(double marks, int age){
		
		System.out.println("inside Student(marks,age) Constructor");
		this.age=age;
		this.marks=marks;
		
		}
	

	public static void main(String[] args) {
Student student=new Student(45,12);

	}

}
