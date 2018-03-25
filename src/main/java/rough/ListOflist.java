package rough;

import java.util.ArrayList;
import java.util.List;

public class ListOflist {
public static void main(String[] args) {
	List<List<String>> list=new ArrayList<List<String>>();
	
	List<String> list1= new ArrayList<String>();
	list1.add("u1");
	list1.add("p1");
	
	List<String> list2= new ArrayList<String>();
	list1.add("u2");
	list1.add("p2");
	
	
	list.add(list1);
	list.add(list2);
	
	
}
}
