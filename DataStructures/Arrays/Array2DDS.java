package DataStructures.Arrays;

import java.util.Scanner;

/**
 * Created by ryan on 3/7/17.
 * https://www.hackerrank.com/challenges/2d-array
 */
public class Array2DDS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[][] nums = new int[6][6];
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                nums[i][j] = scan.nextInt();
            }
        }

        // top row    = nums[i][j] + nums[i][j+1] + nums[i][j+2]
        // middle row = nums[i+1][j+1]
        // bottom row = nums [i+2][j] + [i+2][j+1] + [i+2][j+2]
        // offset top, middle, bottom on X axis until edge i == 3(?), then increase j and reset i value
        int i = 0, j;
        int highest = 0;

        while (i < 4)
        {
            j = 0;
            while(j < 4)
            {
//                System.out.println(nums[i][j] + " " + nums[i][j+1] + " " + nums[i][j+2]);
//                System.out.println(nums[i+1][j+1]);
//                System.out.println(nums[i+2][j] + " " + nums[i+2][j+1] + " " + nums[i+2][j+2]);
//                System.out.println();
//                System.out.println();


                int hourglass = nums[i][j] + nums[i][j+1] + nums[i][j+2] + nums[i+1][j+1] + nums[i+2][j] + nums[i+2][j+1] + nums[i+2][j+2];
//                System.out.println(hourglass);
//                System.out.println();

                if (j == 0 && i == 0)
                {
                    highest = hourglass;
                }

                else if (hourglass > highest)
                {
                    highest = hourglass;
                }
                j++;
            }
            i++;
        }

        System.out.println(highest);

    }
}
