package j0803;

import java.util.Scanner;

class ToPound {
	Scanner s1=new Scanner (System.in);
	
	double num;
	public double getNum() {                //ToPound에서 가져오는것은 get! =>double
		return num;           
	}

	public void setNum() {                  //메인에서 보내는것은 set!   =>void(리턴값x)
		System.out.print("kg로 무게(실수)로 입력하세요. >>");
		num=s1.nextDouble();
	}
	
	void printNum() {
		System.out.print(num+"kg");
	}
	void printPound(){
		System.out.printf("%f파운드(1b)",num*2.2);
	}
}

public class exam15 {

	public static void main(String[] args) {
		// 실습 10-11
		
		ToPound weight=new ToPound();
		weight.setNum();                      //setNum(); =>넘버 입력 후 ToPound로 보냄!
		weight.printNum();
		System.out.print("은 ");
		weight.printPound();
		System.out.print(" 입니다.");
	}

}
