
package slob3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int size = 10;
		int[] n = new int[size];
		Scanner sc = new Scanner(System.in);
		float sum = 0;
		int min = Integer.MAX_VALUE, max = 0;
		for (int i = 0; i < size; i++)
		{
			System.out.print("Number " + i +" : ");
			n[i] = sc.nextInt();

			if (n[i] > max)
			{
				max = n[i];
			}

			if (n[i] < min)
			{
				min = n[i];
			}
		}

		for (int i = 0; i < size; i++)
		{
			System.out.print(n[i] + ", ");
			sum += n[i];
		}
		System.out.println();
		System.out.println("Sum : " + sum);
		System.out.println("AVG : " + sum/size);
		System.out.println("Min : " + min);
		System.out.println("Max : " + max);

    }
    
}
