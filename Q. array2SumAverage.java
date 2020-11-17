package a201117;

public class array2SumAverage {
	public static void main(String[] args) {
		
		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 },
				{ 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };

		int total = 0;
		float average = 0;
		
		for(int i = 0;i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				total += arr[i][j];
				average = (float)total /  (arr.length * arr[0].length);
				
				//  (float)로 선언해야함 값이 제대로 안나옴
				// 평균은 2차배열의 갯수를 알고싶으면 가로안의 형식으로 나타내면됨
			}
		}
		
		System.out.println("total=" + total);
		System.out.println("average=" + average);
	}
}
