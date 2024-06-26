import java.util.Arrays;

public class Case03 {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 9, 13, 6, 10, 4, 7 ,2};
        solution03(arr);
    }

    static void solution03(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                arr[i] = -1;
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int temp;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        int[] res = new int[arr.length-count];
        for (int i = count; i < arr.length; i++) {
            for (int j = 0; j < res.length; j++) {
                if (res[j] == 0) {
                    res[j] = arr[i];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
