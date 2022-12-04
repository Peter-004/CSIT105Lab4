package csit104project04daisiesf22;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args){
        int[] argg = {9,2,3,4,5,6,7};
        int[][] array = {{1,2},{3,4,5,6},{6,7,8,9}};
        System.out.println(Arrays.toString(array));
        Arrays.sort(argg);
        System.out.println(argg[0]);
    }
}
