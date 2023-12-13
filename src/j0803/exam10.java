package j0803;

import java.util.Scanner;

class Rabbit{        
	String shape;   
	int xPos;     //int xPos, xPos=0이라고 하면 오류뜸! 음..왜져...??? int xPos=0;하면 오류안뜸!
	int yPos;

	void setPosition() {
		
		Scanner s1=new Scanner(System.in);
		int x=0;
		int y=0;
		
		while(true) {
		System.out.print("토끼가 이동할 X좌표 ==>");
		x=s1.nextInt();
		
		if(x==9999) {
			System.out.println("토끼가 이동을 종료합니다.");
			break;
		}
		
		System.out.print("토끼가 이동할 Y좌표 ==>");
		y=s1.nextInt();
		
		xPos=x;
		yPos=y;
		System.out.printf("토끼의 현재 위치는 (%d, %d)입니다.\n",xPos,yPos);
		}
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
}

public class exam10 {

	public static void main(String[] args) {
		// 실습 10-06
		
	    Rabbit rab1=new Rabbit();
		rab1.setPosition();
		

	}

}
