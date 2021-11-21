package com.example.demo;

public class prepare_dosa {
	
	
	
	Boolean turn_on_stove=true;
	
	public void turnon_stove()
	{
		if(turn_on_stove==true)
		{
			System.out.println("Are you ready to be super chef in preparing dosa????");
			System.out.println();
		}
	}
	
	
	
	

	public static void main(String[] args) {
	
		Beautiful_dosa dosa=new Beautiful_dosa();
		
		prepare_dosa  prepare=new 	prepare_dosa ();
		
		prepare.turnon_stove();
		
		
	 	dosa.Dosa_spcl();
		

	
	
	
	
		
		


	}

}


