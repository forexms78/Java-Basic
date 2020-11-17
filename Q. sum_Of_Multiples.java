package a201117;

import java.util.stream.IntStream;

public class sum_Of_Multiples {

	public static void main(String[] args) {
		
		System.out.println(IntStream.range(1, 1000).filter(j -> j%3==0 || j%5 ==0).sum());
		
		// IntStream을 이용해서 범위를 지정하고 1부터 1000미만의 수를 지정 rangeclosed 를 사용하면 1부터 1000이하의 수
		// 미만과 이하의 차이 .filter를 통해서 람다를 이용해 조건을 or문으로 걸고 더하여 값을 출력
	}
}
