package xiqian;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class Cat8 {
	public static void main(String[] args) {
		TreeMap<Integer, String> pairs = new // Sort keys in reverse order
		TreeMap<>(Collections.reverseOrder());
		pairs.put(2, "B");
		pairs.put(1, "A");
		pairs.put(3, "C");
		Iterator<Integer> iterator = pairs.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println("Key: " + key + ", Value: " + pairs.get(key));
		}
	}
}
