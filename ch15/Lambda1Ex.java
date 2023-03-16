package ch15;
@FunctionalInterface //함수적 인터페이스인지 확인
interface MyFunction1{ //추상메서드가 1개여야 한다.
	public void method1();
	
}
class MyFunction1Class implements MyFunction1{
	
	@Override
	public void method1() {
		System.out.println("난 재정의한 함수");
		
	}
}
public class Lambda1Ex {
	public static void main(String[] args) {
		MyFunction1 mf1 = new MyFunction1Class();
		mf1.method1();
//		클래스명 Lambda1Ex$1 익명클래스
		mf1 = new MyFunction1() {
			@Override
			public void method1() {
				System.out.println("난 인터페이스를 직접 지정의 했어");				
			}				
		};
		mf1.method1();
//		람다를 이용하기
		mf1 = () -> { System.out.println("난 람다로 처리한 메서드"); };
		mf1.method1();

	}

}
