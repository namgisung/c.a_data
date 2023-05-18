import java.util.Scanner;

public class input_example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //scanner로 입력을 받아 문자를 저장하는 변수 input을 선언하여 저장한다
        String input = scanner.nextLine();
        //문자 형태인 input을 정수형태로 바꾼다
        int number = Integer.parseInt(input);

        System.out.println(number);

        scanner.close();
    }
}
