package CC;

public class TestRecur {
	private static boolean Test(int n) {
		System.out.println(n);
		if(n==3) return false;
		else if(n==1) return false;
		return Test(n-1);
	}

	public static void main(String[] args) {
		Test(5);

	}

}
