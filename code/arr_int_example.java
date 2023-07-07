import java.util.Arrays; // Arrays.toString()을 사용하기 위한 import

public static void main(String[] args) {
        // int 형 배열 선언 & 초기화
	int[] score = new int[5]; // int 타입의 값 5개가 저장될 빈 공간 생성
	score[0] = 10; // 각 빈공간에 값을 초기화
	score[1] = 20;
	score[2] = 30;
	score[3] = 40;
	score[4] = 50;

// for문으로 배열을 순차적으로 순회에 값을 넣어주는 방법도 있다.
	int[] number =new int[5];
	for(int i = 1 ; i < score.length ; i++){
		number[i] = i * 10;
	}

// 처음부터 선언 + 초기화를 한번에 진행
	int[] score2 = {10, 20, 30, 40, 50};
	int value = number[1]
    	System.out.println(Arrays.toString(score));
    	System.out.println(Arrays.toString(number));
    	System.out.println(Arrays.toString(score2));
  }

