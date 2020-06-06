package calender;

import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	//키보드로 입력받은 두 수의 합을 구해보자
	
	// 키보드로 입력받은 수를 할당할 변수 설정
	int a,b;
	
	// 키보드로 입력받을 스캐너 생성
	Scanner sc = new Scanner(System.in);
	String s1, s2;
	s1 = sc.next();
	s2 = sc.next();
	a = Integer.parseInt(s1);
	b = Integer.parseInt(s2);
	System.out.println(a+"+"+b+"="+(a+b));
	System.out.printf("%d + %d = %d", a,b,a+b);
}
}
