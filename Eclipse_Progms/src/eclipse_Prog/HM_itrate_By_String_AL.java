package eclipse_Prog;

import java.util.*;
import java.util.Map.Entry;

public class HM_itrate_By_String_AL {

	public static void main(String[] args) {

		HashMap<String, ArrayList> h = new HashMap<>();
		ArrayList ac = new ArrayList();
		ac.add(10);
		ac.add("c");

		ArrayList ad = new ArrayList();
		ad.add(10);
		ad.add("d");

		h.put("A", ac);
		h.put("B", ad);

		Set<Map.Entry<String, ArrayList>> s = h.entrySet();

		Iterator<Map.Entry<String, ArrayList>> itr = s.iterator();

		while (itr.hasNext()) {
			Entry<String, ArrayList> s1 = itr.next();
			System.out.println("key => "+s1.getKey());
			for (int i = 0; i < h.get(s1.getKey()).size(); i++)
				System.out.println("Values => "+h.get(s1.getKey()).get(i));
//			   o/p  key => A
//					Values => 10
//					Values => c
//					key => B
//					Values => 10
//					Values => d
		}
	}

}
