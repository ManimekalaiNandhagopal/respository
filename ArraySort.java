//Array Sort
class ArraySort 
{
	public static void main(String[] args) 
	{
		int sort[] = { 20,90,30,50,10,40,60};
		int temp;
		System.out.println("Original Array is:");
		for(int i=0;i<sort.length;i++)
		{
			System.out.print(sort[i] + "\t");
		}
		for( int i=0; i<sort.length;i++)
		{
			for(int j=i+1;j<sort.length;j++)
			{
				if(sort[i]>sort[j])
				{

					temp=sort[i];
					sort[i]=sort[j];
					sort[j]=temp; 
				}
            }
		}
		System.out.println();
		System.out.println("Sorted Array is:");
		for(int i=0;i<sort.length;i++)
		{
			System.out.print(sort[i] + "\t");
		}

	}
}
