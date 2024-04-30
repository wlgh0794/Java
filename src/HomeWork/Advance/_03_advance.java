package HomeWork.Advance;

public class _03_advance {

	public static void main(String[] args)
	{
		
				//			3. 다음과 같이 출력하세요.
				//		    *
				//		   ***
				//		  *****
				//		 *******
				//		*********		
		
		// [ 5 X 9 ]
		
		for ( int i = 1 ; i <= 5 ; i++ ) 
		{
			
			for ( int j = 1 ; j <= 9 ; j++ )  
			{	
				
				// ################################
				
				// [ 1개 ]
				
				if ( ( i == 1 ) && ( j == 5 ) )
				{	
					System.out.print( " * " );
				}
				else
				{
					System.out.print( "	" );
				}
				
				// ################################
				
				// [ 3개 ]
				
				if ( ( i == 2 ) && ( ( j >= 4 ) && ( j <= 6 ) ) )
				{	
					System.out.print( " * " );
				}
				else
				{
					System.out.print( "	" );
				}
				
				// ################################
				
				// [ 5개 ]
				
				if ( ( i == 3 ) && ( ( j >= 3 ) && ( j <= 7 ) ) )
				{	
					System.out.print( " * " );
				}
				else
				{
					System.out.print( "	" );
				}
				
				// ################################
				
				// [ 7개 ]
				
				if ( ( i == 4 ) && ( ( j >= 2 ) && ( j <= 8 ) ) )
				{	
					System.out.print( " * " );
				}
				else
				{
					System.out.print( "	" );
				}
				
				// ################################
				
				// [ 9개 ]
				
				if ( ( i == 5 ) && ( ( j >= 1 ) && ( j <= 9 ) ) )
				{	
					System.out.print( " * " );
				}
				else
				{
					System.out.print( "	" );
				}
				
				// ################################
				
				
			}		
		
			System.out.println( "" );
			
		}
		
		

	}

}
