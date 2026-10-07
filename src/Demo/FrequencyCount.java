package Demo;
import java.util.*;
public class FrequencyCount {
public static void main(String[] args) {
	int[] arr = {1,3,4,5,6,7,3};
	HashMap<Integer, Integer> map = new HashMap<>();
	for (int num : arr) {
		map.put(
				num,
				map.getOrDefault(num, 0) + 1);
		
	}
	System.out.println(map);
}
}
