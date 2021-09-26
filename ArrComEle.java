// Find Common elements in Three sorted Array
class ArrComEle 
{
	public static void main(String args[]) 
	{
		int arr1[] = {1, 4, 25, 55, 78, 99,3};
		int arr2[] = {3, 4, 34, 55, 68, 78};
		int arr3[] = {4, 55, 3, 78, 88, 98};
		int i = 0, j = 0, k = 0, x = 0;

		System.out.println("Array1: ");

		for(x = 0; x < arr1.length; x++)
			{
			System.out.print(arr1[x] + "\t ");
			}

		System.out.println();
		System.out.println("Array2: ");

		for(x = 0; x < arr2.length; x++)
			{
			System.out.print(arr2[x] + "\t ");
			}
		System.out.println();
		System.out.println("Array3: ");

		for(x = 0; x < arr3.length; x++) 
			{
			System.out.print(arr3[x] + "\t ");
			}
		System.out.println("");
		System.out.println("common elements in the 3 sorted arrays are: ");

        while (i < arr1.length && j < arr2.length && k < arr3.length)
			{
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k])
				{
				System.out.print(arr1[i] + " ");
				i++;
				j++;
				k++;
				}
			else if (arr1[i] < arr2[j])
				{
				i++;
				}
			else if (arr2[j] < arr3[k]) 
				{
				j++;
				}
			else
				{
					k++;
					}
			}
	}
}