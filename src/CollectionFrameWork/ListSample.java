package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		
		String[] array = new String[] {"가", "나", "다", "라"};
		array[1] = null;
		array[2] = null;
		array[3] = null;
		System.out.println(array.length); 
		System.out.println(Arrays.toString(array));
		
		List<String> list = new ArrayList<>();
		list.add("다");
		list.add("나");
		list.add("가");
		list.add("라");
		System.out.println(list.size());		// 4
		System.out.println(list.toString());	// [다, 나, 가, 라]
		System.out.println(list.get(0));		// 다
		
		list.remove(0);
		list.remove("가");
		System.out.println(list.size());		// 2
		System.out.println(list.toString());	// [나, 라]
		System.out.println(list.get(0));		// 나
		
		list.add(2, "다");
		System.out.println(list.size());		// 3
		System.out.println(list.toString());	// [나, 라, 다]
		
		list.add(2, "X");
		System.out.println(list.size());		// 4
		System.out.println(list.toString());	// [나, 라, X, 다]
												// 해당 인덱스를 교체하는 것이 아니라 끼워넣은 후 한 칸씩 밀림
		list.removeAll(list);
		System.out.println(list.size());		// 0
		System.out.println(list.toString());	// []
		
		System.out.println(list.isEmpty());		// 비어 있는지 확인 -> 비어 있으면 true
	}
}
