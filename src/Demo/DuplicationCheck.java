package Demo;
import java.util.*;
public class DuplicationCheck {
 static boolean containsDuplicate(int[] arr) {
	HashSet<Integer> set = new HashSet<>();
	for (int num : arr) {
		if (set.contains(num)) {
			return true;
		}
		set.add(num);
	}
	return false;
}
 public static void main(String[] args) {
	 int[] arr = {10,20,30,40};
	 System.out.println(containsDuplicate(arr));
 }
}
