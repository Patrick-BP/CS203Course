package longeststring;

public class LongestString {
	public static void main(String[] args) {
		String[] arr = {"Everything", "you", "can", "imagine", "is", "real"};
		System.out.println(smallestString(arr));
	}
	
	static int smallestString(String[] arr) {
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i].length() < arr[result].length()) result = i;
		}
		return result;
	}
}
