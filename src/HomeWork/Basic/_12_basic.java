package HomeWork.Basic;

import java.util.Scanner;

public class _12_basic {

	public static void main(String[] args) {
		  
		
		/*
		 * 12. 정수 10개를 입력받아 배열에 저장하고, 
		 * 이 정수 중에서 2의 배수와 3의 배수를 출력하세요.
		 * 
		 */
		int i = 0 ; 
		
		int iData = 0 ;
				
		int num[] = new int[ 10 ] ;
		
		Scanner sc = new Scanner( System.in ) ;
		
		while( i < num.length )
		{
			System.out.println(  " [ " +  ( i ) + "번 ]  정수 10개를 입력 해주세요." );
			
			iData = sc.nextInt() ;
			
			num[ i ] = iData ;
			
			if ( i > 0 )
			{
				if ( ( iData %2 == 0 ) && ( iData %3 == 0 ) )
				{
					System.out.println( num[ i ] );
					System.out.println( "현재 값은 2배수와 3배수에 포함됩니다." );
							
				}
							
				
			}
				
			i++ ; 
		}
		
		
		sc.close();
		
		
		
		
	}

}
