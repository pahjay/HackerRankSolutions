package DataStructures.Arrays;

import java.util.Scanner;

/**
 * Created by ryan on 3/7/17.
 * https://www.hackerrank.com/challenges/arrays-ds
 */
public class ArraysDS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++)
        {
            nums[i] = scan.nextInt();
        }

        for (int j = N-1; j >= 0; j--)
        {
            System.out.print(nums[j] + " ");
        }
    }

}
