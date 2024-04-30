package HomeWork.Basic;

public class _09_baisc {

	public static void main(String[] args) {
		
		/*
		 * 9. int 10개짜리 배열 생성하여 
		 * int배열에 3의 배수를 차례대로 저장하세요. 
		 * 그리고 거꾸로 출력하세요.
		 */
		
		int num[] = new int[ 10 ] ; 
		
		
		for ( int i = 0 ; i < num.length  ;  i++ )
		{
		
			num[ i ] = ( 3 * i ) ;
			
			System.out.println( i + "번 데이터 : " + num[ i ] );
			
			
		}
		
		System.out.println( "=============" );
		
		for ( int j = num.length - 1  ; j > 0  ; j-- )
		{
			
			System.out.println( j + "번 데이터 : " + num[ j ] );
			
		}
		
		
	}

}
