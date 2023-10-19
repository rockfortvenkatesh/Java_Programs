package Interview_String_Code;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RemovieCharByKey {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		map.put("Apple", 3);
		map.put("Orange", 5);
		map.put("Fig", 4);

		System.out.println(map);

		List<String> list = new ArrayList<String>();

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (m.getKey().length() > m.getValue()) {
				list.add(new StringBuilder(m.getKey()).deleteCharAt(m.getValue()).toString());
			} else {
				list.add(m.getKey());
			}
		}
		System.out.println(list);
	}

}
