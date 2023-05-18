
public class if_example {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if (a < b && c < b && a < c) { //a < c < b
            System.out.println("b가 짱짱 셈");
        }
        else if (a < c && b < a && b < c ) { //b < a < c
            System.out.println("c가 짱짱 셈");
        }
        else { // c < b < a
            System.out.println("a가 짱짱 셈");
        }
    }
}
