# c.a_data
1. 출력
(1) System.out.println(“”);
“”안에 문자를 입력하거나 변수를 입력하여 출력할 수 있다.
문자와 변수를 같이 출력할지 (“”+a)식으로 덧셈 연산자로 합칠 수 있다.
“”안에 \n을 넣어 줄바꿈을 할 수 있다.

(2) System.out.printf();
ex) System.out.printf(“출력%d”,a);
형식화된 출력이고 앞에 출력하려고 하는 문자와 변수를 입력하고 뒤에 변수들을 입력한다.
println은 출력해 줄바꿈을 하지만 printf는 줄바꿈을 하지 않는다.
지시자:
%d 10진수 (정수)
%f 10진수 (실수)
%s 문자 (string)
%c 문자 (char)
%n 줄바꿈

2. 입력
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


3. 변수
ex) int a;
이런 식으로 정수형인 변수 a를 선언한다

ex) int a = 10;
이런식으로 변수를 선언함과 동시에 값을 초기화시켜준다

그리고 처음 변수를 선언하고 최종일 경우 앞에 final을 붙여 준다.
ex) final int a = 0;

변수 기본형 종류
문자형 char
정수형 int
실수형 float, double
