package arrays;

public class Min_Distance_Between_Two_Num {
    static int minDist(int a[], int n, int x, int y) {

        int disx = Integer.MIN_VALUE;
        int disy = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;


        for (int i = 0; i <n; i++) {
            if (a[i] == x) {
                disx = i;
            }
            if (a[i] == y) {
                disy = i;
            }

            if(disx != Integer.MIN_VALUE && disy != Integer.MIN_VALUE){
                ans = Math.min(ans, Math.abs(disx - disy));
            }
        }
        return (disx == Integer.MIN_VALUE || disy == Integer.MIN_VALUE) ? -1 : ans;

    }

    public static void main(String[] args) {
        /* 1.
        int arr[] ={1, 2};
        int x = 1;
        int y = 2;*/

       /* 2.
        int arr[] ={1,2,3,2};
        int x = 1;
        int y = 2;*/

        int arr[] ={86,39,90,67,84,66,62};
        int x = 42;
        int y = 12;

        int ans = minDist(arr, arr.length, x, y);

        System.out.println(ans);
    }
}

/*
You are given an array A, of N elements. Find minimum index based distance between two elements of the array, x and y.
        Your Task:
        Complete the function minDist() which takes the array, n, x and y as input parameters and returns the minimum distance between x and y in the array. If no such distance is possible then return -1.

        Expected Time Complexity: O(N)
        Expected Auxiliary Space: O(1)
*/
