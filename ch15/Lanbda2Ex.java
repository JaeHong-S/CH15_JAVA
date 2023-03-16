package ch15;
@FunctionalInterface
interface MyFun2{
	void method(int x) ;
}
public class Lanbda2Ex {
	public static void main(String[] args) {
		MyFun2 mf2;
		mf2 = (x) -> {
			int result = x * 5;
			System.out.println("결과 : " + result);
		};
		mf2.method(4);
		mf2 = (x) -> {System.out.println("결과 : " + x*3);};
		mf2.method(3);
//		매개변수가 한대일 경우에는 소괄호 생략 가능
		mf2 = x -> {System.out.println("결과 : " + x*4);};
		mf2.method(4);
//		문장이 하나일 경우
		mf2 = x -> System.out.println("결과 : " + x*7);
		mf2.method(7);
	}
}
