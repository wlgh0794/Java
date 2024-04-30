package HomeWork.Basic;

import java.util.Scanner;

public class _10_basic {

	public static void main(String[] args) {
		
		/*
		 * 10. int배열을 10개 생성해서 
		 * 사용자로부터 10개의 값을 입력받고 
		 * 순서대로 출력하고 총합을 구하세요.
		 */
		
		int num[] = new int[ 10 ] ;
		
		int sum = 0 ;
		
		Scanner sc = new Scanner( System.in ) ;
		
		int i = 0 ;
		
		while( i <= num.length - 1 )
		{
			
			System.out.println( "정수형 데이터를 10개 입력해주세요" );
			
			
			num[ i ] = sc.nextInt(  ) ;
			
			System.out.println( "[ " + i +"번 ] " + "입력한 값 " + num[ i ] );
			
			sum += num[ i ] ;
			
			++i ;
		}
		
		
		System.out.println( "합계  : " + sum );
		
		
		

	}

}
