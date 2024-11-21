package CH13_01;

import java.util.ArrayList;
import java.util.List;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberDto memberDto1 = new MemberDto("홍길동", 27, "서울 용산구", "010-1234-8888", "hong@abc.com");
		MemberDto memberDto2 = new MemberDto("이순신", 32, "서울 종로구", "010-1234-7777", "lee@abc.com");
		MemberDto memberDto3 = new MemberDto("김유신", 41, "서울 은평구", "010-1234-5555", "kim@abc.com");
		
		int[] arr = {1,2,3,4};
		
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
		// MemberDto 클래스로 만든 객체를 모으기 위한(컬렉션) 큰 박스 자료타입 list 선언
		
		memberDtos.add(memberDto1);
		memberDtos.add(memberDto2);
		memberDtos.add(memberDto3);
		memberDtos.add(new MemberDto("강감찬", 31, "인천 미추홀구", "010-1234-5588", "kang@abc.com"));
		
		MemberDto memberDto4 = memberDtos.get(3);//강감찬 memberDto4 객체 반환
		
		for (int i=0;i<memberDtos.size();i++) { // i=0 1 2 3
			String name = memberDtos.get(i).getMname();
			int age = memberDtos.get(i).getMage();
			String addr = memberDtos.get(i).getMaddr();
			String phone = memberDtos.get(i).getMphone();
			String email = memberDtos.get(i).getMemail();
			
			System.out.println(name+"/"+age+"/"+addr+"/"+phone+"/"+email);
			
		}
		
		memberDtos.remove(3);//인덱스 3(강감찬) memberDto 객체 삭제
	}

}
