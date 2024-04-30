package HomeWork.middle;

public class _01_middle {

	public static void main(String[] args) {
		
		
		/*
		 * 1. 1~100까지의 숫자 중 2와 3의 공배수를 출력하세요. 
		 */	

		
		for(int i = 1; i <= 100; i++) 
		{
			if ( ( i % 2 == 0 ) && ( i % 3 == 0 ) )  
			{
				System.out.println("[ 결과 ] : " +  i );
			} 
		}		

	}

}
