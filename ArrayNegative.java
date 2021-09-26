// Move all negative elements in one side
class ArrayNegative 
{
	public static void main(String[] args) 
	{
		int neg[] = { -1,6,8,-4,-3,7};
		int n = neg.length;
		System.out.println("Given Array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(neg[i] +"\t");
		}
		int j = 0, temp;
        for (int i = 0; i < n; i++)
        {
            if (neg[i] < 0)
            {
                if (i != j)
                {
                    temp = neg[i];
                    neg[i] = neg[j];
                    neg[j] = temp;
                }
                j++;
            }
        }
		System.out.println();
		System.out.println("After Arrangement:");

		for (int i = 0; i < n; i++)
		{

            System.out.print(neg[i] + "\t ");
		}
	}
}
