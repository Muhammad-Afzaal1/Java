import java.util.Scanner;
public class Array {
    public static void main (String []  args)
    {
        int len = 5;
        Scanner keyboard = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter five numbers: ");
        for (int i = 0; i<5; i++)
        {
            System.out.print("number: ");
            arr[i] = keyboard.nextInt();
        }
        int length = arr.length;
        System.out.println("length is: " + length);
        System.out.println("your enterd numbers are: ");
        for (int num: arr)
        {
            System.out.println(num);
        }
    }


}
