package day21_ForEachLoop;

import java.util.Arrays;

public class Task1
{
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6};

        int ln = arr1.length + arr2.length;
        int [] arr3 = new int[ln];

        int count = 0;
        for (int each: arr1) {
            arr3[count] = each;
            count ++;
        }

        for (int each : arr2) {
            arr3[count] = each;
            count ++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
