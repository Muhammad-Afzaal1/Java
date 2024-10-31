import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main (String []  args) {
        int len = 5;
        Scanner keyboard = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("number: ");
            arr[i] = keyboard.nextInt();
        }
        int length = arr.length;
        System.out.println("length is: " + length);
        System.out.println("your enterd numbers are: ");
        for (int num : arr) {
            System.out.println(num);
        }

        int[] source = {1, 2, 3};
        int[] distination = new int[3];
        System.arraycopy(source, 0, distination, 0, source.length);
        System.out.println("distnation array: ");
        for (int num:distination)
        {
            System.out.println(num);
        }

        int[] arr2 = Arrays.copyOf(distination, distination.length);
        System.out.println("We are going to add 2 to distination array: ");
        for (int i = 0; i< distination.length; i++)
        {
            distination[i] = distination[i]+2;
            System.out.println(distination[i]);
        }
        System.out.println("Now arr2");
        for (int i = 0; i< arr2.length; i++)
        {
            System.out.println(arr2[i]);
        }
        System.out.println("It is cloning");
        int[] colonArray = source.clone();
        System.out.println("let's see what will be the impact of adding to source array");
        for (int i = 0; i< source.length; i++)
        {
            source[i] = source[i]+2;
            System.out.println(colonArray[i]);
        }
       Arrays.sort(arr);
        for (int num: arr) {
            System.out.println(num);
        }
        System.out.println("Enter the value that you want to fine: ");
        int value = keyboard.nextInt();
        int index = Arrays.binarySearch(arr,value);
        if (index<0)
        {
            System.out.println("Number is not found");
        }
        else {
            System.out.println("number is present on " +  index);

        }
        Arrays.fill(arr, 2);
        boolean isEqual = Arrays.equals(arr, arr2);
        if(isEqual)
        {
            System.out.println("Booth arrays are equal");

        }
        else
        {
            System.out.println("Booth are not equal");
        }
        String arrayString = Arrays.toString(source);
        System.out.println("Array to string "  + arrayString);
    }

}
