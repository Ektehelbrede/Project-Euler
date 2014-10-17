/*
 Problem 1: Multiples of 3 and 5

 If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 get 3, 5, 6, and 9. The sum of these multiples is 23.

 Find the sum of all the multiples of 3 or 5 below 1000.
 */

/**
 * This program computes the sum of all of the multiples of 3 or 5 below 1000.
 *
 * [In future changes, pass or be prompted for values to use as 'multiples'
 * as well as giving an upper bound for the sum to be computed for (currently
 * 1000).]
 *
 * @author Michael Mckee 2014
 */

public class SumOfMultiples
{
  public static void main(String[] args)
  {
    final int FIRSTMULTIPLE = 3;
    final int SECONDMULTIPLE = 5;
    final int BELOW = 1000;

    int sum = 0;  // Sum starts at 0.

    for (int i = 0; i < BELOW; i++)
    {
      if ((i % FIRSTMULTIPLE == 0) || (i % SECONDMULTIPLE == 0))
      {
        sum += i;
      }
    }

    System.out.println("The sum of all the multiples of " + FIRSTMULTIPLE
      + " and " + SECONDMULTIPLE + " below " + BELOW + " is: " + sum);
  }
}
