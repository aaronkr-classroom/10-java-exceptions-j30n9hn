class Myexception extends Exception {
    String str1;
    Myexception(String str2) {
        str1 = str2;
    }
    public String toString() {
        return ("Myexception 발생" + str1);
    }
}
public class Ex1103 {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
            throw new Myexception("call myexception");
        } catch (Myexception e) {
            System.out.println("catch block");
            System.out.println(e);
        }
    }
}
