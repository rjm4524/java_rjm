package p0901;

import java.util.Scanner;

public class JA0901_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		String grade = (score>=90)?"A":(score>=80)?"B":(score>=70)?"C":"D";	
		
		System.out.println("당신의 학점:"+ grade);
		
		int i=0;
		i = i+1;
		i += 1;
		
		i = i -1;
		i-=1;
		
		i= i/3;
		i/= 3;
		
		i = i*3;
		i*=3;
		
		String str = new String("abc");
		String str2 = new String("abc");
		if(str.equals(str2)){
			System.out.println("같습니다.");
		}
		else
	    	 System.out.println("다릅니다.");   
		
		//입력한 점수가 60점 이상이면 합격 , 불합격을 출력하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.");
//		int i = scan.nextInt();
//		
//		
//		String result = (i>=60)?"합격":"불합격";
//	
//		System.out.println("합격여부 :"+ result);
		
		
		
		
		
		//두수를 입력받아 큰 수를 출력하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("첫번째 숫자를 입력하세요.");
//		int num1 = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하세요");
//		int num2 = scan.nextInt();
//		
//		int result = (num1>=num2)?num1:num2;
//		
//		System.out.printf("1번쨰 숫자 : %d, 2번쨰 숫자 : %d \n" ,num1,num2);
//		System.out.println("두수 중 더 큰 수:" + result);
		
		
		//절댓값 삼항식

		//		int x = -10;
//		int absX = (x>=0)?x:-x;
//		System.out.println("절댓값 :" +absX);
//		System.out.println("입력값 :" + x);

	}

}
