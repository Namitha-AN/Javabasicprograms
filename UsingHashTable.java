package progm;
import java.util.Collections;
import java.util.Hashtable;

public class UsingHashTable {
public static void main(String[] args) {
	Hashtable ht=new Hashtable();
			ht.put("name1", "neha");
			ht.put("name2", "anu");
			ht.put("name3", "roopa");
			ht.put("name4", "akstha");
			System.out.println(ht);
			Hashtable ht1=new Hashtable();
			ht1.put("name1", "neha");
			ht1.put("name2", "anu");
			ht1.put("name3", "roopa");
			ht1.put("name4", "akstha");
			ht1.put("name5", "anu");
			System.out.println(ht1);
			ht1.put("name6", "akstha");
			System.out.println(ht1);
			//ht1.put(null, "chethan");
			//System.out.println(ht1);
			//ht1.put("name6", null);
			//System.out.println(ht1);

		}
	}
	 




