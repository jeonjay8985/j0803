package j0803;
class Calculation {
	
	int a;
	int b;
	int c;
	
	void num(int a, int b, int c) {
		System.out.printf(" a: %d\n b: %d\n c: %d\n  ", a, b, c);
	}
	
	void sum1(int a, int b) {
		System.out.printf("sum(a+b) = "+(a+b));
		System.out.println();
	} 


	void sum2(int a, int b, int c) {
		System.out.printf("sum(a+b+c) = "+(a+b+c));
	}
}
public class exam13 {

	public static void main(String[] args) {
		// 실습 10-09
		
		Calculation cal = new Calculation();
		cal.num(10, 20, 30);
		cal.sum1(10, 20);
		cal.sum2(10, 20, 30);
	
	}

}
