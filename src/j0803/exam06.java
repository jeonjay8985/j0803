package j0803;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		// 실습 10-02
		
		Scanner s1= new Scanner(System.in);
		
		System.out.print("출생 연도를 입력하세요 ==> ");
	    int year;
	    year=s1.nextInt();
	    
	    int num;
	    num=year%12;
	    		
		switch(num) {
		case 0 :
			System.out.println("원숭이띠");
			break;
		case 1 :
			System.out.println("닭띠");
			break;
		case 2 :
			System.out.println("개띠");
			break;
		case 3 :
			System.out.println("돼지띠");
			break;
		case 4 :
			System.out.println("쥐띠");
			break;
		case 5 :
			System.out.println("소띠");
			break;
		case 6 :
			System.out.println("호랑이띠");
			break;
		case 7 :
			System.out.println("토끼띠");
			break;
		case 8 :
			System.out.println("용띠");
			break;
		case 9 :
			System.out.println("뱀띠");
			break;
		case 10 :
			System.out.println("말띠");
			break;
		case 11 :
			System.out.println("양띠");
			break;
		}
	}
}
