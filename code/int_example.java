public class variable_example {
    public static void main(String[] args) {
        //int를 사용하여 정수값을 지정하는 변수를 선언한다
        int x = 10;
        int y = 20;
        int tmp = 0;

        System.out.println("x:"+ x+"y:"+y);

        tmp = x;
        x=y;
        y=tmp;

        System.out.println("x:"+ x+"y:"+y);
    }
}
