package progm;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class UsingTreeSet {
public static void main(String[] args) {
//		TreeSet t = new TreeSet();
//			t.add(555);
//			t.add('A');
//			t.add(1.20);
//			t.add("nami");
//			t.add(true);
//			System.out.println(t);
			TreeSet<String> t1 = new TreeSet<String>();
			t1.add("priya");
			t1.add("nami");
			System.out.println(t1);
//			Collections.sort(t1);
//			System.out.println("After sorting" + t1);

			TreeSet<String> ts = new TreeSet<String>();
			ts.addAll(t1);
			ts.add("chethan");
			ts.add("priya");
			//ts.add(null);
			//ts.add(null);
			System.out.println(ts);

			Iterator i = ts.iterator();
			System.out.println("forward Iteration");
			while (i.hasNext()) {
				System.out.println(i.next());
			}
//			ListIterator<String> l = ts.listIterator();
//			System.out.println("forward Iteration using list iterator");
//			while (l.hasNext()) {
//				System.out.println(l.next());
//			} 
//				  
//				 Enumeration<String> e1=ts.elements();
//				 while(e1.hasMoreElements()) {
//				 System.out.println(e1.nextElement());
//				 }
//				 
		}
	}


