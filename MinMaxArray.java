// Find min and max Element in array
class MinMaxArray
{
	public static void main(String[] args) 
	{	
		int arr[] = {23,12,56,31,15}; 
		int max=arr[0];
		int min=arr[0];
		System.out.println("Given Array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +"\t");
		}
		
		for( int i=0;i<arr.length;i++)
		{
			if(arr[i]>max);
			{
				max = arr[i];
			} 
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println();
		System.out.println("Max Element in given array is :" + max);
		System.out.println("Min Element in given array is :" + min);


	}
}
