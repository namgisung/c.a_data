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

4. 연산자
연산자: 연산을 수행하는 기호(+,-,*,/ 등)
피연산자: 연산자의 작업 대상(변수, 상수, 수식)
ex) x + 3
연산자: +, 피연산자: x, 3
(1) 사칙 연산자 + - * /
사칙 연산자는 아마도 프로그래밍에서 가장 많이 사용되는 연산자들 일 것이다. 피연산자가 정수인 경우, 나누는 수로 0을 사용할 수 없다.
(2) 비교 연산자
a=b 같다
a<b
a>b
a<=b
a>=b

5. if문
if는 "만약"이라는 뜻으로 조건뭉에 쓰인다.
만약 ~라면, ~를 실행한다
ex)
int c = 0;
if (c == 0) {
  system.out.println(c);
}
이처럼 if문 바로 뒤에 조건문을 중괄호 뒤에 써준다.
그리고 그 조건이 참이라면 중괄호 안에 있는 실행문을 작동시킨다.
[참고] 등호를 한번만 쓰면 왼쪽 변수에 오른쪽 값을 지정하는 것이고 등호를 두개쓰면 왼쪽과 오른쪽이 같다가 된다.
만일 조건이 거짓이라면 중괄호 안에 있는 실행문은 동작하지 않고 if문을 빠져나간다.
거짓일때 다르게 샐행 시키려면 else를 쓰면 된다.
ex)
int c = 0;
if (c == 0) {
  system.out.println(c);
}
else {
  system.out.println("false");
}
그리고 2개 이상의 조건식이 있다면 else if를 써서 "만약 ~면 ~를 실행하고 그 조건이 아니라 ~라면 ~를 실행한다" 를 표현할수 있다.
ex)
int c = 0;
if (c == 0) {
  system.out.println(c);
}
else if (c == 1) {
  systme.out.println("2")
  }
else {
  system.out.println("3");
}
코드에서 else if문으로 c가 0이 아니라 1이면 2를 출력한다을 표현한 것이다.
  
6. switch문
if문은 조건식의 결과가 참과 거짓, 두 가지 밖에 없기 때문에 경우의 수가 많아질수록 else if를 계속 추가해야 하므로 조건식이 많아져서 복잡해지고,
여러 개의 조건식을 계산해야하므로 처리시간도 많이 걸린다.
이러한 if문과는 달리 switch문은 단 하나의 조건식으로 많은 경우의 수를 처리할 수 있고, 표현도 간결하므로 알아보기 쉽다.
그래서 처리할 경우의 수가 많은 경우애는 if문 보다 switch문을 작성하는 것이 좋다.
먼저 switch문의 기본구조는 아래와 같다.
switch (조건식) {
  case 값1:
    //조건식의 결과가 값1과 같을 경우 수행될 문장들
    break;
  case 값2:
    //조건식의 결과가 값2과 같을 경우 수행될 문장들
    break;
  default:
    //저건식의 결과와 일치하는 case문이 없을때 수행될 문장들
}
switch문은 조건식을 먼저 계산한 다음, 그 결과와 일치하는 case문으로 이동한다. 
아동한 case문 아래에 있는문장을 수행하며, break문을 만나면 전체 switch문을 빠져나가게 된다.
이러한 switch문은 항상 if문으로 변환이 가능하지만, if문은 switch문의 제약조건때문에 sxitch문으로 작성할 수 없는 경우가 많다.
switch문의 제약조건은 다음과 같다.
  (1) switch문의 조건식 결과는 정수 또는 문자열이어야 한다.
  (2) case문의 값은 정수 상수만 가능하며, 중복되지 않아야 한다.

7. while문
  
8. for문
  
9. break문
  
10. continue문
