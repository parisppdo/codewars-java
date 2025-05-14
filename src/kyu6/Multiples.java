package kyu6;

// Kata: Multiples of 3 or 5
// https://www.codewars.com/kata/514b92a657cdc65150000006/java

public class Multiples {
    public static int solution(int number) {
        int sum=0;
        for(int i=0 ; i<number ; i++)
        {
            if(i%3==0 || i%5==0)
            {
                sum=sum+i;
            }
        }

        return sum;
    }
}
