package lab9;

public class plotgraph 
{
    public static int CountEven(int[] a, int Size) {
        int i, evenCount = 0;
        System.out.print("\nมีเลขคู่");
        for (i = 0; i< Size; i++)
        {
          if (a[i] % 2 == 0) 
          {
              System.out.print(+a[i] + "");
              evenCount++;
          }
        }
        return evenCount;
    }
    
    public static int CountOdd(int[] a, int Size)
    {
        int i, oddCount = 0;
        System.out.println("\nมีเลขคี่คือ");
        for (i =0; i< Size; i++)
        {
            if (a[i] % 2 != 0)
            {
                System.out.print(+a[i] + "");
                oddCount++;
            }
        }
        return oddCount;
    }
    
}
