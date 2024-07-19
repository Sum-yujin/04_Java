package practice;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);
	
	
	/* [실습 문제 1]
		길이가 9인 배열을 선언 및 할당하고, 
		1부터 9까지의 값을 반복문을 이용하여
		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		짝수 번째 인덱스 값의 합을 출력하세요. 
		(0 번째 인덱스는 짝수로 취급)
	*/
	public void practice1() {
		
		int[] arr = new int[9]; // 배열 선언, 할당
		
		// 배열 요소 초기화
		for(int i=0; i<arr.length ; i++) {
			arr[i] = i + 1;
		}
		
		//출력 및 합계
		int sum = 0;
		
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
			
			if(i % 2 ==0 ) { // 짝수번째 인덱스 요소 합
				sum += arr[i];
			}
		}
		
		// \n : 줄바꿈 (개행) 문자
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}
	
	/* [실습 문제 2]
	길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	*/
	public void practice2() {
int[] arr = new int[9]; // 배열 선언, 할당
		
		// 배열 요소 초기화
		for(int i=arr.length ; i>0 ; i--) {
			arr[9-i] = i;
		}
		
		//출력 및 합계
		int sum = 0;
		
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
			
			if(i % 2 !=0 ) { // 짝수번째 인덱스 요소 합
				sum += arr[i];
			}
		}
		
		// \n : 줄바꿈 (개행) 문자
		System.out.println("\n수 번째 인덱스 합 : " + sum);
	}
	
	
	
	/* [실습 문제 3]
	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
	*/
	public void practice3() {
		
		System.out.print("양의 정수: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = i +1;
			System.out.print(arr[i] + " ");
		}
	}
	
	
	/* [실습 문제 4]
	정수 5개를 입력 받아 배열을 초기화 하고
	검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
	배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
	*/
	public void practice4() {
		
		int[] arr = new int[5];
		
		for(int i=0; i < arr.length; i++) {
			System.out.printf("입력 %d  : ",i);
			int inputNum = sc.nextInt();
			arr[i] = inputNum;
		}
		System.out.print("검색할 값 : ");
		int find = sc.nextInt();
		boolean flag = false;

		for(int i=0; i < arr.length; i++) {
//			System.out.print(arr[i] + "");
			if( find == arr[i]) {
				flag = true;
				System.out.println("인덱스 : " + i );
			}
		}
		if( flag == false) System.out.println("일치하는 값이 존재하지 않습니다.");
	}
	
	/* [실습 문제 5]
	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
	*/
	public void practice5() {
		System.out.print("정수 : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len]; 
		
		for(int i= 0; i < arr.length; i++ ) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		int sum = 0;
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\n총 합 : " + sum);
	}
	
	
	/* [실습 문제 6]
	주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
	단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
	*/
	public void practice6() {
		System.err.print("주민등록번호(-포함) : ");
		String reg= sc.next();
		
		char[] arr = new char[reg.length()];
		
		for (int i = 0; i < reg.length() ; i++ ) {
			if( i >7)  arr[i] = '*' ;
			else arr[i] = reg.charAt(i);
		}
		for (int i = 0; i <reg.length() ; i++ ) {
			System.out.print(arr[i]);
		}
	}
	
	
	//--------------------------------------------------------------------------------------------------------------------
	
	/* [실습 문제 7]
	3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
	다시 정수를 받도록 하세요.
	*/
	public void practice7() {
		
		int len;
		
		while(true) {
			System.out.print("정수 : ");
			len = sc.nextInt();
			if(len % 2 != 0 && len > 3) {
				break;
			}
			System.out.println("다시 입력하세요");
		}
		
		int[] arr = new int[len];
	
		for(int i=0; i < arr.length ; i++ ) {
			if( i <= arr.length/2) {
				arr[i] = i+1;
			}
			for(int j =0; j< arr.length/2; j++) {
				
			 
			}
			
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.print( arr[i] + " ");
		}
		
	}
	
	//---------------------------------------------못 품 ↑------------------------------------------------------------------
	
	/* [실습 문제 8]
	3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
	다시 정수를 받도록 하세요.
	*/
	public void practice8() {
		int[] arr = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() * 10 +1);
		}
		
		System.out.print ("발생한 난수 : ");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print (arr[i] + " ");
		}
	}
	
	
	/* [실습 문제 9]
	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
	1~10 사이의 난수를 발생시켜 배열에 초기화 후
	배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
	*/
	public void practice9() {
		
		int[] arr = new int[10];
		
		int min = 10;
		int max =1;
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() * 10 +1);
		}
		
		System.out.print ("발생한 난수 : ");
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print (arr[i] + " ");
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
				
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	

	/* [실습 문제 10]
	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
  	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
	*/
	public void practice10() {
		
		int[] arr = new int[10];
		
		for(int i= 0; i< arr.length; i++) {
			arr[i] = (int)(Math.random()*10 +1);
			for(int j =0; j < i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}

		for(int i= 0; i< arr.length; i++) {
			System.out.print( arr[i] + " ");
		}
	}	
	
	
	
	/* [실습 문제 11]
	로또 번호 자동 생성기 프로그램을 만들기.
	(중복 값 없이 오름차순으로 정렬하여 출력하세요.)
	*/
	public void practice11() {
	int[] arr = new int[10];
		
		for(int i= 0; i< arr.length; i++) {
			arr[i] = (int)(Math.random()*10 +1);
			for(int j =0; j < i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}

		for(int i= 0; i< arr.length; i++) {
			System.out.print( arr[i] + " ");
		}
		
	}
	
	
	
	
	
}
