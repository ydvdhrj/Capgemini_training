package setPractice;

import java.util.Comparator;

public class sortByPrice implements Comparator<Biryani>{

	@Override
	public int compare(Biryani o1, Biryani o2) {
		// TODO Auto-generated method stub
		if(o1.price==o2.price) {
			return o1.type.compareTo(o2.type);
		}
		return o1.price-o2.price;
	}

}
