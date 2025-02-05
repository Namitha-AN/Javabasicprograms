package progm;
	import java.util.Collections;
	import java.util.Enumeration;
	import java.util.Iterator;
	import java.util.ListIterator;
	import java.util.LinkedHashSet;

public class UsingLinkedHashSet {
		public static void main(String[] args) {
			LinkedHashSet lh=new LinkedHashSet();
			lh.add(555);
			lh.add('A');
			lh.add(1.20);
			lh.add("nami");
			lh.add(true);
			System.out.println(lh);
			LinkedHashSet<String> lh1=new LinkedHashSet<String>();
			lh1.add("priya");
			lh1.add("nami");
			System.out.println(lh1);
			//Collections.sort(lh1); 
			//System.out.println("After sorting"+lh1);
			
			LinkedHashSet<String> lhs=new LinkedHashSet<String>();
			lhs.addAll(lh1);
			lhs.add("avni");
			lhs.add("priya");
			lhs.add(null);
			lhs.add(null);
			System.out.println(lhs);

			Iterator i = lhs.iterator();
			System.out.println("forward Iteration");
			while (i.hasNext()) {
				System.out.println(i.next());
			}
//			ListIterator<String> l = lhs.listIterator();
//			System.out.println("forward Iteration using list iterator");
//			while (l.hasNext()) {
//				System.out.println(l.next());
//			}
//			
//			Enumeration<String> e1=lhs.elements();
//					while(e1.hasMoreElements())
//					{
//						System.out.println(e1.nextElement());
//					}
//			
			

		}
	}


