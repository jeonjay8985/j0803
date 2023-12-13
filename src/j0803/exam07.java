package j0803;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		// 실습 10-03
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("시작번호 입력 : ");
		int start;
		start=s1.nextInt();
		
		System.out.print("끝번호 입력 : ");
		int end;
		end=s1.nextInt();
		
		int sum=0;
		
		for(int i=start; i<=end; i++) {
			if(i%4 !=0) {
				sum+=i;
			}
		}
		System.out.printf("%d에서 %d까지의 합계 (4의배수 제외) : %d", start, end, sum);
	}

}
