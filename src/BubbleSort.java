import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static int[] bubbleSort(int[] list){
        boolean needNextPass = true;
        for (int k = 1; k < list.length; k++){
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++){
                if (list[i] > list[i+1]){
                    int tmp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = tmp;
                    needNextPass = true;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap size cua mang: ");
        int a = input.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("\n mang sau khi sap xep: " + Arrays.toString(bubbleSort(arr)));
    }
}
