package j0803;
import java.io.IOException;
public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="java";
		String input="";
		int key;
	
		try {
			System.out.print("이름 : ");
			while((key=System.in.read()) !=13) {       //13은 엔터키값(아스키코드), 	System.read(); 엔터를 치지 않을때까지 돌아간다는 의미!
				input += Character.toString((char)key); // 입력한 정수형태를 문자를 바꿔
			}
			if(userName.equals(input)) {
				System.out.println(input + "님 환영합니다");
			}else {
				System.out.println(input + "님 등록이 안되어 있습니다");
			}
		}catch(Exception e) {  //정확히는 IOException e(error)
			System.out.println("예의 오류 : " +e. getMessage());
		}
	
	}

}
