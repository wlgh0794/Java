package HomeWork.middle;

import java.util.Random;

public class _04_middle {

	public static void main(String[] args) {
		
		/*
			5.  20개 배열을 선언하세요.
			    20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
			    인덱스의 홀수번째는 앞에서부터 출력하고
			    짝수번째는 뒤에서부터 출력하세요.
		 */
		
		Random random = new Random() ;
		
		int num = 0 ;

		
		int Array1[] = new int[ 20 ] ;
		
		for ( int i = 0 ; i < Array1.length ; i++ )
		{
				
			num = random.nextInt( 100 ) + 1 ;
			
			Array1[ i ] = num ;
			
			if ( i %2 == 0 )
			{

				Array1[ i ] = num ;
				
				System.out.println( "[ " + i + " ]" + num + " - [ 짝수입니다. ]" ) ;	
					
			}
			else
			{
	
				Array1[ i ] = num ;
			
				System.out.println( "[ " + i + " ]" + num + " - [ 홀수입니다. ]" ) ;	
								
			}				
			
		
		}
		
		System.out.println( "=======================" );
		 
		// 짝수  -> 뒤
		for ( int i = Array1.length - 1 ; i >= 0 ; i-- )
		{
			
			if ( i %2 == 0 ) // 짝수 
			{
				System.out.println( " [짝수] " +  Array1[ i ] );
			}

				
		}
		
		System.out.println( "=======================" );
		 
		//  홀수 -> 앞
		for ( int i = 0 ; i < Array1.length ; i++ )
		{
			
			if ( i %2 != 0 ) // 홀수
			{
				System.out.println( " [홀수] " +  Array1[ i ] );
			}

				
		}
		
		System.out.println( "=======================" );
		 
	}

}
