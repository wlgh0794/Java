package HomeWork.Advance;

import java.util.Scanner;

public class _02_advance {

	public static void main(String[] args) {
		
		
		/*
		 * 2. 369게임을 작성합니다. 
		 * 1~99까지의 정수를 입력받고 
		 * 3,6,9중 하나가 있으면 "박수짝"을 출력하고 
		 * 2개가 있으면 "박수짝짝"을
		 * 출력하세요 
		 * 예를 들어 
		 * 13은 "박수짝" 
		 * 36인 경우는 "박수짝짝"을 출력하면 됩니다.
		 */
		
		int count = 0 ;
		
		Scanner sc = new Scanner( System.in ) ;
		
		System.out.println( "1 ~ 99 까지의 정수를 입력해주세요 : "  );
		
		int num = ( sc.nextInt() ) ;
		
		System.out.println( "입력 받은 정수의 값 : " + num );
		
		int result1 = num / 10 ;
		
		int result2 = num % 10 ;
		
//		System.out.println(  "십의자리 : " + result1  ) ;
//		
//		System.out.println(  "일의자리 : " + result2 ) ;
		
		
		if ( ( result1 == 3  ) || ( result1 == 6 ) || ( result1 == 9 ) )
		{
			
			++count ;
			
			
		}

		if ( ( result2 == 3  ) || ( result2 == 6 ) || ( result2 == 9 ) )
		{
			
			++count ;
			
			
		}	
		
		
		if ( count == 1 )
		{
			System.out.println( "[결과] : 박수 짝" );
			
		}
		else if ( count == 2 )
		{
			System.out.println( "[결과] : 박수 짝 짝" );
		}
		

	}

}
