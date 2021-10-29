package Question5;

public class CompareTwoArrays {
    public static void main(String[] args) {
//        int[] arr1 = {1,3,5,6,6,7};
//        int[] arr2 = {1,3,5,6,6,7};

        int[] arr1 = {1,3,5};
        int[] arr2 = {1,3,5,7};
        System.out.println(comapareArrays(arr1,arr2));
    }
    public static boolean comapareArrays(int[] arr1, int[] arr2) {
        boolean result=false;
        if (arr1.length != arr2.length) return false;
        else {
            for (int i = 0; i < arr1.length; i++) {
                result = (arr1[i] == arr2[i]);
                if(result == false){ result= false; return result;}
            }
        }
        return result;
    }
}
