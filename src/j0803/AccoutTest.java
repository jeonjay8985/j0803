package j0803;

public class AccoutTest {

	public static void main(String[] args) {
		// 실습 10-14
		
			Account1 acc1=new Account1("최여진",100000);
			
			acc1.deposit(200000);
			acc1.withdraw(100000);
			acc1.withdraw(400000);
			acc1.printBalance();


	}

}
