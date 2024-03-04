import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class GreatestCandy {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result  = new ArrayList<>();

        OptionalInt max = Arrays.stream(candies).max();

        for(var candie: candies){
            if((extraCandies + candie) >= max.getAsInt())
                result.add(true);
            else
                result.add(false);
        }

        return result;
    }
}
