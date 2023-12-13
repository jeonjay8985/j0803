package j0803;

class Rectangle{    
	
	float width;
	float length;
	float area=width*length;
	float circumference=2*(width+length);
	
	Rectangle() {                                     //매개변수가 없는 생성자 만들기
  }                                                 //호출받은애가 갈데가 없음!
   
	Rectangle(float width, float length) {            //매개변수가 있는 생성자 만들기
    this.width=width;                                 //this가 붙으면 메인클래스 자기 자신의 이름
    this.length=length;
   
  }
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getCircumference() {
		return circumference;
	}

	public void setCircumference(float circumference) {
		this.circumference = circumference;
	}
}
public class exam19 {

	public static void main(String[] args) {
		// 실습 10-15
		
		 Rectangle rc=new Rectangle((float)3.82, (float)8.65); 
         rc.area=rc.width*rc.length;
         rc.circumference=2*(rc.width+rc.length);
       
         System.out.println("면적 : " +rc.getArea());
         System.out.println("둘레 : " +rc.getCircumference());

	}
	/*class Rectangle{
	private double x;
	private double y;
	Rectangle(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public double getArea() {
		double S=x*y;
		return S;
	}
	public double getCircumference() {
		double r=2*x+2*y;
		return r;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
}
    public class Exam15 {

	public static void main(String[] args) {
		Rectangle rc=new Rectangle(3.82,8.65);
		System.out.println("면적: "+rc.getArea());
		System.out.println("둘레: "+rc.getCircumference());
	}*/
}
