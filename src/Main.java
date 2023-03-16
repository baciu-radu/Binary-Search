import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter array length:\n");
        int arrayLength = in.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = in.nextInt();
        }

        System.out.println("enter element:\n");
        int element = in.nextInt();
        System.out.println(binarySearch(array, element));

    }

    public static int binarySearch(int[] array, int element) {
        int min=0;
        int max = array.length-1;
        int half = (min+max) / 2;

        while (min < max) {
            if (element < array[half]) {
                max = half-1;

            }else if(array[half]==element){return half;
            }else  {
                min = half+1;

            }
            half=(min+max)/2;
        }
        return -1;
    }
}