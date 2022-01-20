package arrays;

import java.util.ArrayList;

public class Mountain_SubArray {

    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 4, 4, 6, 3, 2};
        int N = arr.length;
        int Left[] = new int[N];
        int Right[] = new int[N];
        preProcess(arr, N, Left, Right);
        int l =0;
        int r =2;

        if(isSubMountainArrayForm(arr, Left, Right, l, r)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    private static void preProcess(int[] arr, int n, int[] left, int[] right) {
        left[0] = 0;
        int lastIncr = 0;

        for(int i=1; i<n; i++){
            if(arr[i] > arr[i - 1])
                lastIncr = i;
            left[i] = lastIncr;
        }

        right[n-1] = n-1;
        int firstDecr= n-1;

        for(int i=n-2; i>=0; i--){
            if(arr[i] > arr[i + 1])
                firstDecr = i;
            right[i] = firstDecr;
        }
    }

    static boolean isSubMountainArrayForm(int arr[], int left[], int right[], int l, int r){
        return right[l] >= left[r];
    }
}
