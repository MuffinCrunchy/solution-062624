import java.util.Arrays;

public class Case02 {

    public static void main(String[] args) {
        int num = 5;
        solution0201(num);
        System.out.println();
        solution0202(num);
        System.out.println();
        solution0203(num);
        System.out.println();
        solution0204(num);
    }

    static void solution0201(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void solution0202(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void solution0203(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void solution0204(int num) {
        for (int i = 1; i <= num*num; i++) {
            System.out.print(i);
            if (i % 5 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
