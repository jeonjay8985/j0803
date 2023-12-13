package j0803;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		// 실습 10-04
		
		Scanner s1=new Scanner(System.in);

		System.out.println("김연아 선수 경기 끝났습니다~~ 짝짝짝");
		
		int sum=0;
	    double avg=0;
	
        System.out.println("김연아 선수 경기 끝났습니다~~ 짝짝짝");
		
		int score[]=new int[5];
	
		for(int i=0;i<score.length;i++) {
			do {
				System.out.print("평가 점수==>");
				score[i]=s1.nextInt();
				if(score[i]<0 || score[i]>10) {
					System.out.println("점수가 잘못입력되었습니다(0~10), 다시 입력");
				}
			}while(score[i]<0 || score[i]>10);
			sum+=score[i];
		}
		
		avg=(double)sum/5;
		System.out.printf("심사위원 평균 점수 : %.2f",avg);

		
	    /*
		System.out.print("평가 점수==>");
		int num=s1.nextInt();                         //num으로 score 크기를 받고
		int score[] = new int[num];
		
		for(int i=0; i<score.length; i++) {           //그 크기 여기서 i번호 정할때 사용
			do{	
				System.out.print("평가 점수==>");
				score[i]=s1.nextInt();                //그 다음에 score값을 받음
				if (score[i]<0 || score[i]>10) {
					System.out.println("점수가 잘못입력되었습니다(0~10), 다시 입력");
				}
			}while(score[i]<0 || score[i]>10);
			sum+=score[i];
		}
		avg=(double)sum/num;
		System.out.printf("심사위원 평균 점수 : %.2f",avg);  //해보니까 최초의 num만큼 score크기 정해짐 ㅋㅋㅋ
	
	}*/

		/*
        int score;
        int sum=0;
        double avg =0.0;
     
		System.out.println("김연아 선수 경기 끝났습니다~~ 짝짝짝");
		
		do {
			System.out.print("평가 점수==> ");
			score=s1.nextInt();
			if (score<0 || score>10) {
				System.out.println("점수가 잘못입력되었습니다(0~10), 다시입력 ");	
			}
		}while(score<=10);
		
		sum=sum+score;
		avg=sum/10;
		
		System.out.print("심사위원 평균 점수 : " +avg);
		*/
	}	
}  


