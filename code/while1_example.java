import java.util.Scanner;

public class while1_example {
    public static void main(String[] args){
        int num;
        int i=0;
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        num = Integer.parseInt(tmp);

        while(i<=num) {
            System.out.println(i);
            i += 1;

        }
    }
}
