import java.util.Arrays; // Arrays.toString()을 사용하기 위한 import

class Arr_int{
	public static void main(String[] args) {
    in[] arr = new int[5];

    for(int i=0; i < arr.length;i++)
      arr[i] = i + 1;

    System.out.println("변경전 - arr.length"+arr.length);
    for(int i=0; i < arr.length;i++)
      System.out.println("arr["+i+"]:"+arr[i]);
    int[] tmp = new int[arr.length*2];
    for(int i = 0; i < arr.length; i++)
	    tmp[i] = arr[i];

    arr = tmp;
    System.out.println("변경후 - arr.length:"+arr.length)
    for(int i=0; i < arr.length;i++)
	    System.out.println("arr["+i+"]:"+arr[i])
  }
}
