package cls.pkg1;

public class CalssRun1 {

	public static void main(String[] args) {
		
		// public class + 같은 패키지
		// ClassTest1 객체 생성 하기 -> 문제X
		
		ClassTest1 t1 = new ClassTest1();
		t1.method();
		
		// (default) class + 같은 패키지
		// DefaultClass 객체 생성 -> 문제X
		DefaultClass d1 = new DefaultClass();
		d1.method();

		
		
	}
}
