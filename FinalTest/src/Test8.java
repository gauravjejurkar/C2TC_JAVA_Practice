import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test8 {

	public static void main(String[] args) {
List list=new ArrayList();
ListIterator a=list.listIterator();

if(a.previousIndex()!=-1)
	while (a.hasNext())
		System.out.print(a.next()+" ");
else
	System.out.print("empty");

	}

}
