// Array Reverse
class ArrayReverse
{
	public static void main(String[] args) 
	{
		int rev[] = {1,3,5,7,9};
		System.out.println("Original Array:");
		for(int i=0; i<rev.length; i++)
		{
			System.out.print( rev[i] + "\t");
		}
		System.out.println();
		System.out.println("Reverse Array:");
		for(int i=rev.length-1;i>=0;i--)
		{
			System.out.print(rev[i] + "\t");
		}


	}
}
