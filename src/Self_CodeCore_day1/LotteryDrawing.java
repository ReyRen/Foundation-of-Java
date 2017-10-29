package Self_CodeCore_day1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by reyren on 2017/5/26.
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("what is the hightest number you can draw?");
        int n = in.nextInt();

        //fill an array with numbers 1 2 3 4....n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        //draw k numbers and put them into a second array
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++){
            int r = (int)(Math.random()*n);//make a random index between 0 and n-1
            result[i] = numbers[r];//pick the element at the random location
           // numbers[r] = numbers[n-1];//move the last element into the random location
            n--;
        }

        //print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : result
             ) {
            System.out.println(r);
        }
    }
}
