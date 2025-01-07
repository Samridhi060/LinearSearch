import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<size;i++){
            arr[i] = input.nextInt();
        } 
        System.out.println("Enter the element to be searched: ");
        int target = input.nextInt();
        int result = searching(arr, target);
        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: "+result);
        }
        


}
    static int searching(int[] arr,int target){
        if(arr.length == 0){return -1;}
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == target){
              return i;
            }
        }
        return -1;
    }
}