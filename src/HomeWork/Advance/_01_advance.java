package HomeWork.Advance;

import java.util.Scanner;

public class _01_advance {

	public static void main(String[] args) {
		
		
		// #########################################################################
		
		/*
		 * 1. 사용자가 입력한 금액을 
		 * ( 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 )
		 * 각 몇개로 변환되는지 출력하세요. 
		 * 출력 개수는 단위가 큰 것 순서로 계산합니다 예를 들어 78670원이면
		 *  <오만원 1매, 만원 2매, 오천원 1매, 천원 3매
		 *   500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.
		 */
		
		int num ;
		
		System.out.println( " 금액을 설정 해주세요." ) ;
		
		Scanner sc = new Scanner( System.in );  
	
		int input_Data = sc.nextInt() ;
		
		System.out.println( " 설정한 금액 :  " + input_Data + "원 입니다." );
		
		while( input_Data > 0 )
		{
			
			if ( input_Data >= 50000 ) // [ 5만원 ]
			{
				 System.out.println( " 5만원 ( 수량 ) : " +  ( input_Data / 50000) + "개" );
				
				 input_Data -= ( 50000 * ( input_Data / 50000)) ;
						 
				 System.out.println(  "남은 금액 : " + input_Data + "원 입니다." );
				
			}		
			
			if ( input_Data >= 10000 ) // [ 1만원 ]
			{
				 System.out.println( " 1만원 ( 수량 ) : " +  ( input_Data / 10000) + "개" );
				
				 input_Data -= ( 10000 * ( input_Data / 10000)) ;
						 
				 System.out.println(  "남은 금액 : " + input_Data + "원 입니다." );
				
			}				
			
			if ( input_Data >= 5000 ) // [ 5천원 ]
			{
				 System.out.println( " 5천원 ( 수량 ) : " +  ( input_Data / 5000 ) + "개" );
				
				 input_Data -= ( 5000 * ( input_Data / 5000 )) ;
						 
				 System.out.println(  "남은 금액 : " + input_Data + "원 입니다." );
				
			}				
			
			if ( input_Data >= 1000 ) // [ 1천원 ]
			{
				 System.out.println( " 1000원 ( 수량 ) : " +  ( input_Data / 1000 ) + "개" );
				
				 input_Data -= ( 1000 * ( input_Data / 1000 )) ;
						 
				 System.out.println(  "남은 금액 : " + input_Data + "원 입니다." );
				
			}				
			
			if ( input_Data >= 500 ) // [ 오백원 ]
			{
				 System.out.println( " 500원 ( 수량 ) : " +  ( input_Data / 500 ) + "개" );
				
				 input_Data -= ( 500 * ( input_Data / 500 )) ;
						 
				 System.out.println(  "남은 금액 : " + input_Data + "원 입니다." );
				
			}				
			
			if ( input_Data >= 100 ) // [ 백원 ]
			{
				 System.out.println( " 100원 ( 수량 ) : " +  ( input_Data / 100 ) + "개" );
				
				 input_Data -= ( 100 * ( input_Data / 100 )) ;
						 
				 System.out.println(  "남은 금액 : " + input_Data + "원 입니다." );
				
			}			
			if ( input_Data >= 10 ) // [ 십원 ]
			{
				 System.out.println( " 10원 ( 수량 ) : " +  ( input_Data / 10 ) + "개" );
				
				 input_Data -= ( 10 * ( input_Data / 10 )) ;
						 
				 System.out.println(  "남은 금액 : " + input_Data + "원 입니다." );
				
			}	
			
			if ( input_Data >= 1 ) // [ 1원 ]
			{
				 System.out.println( " 1원 ( 수량 ) : " +  ( input_Data / 1 ) + "개" );
				
				 input_Data -= ( 1 * ( input_Data / 1 )) ;
						 
				 System.out.println(  "남은 금액 : " + input_Data + "원 입니다." );
				
			}	
					
			
			
		}
			
			
		// #########################################################################
		
		
		
		
		
		
		
		
		
		
		

	}

}
