package j0803;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		// 파일 입출력
		
		Scanner s1=new Scanner(System.in);
		
		int num=100;
		
		System.out.printf("num : %d\n", num);
		System.out.printf("num : %o\n", num); // %o는 8진수로 출력!
		System.out.printf("num : %x\n", num); //%x는 16진수로 출력!
		
		
		String str1;
		String str2;
		System.out.print("문자 입력 : ");
		str1 = s1.next();
		System.out.print("문자 입력 : ");
		str2 = s1.nextLine();

		System.out.println("str1 " + str1);
		System.out.println("str2 " + str2);
	}

}
