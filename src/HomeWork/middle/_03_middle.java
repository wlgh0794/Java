package HomeWork.middle;

public class _03_middle {

	public static void main(String[] args) {

		/*
		 * 1000이하의 자연수 중에서 
		 * 2의 배수이면서 7의 배수인 숫자를 출력하고, 
		 * 그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요.
		 */	
		
		int num = 0 ;
		
		int sum = 0 ;
		
		
		for ( int i = 0  ; i <= 1000  ; i++  )
		{
			if ( ( i %2 == 0 ) && ( i %7 == 0 ) )
			{
				sum += i ;
				
				if ( i %2 == 0 )
				{
					
					System.out.println( " i 의 값 :  " + i + " [ 2의 배수 ] " );
		
				}
				
				if ( i %7 == 0 )
				{
					
					System.out.println( " i 의 값 :  " + i + " [ 7의 배수 ] " );
		
				}				
				
			}

			
			
		}
		
		
		System.out.println(  "합계 : " + sum  );
		

	}

}
