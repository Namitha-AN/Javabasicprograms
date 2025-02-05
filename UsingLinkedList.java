package progm;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class UsingLinkedList {
	public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(555);
	l.add('A');
	l.add(1.20);
	l.add("nami");
	l.add(true);
	System.out.println(l);
	LinkedList<String> l1=new LinkedList<String>();
	l1.add("priya");
	l1.add("nami");
	System.out.println(l1);
	Collections.sort(l1); 
	System.out.println("After sorting"+l1);

	LinkedList<String> l2=new LinkedList<String>();
	l2.addAll(l1);
	l2.add("avni");
	l2.add("priya");
	l2.add(null);
	l2.add(null);

	Iterator i = l1.iterator();
	System.out.println("forward Iteration");
	while (i.hasNext()) {
		System.out.println(i.next());
	}
	
	  ListIterator lis = l1.listIterator();
	  System.out.println("forward Iteration");
	  while (lis.hasNext()) {
	   System.out.println(lis.next()); 
	   }
	 
	
	
//	  Enumeration<String> e2= l1.elements(); 
//	  while(e2.hasMoreElements()) {
//	  System.out.println(e2.nextElement());
//	  }
//	 
	

}
}


