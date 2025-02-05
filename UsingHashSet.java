package progm;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.HashSet;

public class UsingHashSet {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(555);
		h.add('A');
		h.add(1.20);
		h.add("nami");
		h.add(true);
		System.out.println(h);
		HashSet<String> h1=new HashSet<String>();
		h1.add("priya");
		h1.add("nami");
		System.out.println(h1);
		//Collections.sort(h1); 
		//System.out.println("After sorting"+h1);
		
		HashSet<String> hs=new HashSet<String>();
		hs.addAll(h1);
		hs.add("avni");
		hs.add("priya");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);

		Iterator i = hs.iterator();
		System.out.println("forward Iteration");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
//		ListIterator<String> l = hs.listIterator();
//		System.out.println("forward Iteration using list iterator");
//		while (l.hasNext()) {
//			System.out.println(l.next());
//		}
//		
//		Enumeration<String> e1=hs.elements();
//				while(e1.hasMoreElements())
//				{
//					System.out.println(e1.nextElement());
//				}
//		
//		

	}
}
