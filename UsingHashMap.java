package progm;
import java.util.Collections;
import java.util.HashMap;

public class UsingHashMap {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("name1", "neha");
		hm.put("name2", "anu");
		hm.put("name3", "roopa");
		hm.put("name4", "akstha");
		System.out.println(hm);
		HashMap hm1=new HashMap();
		hm1.put("name1", "neha");
		hm1.put("name2", "anu");
		hm1.put("name3", "roopa");
		hm1.put("name4", "akstha");
		hm1.put("name5", "anu");
		System.out.println(hm1);
		hm1.put("name6", "akstha");
		System.out.println(hm1);
		hm1.put(null, "chethan");
		System.out.println(hm1);
		hm1.put("name6", null);
		System.out.println(hm1);

	}
}
 


