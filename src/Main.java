import kyu6.*;
import kyu7.*;
import kyu8.*;
import java.util.Arrays;


public class Main {
    public static void main (String[] args) {
        // Here you can test the Kata!
        //
        // System.out.println(DuplicateEncoder.encode("Prespecialized"));
        // System.out.println(SpinWords.spinWords("Hey fellow warriors"));
        // System.out.println(Multiples.solution(10));
        // System.out.println(CyrillicLetters.isCyrillic('Д'));
        // System.out.println(Quarter.quarterOf(1));
        // System.out.println(ReduceButGrow.grow(new int[]{1,2,3}));
        int[] countByXresult = CountByX.countBy(2, 5);
        System.out.println(Arrays.toString(countByXresult));
    }
}
