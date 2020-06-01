import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++)
            arr[i] = scanner.nextInt();

        Profit profit = new Profit();
        int small = profit.minimum(arr, 0); // Index of smallest number
        int max = profit.maximum(arr, small);    // Largest number
    
        if(small == -1)
            System.out.println("you cannot enter negative numbers");
        else
            System.out.println(profit.profit(arr[small], max)); // if profit == 0, then there is no profit
    }

}
