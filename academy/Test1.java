package academy_0306;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" 오렌지의 개수를 입력하시오: ");
		int orange = sc.nextInt();
		int num = 10;
		
		
		int box = (orange / num);
		int rest = (orange%num);
	

		
		System.out.println( box +" 박스가 필요하고 " + rest + " 개가 남습니다.");
	}

}
