package ch15;
@FunctionalInterface
interface MyInter3{
	int method(int x, int y);
}
public class LambdaReturnEx {
	public static void main(String[] args) {
		MyInter3 mi ;
		mi = (x,y) -> { 
			int result = x + y;
			return result;
		};
		System.out.println("결과 :" + mi.method(12,8));
		
		mi = (x,y) -> { 
			return x + y;
		};
		System.out.println("결과 :" + mi.method(7,6));
		
		mi = (x,y) ->  x + y;
		
		System.out.println("결과 :" + mi.method(11,12));
	}
}
