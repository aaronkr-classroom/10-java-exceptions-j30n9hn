import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("나누고 싶은 숫자 : ");
        int num = s.nextInt();

        int arr[] = new int[5];


        try {
            arr[num] = 10 / num;
            System.out.println("10/n = " + arr[num]);
        }
        catch(ArithmeticException e) {
            System.out.println("0이 아닌 값 입력");
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("올바른 index 입력 [0,5)]");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("올바른 숫자 입력");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("예외 발생 상괸없이 항상 실행");
        }
        System.out.println("extern try-catch");
    
    }
}
