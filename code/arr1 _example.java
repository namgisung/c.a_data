import java.util.Arrays; // Arrays.toString()을 사용하기 위한 import

class Arr1{
	public static void main(String[] args) {
        int[] iArr = {100, 95, 80, 70, 60};
        
        // 루프문으로 직접 배열 원소 출력
        for(int i = 0 ; i < iArr.length; i++){
            System.out.println(iArr[i]);
        }

        // Arrays.toString() 메서드 사용하여 심플하게 바로 출력
        System.out.println(Arrays.toString(iArr)); // [100, 95, 80, 70, 60]
	}
}
