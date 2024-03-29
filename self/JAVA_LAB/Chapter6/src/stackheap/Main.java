package stackheap;

public class Main {
	
	// 전역 변수
	private int globalVariable;

	public static void main(String[] args) {
		recursive();
	}
	
	public static void recursive() {
		// Stack = Last in First Out (LIFO)
		// 지역 변수 = 메서드 안에서만 사용되는 변수 -> STACK 이라는 공간에 저장된다.
		// stack 이라는 변수이름이 STACK 공간에 저장되고, new Stack() -> Heap 에 저장됨
		Stack stack = new Stack();
		stack.increase();
		recursive();
	}
}
