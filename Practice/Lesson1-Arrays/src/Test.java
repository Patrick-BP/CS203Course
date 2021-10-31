import java.util.Arrays;

public class Test {
public static void main(String[] args) {
	//int[] arr = {3,3};
	//System.out.println(Arrays.toString(add(arr, 6)));
int x= 121;
long o ;
System.out.println(isPalindrome(11));

}
//public static int[] add(int[] arr, int target){
//    int[] arr1 = new int[2];
//    for(int i=0; i<arr.length; i++){
//        for(int j=i+1; j<arr.length; j++)
//        if(arr[i] + arr[j] == target){
//            arr1[0] = i;
//            arr1[1] = j;  
//            
//        }
//        
//    }
//    return arr1;
//}


public static boolean isPalindrome(int x) {
    String z = String.valueOf(x);
    StringBuilder s = new StringBuilder();
    StringBuilder y = null ;
    for(int i=z.length()-1; i>=0; i--){
        y = s.append(z.charAt(i));    
    }
   String t = String.valueOf(y);
    if(z.equals(t)) return true;
    else return false;
    
}
}
