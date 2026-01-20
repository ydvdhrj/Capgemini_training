package stack;

import java.util.Comparator;

public class SortByName implements Comparator<Trainer>{
public int compare(Trainer t1,Trainer t2) {
	return t1.tname.compareTo(t2.tname);
}
}
