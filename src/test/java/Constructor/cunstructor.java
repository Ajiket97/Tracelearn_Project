package Constructor;

import org.testng.annotations.Test;

public class cunstructor {
	static int x;

	protected cunstructor(int y) {
		this.x = y;
	}

	public static void m1() {
		cunstructor c = new cunstructor(10);
		System.out.println(x);
	}
	public static void main(String[] args) {
		m1();
	}
}
