package at.selott.codetrivia.problem.impl.euler;

/*
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    Find the largest palindrome made from the product of two 3-digit numbers.
*/

import at.selott.codetrivia.problem.Problem;

public class LargestPalindrome implements Problem<Integer> {
    @Override
    public Integer solve() {
        int res = Integer.MIN_VALUE;
        for(int i = 100; i < 1000; i++) {
            for(int j = 100; j < 1000; j++) {
                if(isPalindromicNumber(String.valueOf(i*j))) {
                    if(i*j > res)
                        res = i*j;
                }
            }
        }
        return res;
    }

    @Override
    public void displaySolution() {
        System.out.println("Largest palindrome made from 2 3-digit numbers -> " + solve());
    }

    private boolean isPalindromicNumber(String str) {
        if(str.length() % 2 != 0)
            return false;
        int h = str.length() / 2;
        return str.substring(0, h).equals(new StringBuilder(str.substring(h)).reverse().toString());
    }
}
