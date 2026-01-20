package setPractice;

import java.util.Comparator;

public class SortById implements Comparator<Biryani>{

	@Override
	public int compare(Biryani o1, Biryani o2) {
		// TODO Auto-generated method stub
		return o1.bid-o2.bid;
	}

}
