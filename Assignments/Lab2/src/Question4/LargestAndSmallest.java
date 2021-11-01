package Question4;

import java.util.Arrays;

public class LargestAndSmallest {
    public static void main(String[] args) {

        int[] arr = {1,4,-9,33,19,78,5};

        System.out.println(Arrays.toString(maxMin(arr)));
    }

    public static int[] maxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int[] arr2 = new int[2];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        arr2[0] = max;
        arr2[1] = min;
        return arr2;
    }
    }


