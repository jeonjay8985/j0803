package j0803;
class Calculation2 {
	
	int c;
	int d;
	double a;
	double b;
	void sum1(int c, int d) {
		System.out.printf("sum(c+d) : %d\n",(c+d));
		System.out.println();
	}
	
	void sum2(double a, double b) {
		System.out.printf("sum(a+b) = %.2f\n",(a+b));
	}
}
	public class exam14 {

		public static void main(String[] args) {
			// 실습 10-10
			
			Calculation2 cal = new Calculation2();
	        cal.sum1(10,20);
			cal.sum2(1.12, 2.25);

		}
	
	
	/*
	 	public static double getSum(double a, double b) {
		double sum = a+b;
		return sum;
	}
	
	double a;
	double b;

	void sum(double a, double b) {
		System.out.print("sum (" +a+ "," +b);
		System.out.println(); */
	
	/*
	void num(double a, double b) {
		System.out.printf(" a: %f\n b: %f\n ", a, b);
	}
	
	void sum(double a, double b) {
		System.out.printf("sum(%f, %f) = ", a, b);
		System.out.println();*/
	} 






