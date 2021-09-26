//Find Occurances of an integer in array
class ArrayOccurance 
{
	public static void main(String[] args) 
	{
		int occur[] = { 1,3,5,3,7,9,7,5};
		int count[] = new int[100];
		int temp;
		System.out.println("Given Array:");
		for(int i=0;i<occur.length;i++)
		{
			System.out.print(occur[i] +"\t");
		}

		for(int i = 0; i < occur.length; i++)
		{
             temp = occur[i];
             count[temp]++;
		}
		System.out.println();
		for(int i=1;i<count.length;i++)
		{
			if(count[i]>0 && count[i]==1)
			{
				System.out.println(i+" " + "occurs" + " " +count[i] + " " + "time");
			}
			else if(count[i] >=2)
			{
				System.out.println(i+ " " + "occurs" + " " +count[i] + " " + "time");
			}
		}

	}
}
