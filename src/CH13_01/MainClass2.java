package CH13_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("김유신");
		set.add("이순신");
		set.add("홍길동");
		set.add("김유신");
		set.add("홍길동");
		
		System.out.println(set.size());
		
		Iterator<String> iterator = set.iterator(); // iterator(반복자) 생성
		
		
		
		
	}

}
