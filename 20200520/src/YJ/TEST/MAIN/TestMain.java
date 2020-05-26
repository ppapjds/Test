package YJ.TEST.MAIN;

public class TestMain {
	public static void main(String[] args) {
		PPA a = new PPA();
		System.out.println(a.as("+", 2,4));
		System.out.println(a.as("-", 2d,4d));
		System.out.println(a.as("*", 2d,4d));
		System.out.println(a.as("/", 2d,4d));
	}
}
