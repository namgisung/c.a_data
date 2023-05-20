# c.a_data
1. 출력
(1) System.out.println(“”);
“”안에 문자를 입력하거나 변수를 입력하여 출력할 수 있다.
문자와 변수를 같이 출력할때 (“”+a)식으로 덧셈 연산자로 합칠 수 있다.
“”안에 \n을 넣어 줄바꿈을 할 수 있다.

(2) System.out.printf();
ex) System.out.printf(“출력%d”,a);
형식화된 출력이고 앞에 출력하려고 하는 문자와 변수를 입력하고 뒤에 변수들을 입력한다.
println은 출력하면 줄바꿈을 하지만 printf는 줄바꿈을 하지 않는다.
지시자:
%d 10진수 (정수)
%f 10진수 (실수)
%s 문자 (string)
%c 문자 (char)
%n 줄바꿈

2. 입력
먼저 입력 받기 위해 scanner를 import해준다.
import java.util.Scanner;
그리고 실행할 코드를 입력하는 곳에 scanner를 사용할 함수를 선언해 준다.
Scanner scanner = new Scanner(System.in);
scanner로 입력을 받아 문자로 저장하는 변수를 선언한다.
String input = scanner.nextLine();
문자를 받는 변수를 선언한 후에 입력을 잗아 저장하는 것도 상관없다.
ex)
String input;
input = scanner.nextLine();
출력할때는 println을 쓰거나 printf를 쓰면 된다.
System.out.println(input);
System.out.printf(“%s”,input);

3. 변수
ex) int a;
이런 식으로 정수형인 변수 a를 선언한다

ex) int a = 10;
이런식으로 변수를 선언함과 동시에 값을 초기화시켜준다

그리고 처음 변수를 선언하고 최종일 경우 앞에 final을 붙여 준다.
ex) final int a = 0;

변수 기본형 종류
문자형: char, string
정수형: int
실수형: float, double
(char은 한 문자만 저장할수 있으면 저장할때 문자 양쪽에 '를 붙여줘야 한다. string은 문자나 문자열을 저장할수 있으며 저장할때 양쪽에 "를 붙여줘야 한다)

4. if문

5. switch문
