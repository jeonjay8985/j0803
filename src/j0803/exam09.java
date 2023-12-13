package j0803;

import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {
		// 실습 10-05
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("학생 수 ? ");
		int num;                                    //num=학생수
	    num=s1.nextInt();

		
	    int score[]=null;                           //score=학생성적
		score=new int[num];
		System.out.printf("%d명의 학생 성적을 입력하세요.\n", num);
		
		
		for(int i=0; i<score.length; i++) {          //i=인덱스번호, ex.new int[5]=> 0, 1, 2, 3, 4
			do {
				System.out.printf("%d번째 학생 성적 입력", i+1);     //=>i번째 학생번호=> 1, 2, 3, 4, 5
				score[i]=s1.nextInt();
				if(score[i]<0 || score[i]>100) {     //score[i]=인덱스 값, ex.score[0], score[1],,,
					System.out.println("0~100점 사이로 입력해주세요.");
				}
				}while(score[i]<0 || score[i]>100);
			}
		

		System.out.printf("%d명의 학생 성적은 다음과 같습니다.\n", num);
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i]+" ");
		} 
		
		
		String grade[]=null;                       //grade=학생등급
		grade=new String[num];
		for(int i=0;i<score.length;i++) {          //score i와 grade i 동일 
			if(score[i] >= 90) {                    //=> score에는 정수가 들어가고 
				grade[i]="A";                        //=> grade에는 A~F가 들어감
			}else if(score[i] >=80 ){
				grade[i]="B";
			}else if(score[i] >=70 ){
				grade[i]="C";
			}else if(score[i] >=60 ){
				grade[i]="D";
			}else {
				grade[i]="F";
			}
			
			System.out.printf("%d번 학생의 등급은 %s입니다.\n", i+1, grade[i]);
		}
      }
	}


