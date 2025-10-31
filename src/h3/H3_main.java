package h3;

public class H3_main {
	public static void main(String[] args) {
		int i = 1, j = 105, k = 7;
		boolean Ausdruck1 = (i > j);
		boolean Ausdruck2 = (i > 200);
		boolean Ausdruck3 = (j > 100);
		k = -10;
		if (Ausdruck1 == true && Ausdruck2 == false && Ausdruck3 == false) {
			k = 1;
		}
		if (Ausdruck1 == true && Ausdruck2 == true && Ausdruck3 == false) {
			k = 2;
		}
		if (Ausdruck1 == true && Ausdruck2 == true && Ausdruck3 == true) {
			k = 3;
		}
		if (Ausdruck1 == false && Ausdruck2 == false && Ausdruck3 == false) {
			k = 4;
		}
		System.out.println(k);
	}
}
