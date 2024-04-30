package HomeWork.Basic;

import java.util.Random;

public class _11_basic {

	public static void main(String[] args) {
		
		/*
		 * 11. int 배열로 10개의 공간을 생성하세요. 
		 * 1 ~ 10까지의 임의의 수를 저장하고 홀수만 골라서 출력하세요.
		 */

		
		int num_list[] = new int[ 10 ] ;
		
		Random random = new Random() ;
		
		
		
		for ( int i = 0 ;  i < num_list.length ; i++ )
		{
			
			// [ 0 , 1 , 2 ] 중 랜덤한 값
			int randomVal = random.nextInt( 10 ) + 1 ;			
			
			
			num_list[ i ] = randomVal ; 
			
			System.out.println(  "input 데이터 : " + num_list[ i ]  );
		}
		
		
		for ( int i = 0  ; i < num_list.length   ; i++ )
		{
			
			if( num_list[ i ] % 2 == 0 )
			{
//				System.out.println(  "짝수 입니다" );	

			}
			else
			{
				System.out.println( num_list[ i ] + " 데이터는 홀수 입니다" );	
			}
			
			
		}
		
		
	}

}
