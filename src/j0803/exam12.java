package j0803;

class Movie {
	String title;
	int year;
	String director;
	float score;
	
	void print() {
		System.out.printf(" 영화제목:%s\n 개봉년도:%d\n 감독:%s\n 평점:%.2f\n", title, year, director, score);
      }
}

public class exam12 {

	public static void main(String[] args) {
		// 실습 10-08

		Movie mv=new Movie();
		mv.title="Total Recall";
		mv.year=2012;
		mv.director="렌 와이즈먼";
		mv.score=(float)7.2;
		mv.print();
	}

}
