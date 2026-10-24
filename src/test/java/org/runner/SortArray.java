package org.runner;

public class SortArray 

{
	public static void main(String[] args) 
	{
		
		int a[] = {3,33,65,73,12,1,55,754,22};
		
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			System.out.println(a[i]);
		}	
	}
}


//iteration---1
//index i=0 ; check on i+1=1 index j =1,2,3,4,5,6,7,8 ,
//check with condition [i]><[j] with remaining if condition true then swap happens

//iteration---2
//index i=1 ; check on i+1=2 index j =2,3,4,5,6,7,8,
//check with condition [i]><[j] with remaining if condition true then swap happens 

//iteration---3
//index i=2 ; check on i+1=3 index j =3,4,5,6,7,8 ,
//check with condition [i]><[j] with remaining if condition true then swap happens

//iteration---4
//index i=3 ; check on i+1=4 index j =4,5,6,7,8 ,
//check with condition [i]><[j] with remaining if condition true then swap happens

//iteration---5
//index i=4 ; check on i+1=5 index j =5,6,7,8 ,
//check with condition [i]><[j] with remaining if condition true then swap happens

//iteration---6
//index i=5 ; check on i+1=6 index j =6,7,8 ,
//check with condition [i]><[j] with remaining if condition true then swap happens

//iteration---7
//index i=6 ; check on i+1=7 index j =7,8 ,
//check with condition [i]><[j] with remaining if condition true then swap happens

//iteration---8
//index i=7 ; check on i+1=8 index j =8 ,
//check with condition [i]><[j] with remaining if condition true then swap happens





















