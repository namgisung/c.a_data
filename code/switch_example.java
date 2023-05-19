import java.util.Scanner;

public class switch_example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 입력(0 < x < 3): ");
        //scanner로 입력을 받아 문자를 저장하는 변수 input을 선언하여 저장한다
        String input = scanner.nextLine();
        //문자 형태인 input을 정수형태로 바꾼다
        int number = Integer.parseInt(input);

        switch (number) {
            case 1:
                System.out.println("1을 입력했군");
                break;
            case 2:
                System.out.println("2를 입력했군");
                break;
            default:
                System.out.println("멍청하군");
        }
    }
}
