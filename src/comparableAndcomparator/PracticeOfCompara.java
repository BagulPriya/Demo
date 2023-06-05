package comparableAndcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeOfCompara {
	public static void main(String[] args) {
	ArrayList<Emp>emps=new ArrayList<>();
	emps.add(new Emp("priya",1,12345));
	emps.add(new Emp("Ava",3,4567));
	emps.add(new Emp("Ana",2,457905));
		System.out.println(emps);
		Collections.sort(emps,new IdComparator());
		//comparable
		System.out.println(emps);

		ArrayList<Emp>emps1=new ArrayList<>(emps);
		Collections.sort(emps1,new NameComparator());
		System.out.println(emps1);
	}
}
