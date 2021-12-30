
public class Program {

	public static void main(String[] args) {

		// 인스턴스 메소드 처리 방식
		/*
		Calculator calc = new Calculator(3,4);
		calc.add();
		System.out.printf("calc.add: %d", calc.add());
		*/
		
		// static 메소드 처리 방식
		Calculator clac = new Calculator();
		
		int result = 0;
		
		/*try {
			result = Calculator.add(3,-1004);
		} catch (천을_넘는_예외 e) {
			//System.out.println("1000을 넘는 숫자를 입력하였습니다.");
			System.out.println(e.getMessage());			
		//} catch (음수가_되는_예외 e) {
		//	System.out.println("음수 처리");
		} catch (Exception e) {
			System.out.println("모든 예외처리");
		}
		finally {
			System.out.println("무조건 처리");
		}*/
		
		result = Calculator.add(3,-1004);
		System.out.printf("add: %d\n", result);
		result = Calculator.sub(3,4);
		System.out.printf("sub: %d\n", result);
		result = Calculator.multi(3,4);
		System.out.printf("multi: %d\n", result);
		result = Calculator.div(3,4);
		System.out.printf("div: %d\n", result);
		

	}

}
