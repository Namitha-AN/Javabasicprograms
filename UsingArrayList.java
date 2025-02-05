package progm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class UsingArrayList {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(555);
		a.add('A');
		a.add(1.20);
		a.add("nami");
		a.add(true);
		System.out.println(a);
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("nami");
		a1.add("priya");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println("After sorting" + a1);
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(a1);
		al.add("chethan");
		al.add("priya");
		al.add(null);
		al.add(null);
		System.out.println(al);

		Iterator i = al.iterator();
		System.out.println("forward Iteration");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		ListIterator<String> l = al.listIterator();
		System.out.println("forward Iteration using list iterator");
		while (l.hasNext()) {
			System.out.println(l.next());
		} /*
			 * 
			 * Enumeration<String> e1=al.elements(); while(e1.hasMoreElements()) {
			 * System.out.println(e1.nextElement()); }
			 */
	}
}
