import java.util.Scanner;

public class Ex1102 {
    static void check(int n) throws NumberFormatException {
        if (n < 0) {
            throw new NumberFormatException("0보다 작음");
        } else {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("input num : ");
        int num = s.nextInt();
        
        try {
            if (num < 0) {
                throw new NumberFormatException("Too small");
            } else {
                System.out.println("ok : " + num);
            }
            check(num);
        } catch (NumberFormatException e) {
            System.out.println("예외 발생!" + e);
        }
    }
}
