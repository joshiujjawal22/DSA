/*
* You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
* Given n, find the total number of full staircase rows that can be formed.
* n is a non-negative integer and fits within the range of a 32-bit signed integer.
*
* credits: LeetCode Problem
*
*
* Test Case:
  Input: n = 5
  Output: The coins can form the following rows:
  ¤
  ¤ ¤
  ¤ ¤
  Expalanation:
  Because the 3rd row is incomplete, we return 2.
**/

class coins {
public static void main(String[] args) {
  int n=5;
  int result=arrangeCoins(n);
  System.out.println(result);
  }

  // Function to arrange coins in staircase form
    public static int arrangeCoins(int n) {
        long left = 0, right = n;
    long k, curr;
    while (left <= right) {
      k = left + (right - left) / 2;
      curr = k * (k + 1) / 2;

      if (curr == n) return (int)k;

      if (n < curr) {
        right = k - 1;
      } else {
        left = k + 1;
      }
    }
    return (int)right;
  }
    }