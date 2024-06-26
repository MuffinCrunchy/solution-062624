public class Case01 {
    public static void main(String[] args) {
        int num = 15;
        solution01(num);
    }

    static void solution01(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print("OKYES");
            } else if (i % 3 == 0) {
                System.out.print("OK");
            } else if (i % 4 == 0) {
                System.out.print("YES");
            } else
                System.out.print(i);
            System.out.print(" ");
        }
    }
}
