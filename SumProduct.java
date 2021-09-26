// Sum and products of all elements in array
class SumProduct 
{
	public static void main(String[] args) 
	{
		int sp[] = {2,4,5,9,8,6};
		int sum = 0;
		int mul=1;
		for(int i=0;i<sp.length;i++)
		{
			sum = sum+sp[i];
			mul = mul*sp[i];
		}
		
			System.out.println("sum of all elements" +sum);
			System.out.println("Product of all elements" +mul);
	}
}
