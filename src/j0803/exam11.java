package j0803;

class Member1{
	private String id;                                //속성지정
	private String name;
	private int password;
	private int age;
	Member1() {                                     //매개변수가 없는 생성자 만들기
		                                            //호출받은애가 갈데가 없음!
	}
	Member1(String id, String name, int password, int age) { //매개변수가 있는 생성자 만들기
		this.id=id;                                 //this가 붙으면 메인클래스 자기 자신의 이름
		this.name=name;
		this.password=password;
		this.age=age;
	}
	
	void print() {
		System.out.printf(" 아이디: %s\n 이름 : %s\n 비밀번호: %d\n 나이: %d\n", id, name, password, age);
		System.out.println("-------------------------");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class exam11 {

	public static void main(String[] args) {
		// 실습 10-07
		
		Member1 mem1 = new Member1();
		mem1.setId("m001");                               //메인에서 넘겨주는것은 set!
		mem1.setName("홍길동");                             //메인에서 보내는것은 set!
		mem1.setPassword(1234);
		mem1.setAge(34);
		mem1.print();
		
		Member1 mem2 = new Member1();
		mem2.setId("m002");                               
		mem2.setName("홍길순");
		mem2.setPassword(4321);
		mem2.setAge(24);
		mem2.print();
		
		Member1 mem3 = new Member1();
		mem3.setId("m003");                              
		mem3.setName("이순신");
		mem3.setPassword(4433);
		mem3.setAge(28);
		mem3.print();

	}

}
