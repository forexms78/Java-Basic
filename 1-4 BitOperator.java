
public class BitOperator {
  	public static void main(String[] args) {
      
		System.out.println(~10+15+4<<~-2);
      // ~10 = -11 ~ not연산자 부호를 역으로 바꾼뒤 -1
     
      // 15 +15 +4
      
      // <<를 ~-2만큼 쉬프트 시킨다 -2를 NOT으로 치환시키고 1로 만든위 1만큼 쉬프트
      
      // 8을 쉬프트하면 16 정답은 16
	}
}
