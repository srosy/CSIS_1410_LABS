package labKeyValuePair1;

import java.util.ArrayList;
import java.util.List;

public class PairApp {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T extends Comparable, K> void main(String[] args) {

		KeyValuePair<String, Integer> p1 = new KeyValuePair<String, Integer>("SLC", 189899);
		KeyValuePair<String, Integer> p2 = new KeyValuePair<String, Integer>("NY", 8244910);
		KeyValuePair<String, Integer> p3 = new KeyValuePair<String, Integer>("LA", 3819702);
		KeyValuePair<String, Integer> p4 = new KeyValuePair<String, Integer>("SF", 812826);

		System.out.println("Original List:");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());

		List<KeyValuePair> cities = new ArrayList<>();
		cities.add(p1);
		cities.add(p2);
		cities.add(p3);
		cities.add(p4);

		System.out.println();

		T first = (T) p1.getKey();
		T second = (T) p2.getKey();
		T third = (T) p3.getKey();
		T fourth = (T) p4.getKey();
		T temp1 = null;
		T temp2 = null;

		if (first.compareTo(second) > 0) {
			temp1 = second;
			second = first;
			first = temp1;

			temp2 = (T) cities.get(1);
			cities.set(1, cities.get(0));
			cities.set(0, (KeyValuePair) temp2);

		}

		if (second.compareTo(third) > 0) {
			temp1 = third;
			third = second;
			second = temp1;

			temp2 = (T) cities.get(2);
			cities.set(2, cities.get(1));
			cities.set(1, (KeyValuePair) temp2);
		}

		if (third.compareTo(fourth) > 0) {
			temp1 = fourth;
			fourth = third;
			third = temp1;

			temp2 = (T) cities.get(3);
			cities.set(3, cities.get(2));
			cities.set(2, (KeyValuePair) temp2);
		}

		if (fourth.compareTo(first) < 0) {
			temp1 = first;
			first = fourth;
			fourth = temp1;

			temp2 = (T) cities.get(0);
			cities.set(0, cities.get(3));
			cities.set(3, (KeyValuePair) temp2);
		}

		if (first.compareTo(second) > 0) {
			temp1 = second;
			second = first;
			first = temp1;

			temp2 = (T) cities.get(1);
			cities.set(1, cities.get(0));
			cities.set(0, (KeyValuePair) temp2);

		}

		System.out.println("Sorted List:");
		System.out.println(cities.get(0).toString());
		System.out.println(cities.get(1).toString());
		System.out.println(cities.get(2).toString());
		System.out.println(cities.get(3).toString());

	}

}
