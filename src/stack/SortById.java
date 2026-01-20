package stack;

import java.util.Comparator;

public class SortById implements Comparator<Trainer>{
// override compare
	public int compare(Trainer t1, Trainer t2) {
		if(t1.tid==t2.tid) {
			return t1.tname.compareTo(t2.tname);
		}
		else
			return t1.tid-t2.tid;
	}
}
