package Demo;

public class hi {
	public static void main(String[] args) {
	int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
	int target = 60;
	int left = 0;
	int right = arr.length - 1;
	while (left <= right) {
		int mid = left + (right - left) / 2;
		if (arr[mid] == target) {
			System.out.println("Elements found at index: " + mid);
			break;
		}
		if (arr[mid] < target) {
			left = mid + 1;
		} else {
			right = mid - 1;
		}
	}
	}
}
