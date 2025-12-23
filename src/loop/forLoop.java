package loop;

public class forLoop {
	public static void main(String[] args) {
		for (char c = 'a';c<='s';c++) {
			if(c%2==0) {
				System.out.println(c+" --> "+(int)c);
			}
		}
	}
}
