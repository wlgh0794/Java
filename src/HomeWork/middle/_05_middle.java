package HomeWork.middle;

public class _05_middle {

	public static void main(String[] args) {
		
		//#####################################
		
		// 중첩 for문을 이용해서 아래와 같이 출력하세요.
		
		
		/*
		 **
		 **
		 ***
		 ****
		 ******/
		
		
		for ( int i = 1 ; i <= 5 ; i++ )
		{
			
			for ( int j = 1 ; j <= 5 ; j++  )
			{
				
				// ##############################
				
				if ( ( i == 1 ) && ( j == 1 ) )
				{
					System.out.print( " * " );
				}
				
				// ##############################
				
				else if ( ( i == 2 ) && ( j >=  1 ) && ( j <= 2 ) )
				{
					System.out.print( " * " );
				}
				
				// ##############################
				
				else if ( ( i == 3 ) && ( j >=  1 ) && ( j <= 3 ) )
				{
					System.out.print( " * " );
				}
				
				// ##############################
				
				else if ( ( i == 4 ) && ( j >=  1 ) && ( j <= 4 ) )
				{
					System.out.print( " * " );
				}
				
				// ##############################
				
				else if ( ( i == 5 ) && ( j >=  1 ) && ( j <= 5 ) )
				{
					System.out.print( " * " );
				}
				
				// ##############################
				

			}
			
			System.out.println( "" );
		}
		
		System.out.println( "========================" );
		
		//#####################################
		
		// [ 문제 ]
		
//	     *
//	    **
//	   ***
//	  ****
//	 *****		
	
		for ( int i = 1 ; i <= 5 ; i++ )
		{
			
			for ( int j = 1 ; j <= 5 ; j++ )
			{
				
				// ####################################
				
				if ( ( i == 1 ) && ( j >= 1 ) && ( j <= 4 ) )
				{
					System.out.print( " _ " );
					
				}
				if ( ( i == 1 ) && ( j == 5 ) )
				{
					
					System.out.print( " * " );
					
				}
				
				// ####################################
			
				if ( ( i == 2 ) && ( j >= 1 ) && ( j <= 3 ) )
				{
					System.out.print( " _ " );
					
				}
				else if ( ( i == 2 ) && ( j == 4 ) || ( i == 2 ) && ( j == 5 )) 
				{
					
					System.out.print( " * " );
					
				}				
				
				// ####################################
				
				if ( ( i == 3 ) && ( j >= 1 ) && ( j <= 2 ) )
				{
					System.out.print( " _ " );
					
				}
				else if ( ( ( i == 3 ) && ( j == 4 ) ) || ( ( i == 3 ) && ( ( j >= 3 ) && ( j <= 5 )  )  ) ) 
				{
					
					System.out.print( " * " );
					
				}				
				
				// ####################################
				
				if ( ( i == 4 ) && ( j == 1 ) )
				{
					System.out.print( " _ " );
					
				}
				else if ( ( ( i == 4 ) && ( j == 2 ) ) || ( ( i == 4 ) && ( ( j >= 2 ) && ( j <= 5 )  )  ) ) 
				{
					
					System.out.print( " * " );
					
				}				
				
				// ####################################
				
				if ( ( i == 5 ) && ( ( j >= 1 ) && ( j <= 5 ) ))
				{
					System.out.print( " * " );
					
				}
			
				
				// ####################################
				
			}			
			
			System.out.println( "" );
		}
		
		
		System.out.println( "========================" );
		
		//#####################################
		
//		*****
//		****
//		***
//		**
//		*
		
		for ( int i = 1 ; i <= 5 ; i++  )
		{
			for ( int j = 1 ; j <= 5 ; j++  )
			{
				
				// ######################################
				
				if ( ( i == 1 ) && ( ( j >= 1 ) && ( j <= 5 ) )  ) 
				{
					System.out.print( " * " ) ;
				}
				
				// ######################################
				
				if ( ( i == 2 ) && ( ( j == 5 ) )  ) 
				{
					System.out.print( " - " ) ;
				}	
				else if ( ( i == 2 ) && ( ( j != 5 ) )  ) 
				{
					System.out.print( " * " ) ;
				}
				
				// ######################################
				
				if ( ( i == 3 ) && ( ( j >= 4 ) && ( j <= 5 ) ) ) 
				{
					System.out.print( " - " ) ;
				}	
				else if ( ( i == 3 ) && ( ( j >= 1 ) && ( j <= 3 ) ) ) 
				{
					System.out.print( " * " ) ;
				}
				
				// ######################################
				
				if ( ( i == 4 ) && ( ( j >= 3 ) && ( j <= 5 ) ) ) 
				{
					System.out.print( " - " ) ;
				}	
				else if ( ( i == 4 ) && ( ( j >= 1 ) && ( j <= 2 ) ) ) 
				{
					System.out.print( " * " ) ;
				}
				
				// ######################################
				
				if ( ( i == 5 ) && ( ( j == 1 ) ) ) 
				{
					System.out.print( " * " ) ;
				}	
				else if ( ( i == 5 ) && ( ( j != 1 ) ) )
				{
					System.out.print( " - " ) ;
				}
				
				// ######################################
								
			}
			
			System.out.println( "" );
			
		}
		
		System.out.println( "========================" );
		
		
		
		//#####################################
		
//		*****
//		 ****
//		  ***
//		   **
//		    *		
		
		for ( int i = 1 ;  i <= 5 ; i++ )
		{
			
			for ( int j = 1 ; j <= 5 ; j++ )
			{
				
				// ###############################
				
				if ( i == 1 )
				{
				
					System.out.print( " * " );
				
				}
				
				// ###############################
				
				if ( ( i == 2 ) && ( ( j >= 2 ) && ( j <= 5 ) ) )

				{
					System.out.print( " * " );

				}
				else if ( ( i == 2 ) && ( j == 1 ) )
				{
					System.out.print( " _ " );
				}
				
				// ###############################
				
				if ( ( i == 3 ) && ( ( j >= 3 ) && ( j <= 5 ) ) )

				{
					System.out.print( " * " );

				}
				else if ( ( i == 3 ) && ( ( j >= 1 ) && ( j <= 2 ) ) )
				{
					System.out.print( " _ " );
				}
				
				// ###############################
				
				if ( ( i == 4 ) && ( ( j >= 4 ) && ( j <= 5 ) ) )

				{
					System.out.print( " * " );

				}
				else if ( ( i == 4 ) && ( ( j >= 1 ) && ( j <= 3 ) ) )
				{
					System.out.print( " _ " );
				}
				
				// ###############################
				
				if ( ( i == 5 ) && ( ( j == 5 ) ) )

				{
					System.out.print( " * " );

				}
				else if ( ( i == 5 ) && ( ( j >= 1 ) && ( j <= 4 ) ) )
				{
					System.out.print( " _ " );
				}
				
				// ###############################
								
			}
			
			System.out.println( "" );
			
		}
		
		System.out.println( "========================" );
		
		//#####################################
			
		
		
		
	}

}