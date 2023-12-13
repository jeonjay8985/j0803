package j0803;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		// 실습 10-01
		
		Scanner s1=new Scanner(System.in);
		
		System.out.print("나이 입력 ==> ");
		int age;
		age=s1.nextInt();
		
		if(age <19) {
			System.out.println("집에 갈 시간이네요!");
			System.out.print("협조 감사합니다");
		}else if(age >=19){
			System.out.println("즐거운 시간 보내세요^^");
			System.out.print("협조 감사합니다");
		}

	}

}
