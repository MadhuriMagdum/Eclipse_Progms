package eclipse_Prog;

import java.util.ArrayList;
import java.util.*;

public class Dupli_Disp_AL {

	public static void main(String[] args) {

		ArrayList aa = new ArrayList();
		aa.add(10);
		aa.add("a");
		aa.add(20);

		ArrayList ab = new ArrayList();
		ab.add(10);
		ab.add("b");
		ab.add(30);

		ArrayList ac = new ArrayList();
		ac.add(10);
		ac.add("c");
		ac.add(40);

		ArrayList ad = new ArrayList();
		ad.add(10);
		ad.add("d");
		ad.add(50);

		ArrayList<ArrayList> a = new ArrayList();
		a.add(aa);
		a.add(ab);
		a.add(ac);
		a.add(ad);
		System.out.println(a);//[[10, a, 20], [10, b, 30], [10, c, 40], [10, d, 50]]
		
		//...... only duplicate print
		HashSet h = new HashSet();
		int i = 0;
		for (i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.get(i).size(); j++) {				
				if (a.get(0).contains(a.get(i).get(j)) && a.get(1).contains(a.get(i).get(j)) && a.get(2).contains(a.get(i).get(j))
						&& a.get(3).contains(a.get(i).get(j)))
					h.add((a.get(i).get(j)));
			}
		}
		System.out.println(h);//[10]
		
		// .....duplicates obj are removed only unique obj are allowed
//		HashSet h1 = new HashSet();
//		int i1 = 0;
//		for (i1 = 0; i1 < a.size(); i1++) {
//			for (int j = 0; j < a.get(i1).size(); j++) {
//					h1.add((a.get(i1).get(j)));
//			}
//		}
//		System.out.println(h1);//[a, b, 50, c, 20, d, 40, 10, 30]

		
	}

}
