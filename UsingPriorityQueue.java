package progm;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class UsingPriorityQueue {
		public static void main(String[] args) {
//		PriorityQueue p=new PriorityQueue();
//		p.add(555);
//		p.add('A');
//		p.add(1.20);
//		p.add("nami");
//		p.add(true);
//		System.out.println(p);
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("nami");
		pq.add("priya");
		pq.add("priya");
		//pq.add(null);
		//pq.add(null);

		System.out.println(pq);

		PriorityQueue<String> pq2=new PriorityQueue<String>();
		pq2.addAll(pq);
		pq2.add("avni");
		System.out.println(pq2);
		//Collections.sort(pq2); 
		//System.out.println("After sorting"+pq2);

		Iterator i = pq2.iterator();
		System.out.println("forward Iteration");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
//		  ListIterator lis = pq2.listIterator();
//		  System.out.println("forward Iteration");
//		  while (lis.hasNext()) {
//		   System.out.println(lis.next()); 
//		   }
//		 
		
		
//		  Enumeration<String> e= pq2.elements(); 
//		  while(e.hasMoreElements()) {
//		  System.out.println(e.nextElement());
//		  }
//		 
		

	}
	}


