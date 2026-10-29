import java.util.Arrays; 

public class Arrays_operation {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = {5,7,8,9};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        int[] arr3 = Arrays.copyOfRange(arr1, 0, 2);
        
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
