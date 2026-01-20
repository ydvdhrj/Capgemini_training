package stack;

public class Trainer {
	int tid;
	String tname;
	String tsub;
	Trainer(int tid, String tname, String tsub){
		this.tid = tid;
		this.tname = tname;
		this.tsub = tsub;
	}
	
	public String toString() {
		return tid+" "+tname+" "+tsub;
	}
}
