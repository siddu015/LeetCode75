
public class Main {
    public static void main(String[] args) {

       var ex = new MaxConsecutiveOnes();
        int [] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(ex.longestOnes(arr, 3));

    }
}