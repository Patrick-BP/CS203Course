package Question4;

public class LargestAndSmallest{
    public static void main(String[] args) {
        int[] arr = {1,4,-9,33,19,78,5};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]> max) max = arr[i];
            if(arr[i]< min) min = arr[i];
        }
        System.out.println("largest number is: "+ max);
        System.out.println("smallest number is: "+ min);
    }
}
