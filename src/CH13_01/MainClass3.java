package CH13_01;

import java.util.HashMap;
import java.util.Map;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		// key는 중복 허용 x, value는 중복 허용 o, 저장순서 x
		
		map.put("홍길동", 27);// 맵에 원소 추가
		map.put("이순신", 27);
		map.put("김유신", 27);
		map.put("홍길동", 35);//홍길동 key값의 value 값만 변경
		
		System.out.println(map.get("홍길동"));// 맵 원소 가져오기
		System.out.println(map.size());// 맵내 원소의 개수
		map.remove("김유신");// 김유신 key 제거
		
		for(String key: map.keySet()) {
			System.out.println("key:"+key+", value:"+map.get(key));
		}
		
		
	}

}
