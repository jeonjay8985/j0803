package j0803;
abstract class Car{            //abstract 붙이면 추상클래스!
	int speed;
	String color;
	
	Car() {
		System.out.println("Car 생성자");
	}
	
	void upSpeed(int value) {
		speed=speed+value;
	}
	void downSpeed(int value) {
		speed=speed+value;
	}
	abstract void work();                               //추상 메소드=>부모 클래스에서는 틀만 맞춰줌, 껍데기 코드
}

class Sedan extends Car{
	int seatNum;
	Sedan() {
		System.out.println("Sedan 생성자");
	}
	void work() {                                        //하는 일이 다르면 실제 하는 행동은 서브클래스에서 정의하면 됨! =>추상메소드를 쓰는 이유
		System.out.println("승용차가 사람을 태우고 있습니다");  //하는 일이 똑같으면 굳이 추상 메소드 쓸 필요 없음! 부모클래스에서 그냥 정의 해놓으면 ok
	}
}

class Truck extends Car{
	int Capacity;
	Truck() {
		System.out.println("Truck 생성자");
	}
	void work() {
		System.out.println("트럭에 짐을 싣고 있습니다");
	}
}



public class exam01 {

	public static void main(String[] args) {
		// 객체 지향 프로그래밍의 응용2
	    //	Car c1 = new Car(); 원래 이렇게 설정하면 됐었었는데 추상 클래스에서는 에러뜸
		
		
		Sedan se1 = new Sedan();
		se1.work();
		Truck tr1 = new Truck();
		tr1.work();
	}

}
