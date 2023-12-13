package j0803;
import java.io.FileInputStream;
public class exam04 {

	public static void main(String[] args) throws Exception{  //본문 안에서 try catch문 쓰지 않아도 됨!
		// 파일 읽어내기 (요새는 대부분 데이터 베이스를 이용하여 처리하기 때문에 잘 사용하지는 않음) 
		
		FileInputStream fis =new FileInputStream("c:/temp/data1.txt");
				int ch;
				byte[] bt=new byte[1024];          //(2^10)1024byte=? //kb->mb->gb->tb
				int i=0; 
				while((ch = fis.read()) !=-1)     {//f=-1: 파일의 끝
					bt[i]=(byte)ch;                //한자 한자 읽어서 byte로...?
					i++;
				}
				System.out.print(new String(bt));//System.out.print((char)ch);
				fis.close();
				}
			
	}


