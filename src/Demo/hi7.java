package Demo;

public class hi7 {
static int jumpSearch(int[] arr, int target) {
	int n = arr.length;
	int blockSize = (int) Math.sqrt(n);
	int start = 0;
	int end = blockSize;
	while (start < n && arr[Math.min(end, n) - 1] < target) {
		start = end;
		end += blockSize;
		if (start >= n) {
			return -1;
		}
	}
	for (int i = start; i < Math.min(end, n); i++) {
		if (arr[i] == target) {
			return i;
		}
	}
	return -1;
}
public static void main(String[] args) {
	int[] arr= {17,35,46,67,74,86,82};
	int target = 70;
	System.out.println(jumpSearch(arr, target));
}
}
