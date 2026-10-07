package Demo;
import java.util.*;
public class GroundAnagrams {
public static List<List<String>> groundAnagrams(String[] words) {
	HashMap<String, List<String>> map = new HashMap<>();
for (String word : words) {
	char[] chars = word.toCharArray();
	Arrays.sort(chars);
	String key = new String(chars);
	map.computeIfAbsent(key,
			k -> new ArrayList<>()).add(word);
}
return new ArrayList<>(map.values());
}
public static void main(String[] args) {
	String[] words = {
			"a","d","v","u","i"};
	System.out.println(groundAnagrams(words));
	}
}
