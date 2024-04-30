package HomeWork.Basic;

public class _07_basic {

	public static void main(String[] args) {
		
		
		// 7. 1 ~ 100까지 합을 do ~ while문으로 출력
		
		
		int i = 0 ;
		
		int sum = 0 ;
		
		do
		{
			
			sum += i ; 
			
			System.out.println( "합계 : " + sum  );
			
			i++ ; 
			
		}while( i <= 100  ) ;
		

	}

}
