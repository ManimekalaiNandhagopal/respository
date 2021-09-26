// Rearrange All Positive and Negative Numbers
import java.util.Scanner;
class AlternatePosNeg
{ 
    public static void Rearrange(int array[], int n)
    {
        int i = -1;
        for (int j = 0; j < n; j++)
        {
            if (array[j] > 0)
            {
                i = i + 1;
                array[i] = (array[i] + array[j]) - (array[j] = array[i]);
            }
        }
        
        int positive_index = 0, negative_index = i + 1;
       
        while (negative_index < n && negative_index > positive_index && array[negative_index] < 0)
        {
            array[negative_index] = (array[negative_index] + array[positive_index]) - (array[positive_index] = array[negative_index]);
            positive_index = positive_index + 2;
            negative_index = negative_index + 1;
        }
    }
    public static void main(String[] args)  
    { 
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sr.nextInt();
        }
        Rearrange(a, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}