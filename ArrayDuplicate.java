//Find Duplicates in array
class ArrayDuplicate 
{
	public static void main(String[] args) 
	{
		int dup[] = { 1,2,3,4,3,5,2,7,6,5};
		System.out.println("Duplicate elements in given array:");

		for(int i=0; i<dup.length; i++)
			{  
            for(int j=i+1; j<dup.length; j++) 
				{  
                if(dup[i] == dup[j])  
                    System.out.println(dup[j]);  
				 }  
			 }  
	}
}
