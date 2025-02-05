package progm;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class UsingVectorList {
		public static void main(String[] args) 
		{
			Vector v=new Vector();
			v.add(555);
			v.add('A');
			v.add(1.20);
			v.add("nami");
			v.add(true);
			System.out.println(v);
			Vector<String> v1=new Vector<String>();
			v1.add("priya");
			v1.add("nami");
			System.out.println("Before sorting"+v1);
			Collections.sort(v1); 
			System.out.println("After sorting"+v1);
			
			Vector<String> vec=new Vector<String>();
			vec.addAll(v1);
			vec.add("avni");
			vec.add("priya");
			vec.add(null);
			vec.add(null);
			System.out.println(vec);
			
			Vector<String> v2=new Vector<String>();	
			v2.addElement("ami");
			v2.addElement("arun");
			v2.addElement("hanush");
			System.out.println(v2);

			Iterator i = v2.iterator();
			System.out.println("forward Iteration");
			while (i.hasNext()) {
				System.out.println(i.next());
			}
			ListIterator<String> l = v2.listIterator();
			System.out.println("forward Iteration using list iterator");
			while (l.hasNext()) {
				System.out.println(l.next());
			}
			
			Enumeration<String> e1=v2.elements();
					while(e1.hasMoreElements())
					{
						System.out.println(e1.nextElement());
					}
			
			
		
		}
		}




