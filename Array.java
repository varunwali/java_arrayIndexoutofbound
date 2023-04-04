
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        for (int i=0; i<myArray.length;i++){
            myArray[i]=sc.nextInt();
        }
        System.out.println("Enter the index of the required element ::");
        try {
            int element = sc.nextInt();
            System.out.println("Element in the given index is :: "+myArray[element]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The index you have entered is invalid");
            System.out.println("Please enter an index number between 0 and 6");
        }
    }
}