package Homework.home;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = new int[]{5,2,4,6,1,3,2,6};
        sort(a,a.length);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int[] a,int l){
        if(l==1){
            return;
        }
        int[] b = new int[l/2];
        int[] c = new int[l - l/2];
        System.arraycopy(a,0,b,0,l/2);
        System.arraycopy(a,l/2,c,0,l - l/2);

        sort(b,l/2);
        sort(c,l - l/2);
        merge(a, b, c, l/2, l - l/2);
    }

    public static void merge(int[] a, int[] b, int[] c, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {

            if (b[i] <= c[j]) {
                a[k++] = b[i++];
            }
            else {
                a[k++] = c[j++];
            }
        }
        while (i < left)
            a[k++] = b[i++];

        while (j < right)
            a[k++] = c[j++];
    }
}
