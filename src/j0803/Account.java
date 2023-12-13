package j0803;

class Account1{
	private String owner;                                //속성지정
	private long balance;
	;
	Account1() {                                         //매개변수가 없는 생성자 만들기
                                                          //호출받은애가 갈데가 없음!
    }
	Account1(String owner, long balance) {               //매개변수가 있는 생성자 만들기
      this.owner=owner;                                   //this가 붙으면 메인클래스 자기 자신의 이름
      this.balance=balance;
      System.out.printf("초기값 이름 : %s 초기금액 : %d\n", this.owner,this.balance);
    }
	Account1(long balance,String owner){
		this.owner=owner;
		this.balance=balance;
	}
	Account1(String owner){
		this.owner=owner;
	}
	Account1(long balance){
		this.balance=balance;
	}
	void printBalance() {
		System.out.printf("현재 잔액 : %d\n",balance);
	}
	public long deposit(long amount) {
		balance+=amount;
		System.out.printf("저축 : %d   잔액 : %d\n",amount,balance);
		return amount;
	}
	
	public long withdraw(long amount) {
		System.out.printf("인출 시도 금액: %d\n",amount);     //+인출시도금액
		if(balance<amount) {
			System.out.println("잔금이 부족해 현재 잔금만 인출합니다.");
			System.out.printf("인출 : %d   잔액 : %d\n",balance,0);
			balance-=balance;
		}else {
		balance-=amount;
		System.out.printf("인출 : %d   잔액 : %d\n",amount,balance);
		}
		return amount;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
}

public class Account {

	public static void main(String[] args) {
		// 실습 10-12, 10-13, 
		
       Account1 acc=new Account1("최여진",100000);
		
		acc.deposit(100000);
		acc.withdraw(5000);
		acc.deposit(200000);
		acc.withdraw(15000);
		acc.withdraw(235000);
		acc.printBalance();
		
	  }
	/*
	Account1 acc = new Account1();
	acc.setOwner("최여진");                               //넘겨주는것은 set!"
	acc.setBalance(100000);
	acc.print();
    */
   }
