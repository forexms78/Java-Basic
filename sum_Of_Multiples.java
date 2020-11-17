package a201117;

import java.util.stream.IntStream;

public class sum_Of_Multiples {

	public static void main(String[] args) {
		
		System.out.println(IntStream.range(1, 1000).filter(j -> j%3==0 || j%5 ==0).sum());
		
	}
}
