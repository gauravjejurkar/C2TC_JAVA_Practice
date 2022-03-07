import java.util.Set;
import java.util.TreeSet;

public class Test7 {

	public static void main(String[] args) {
Set<String> set=new TreeSet<>();

set.add("D");
set.add("B");
set.add(null);
set.add("C");
set.add("D");

System.out.println(set);
	}

}
