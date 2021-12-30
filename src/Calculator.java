
public class Calculator {

	// 인스턴스 메소드
	// 생성자에서 정의된 값으로 메소드 처리
	/*
	private int x;
	private int y;
	
	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int add() {
		return x+y;
	}
	*/
	
	// static 메소드 처리 방식
	// 매개변수로 전달된 값으로 메소드 처리
	public static int add(int x, int y) throws 천을_넘는_예외, 음수가_되는_예외 {
		
		int result = x + y;
		
		if(result > 1000)
			throw new 천을_넘는_예외();
		
		if(result < 0)
			throw new 음수가_되는_예외();
		
		return x+y;
	}

	public static int sub(int x, int y) {
		return x-y;
	}

	public static int multi(int x, int y) {
		return x*y;
	}

	public static int div(int x, int y) {
		return x/y;
	}
	

}
