package arrays;

public class Equilibrium_Point {
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here

        if( n == 1){
            return 1;
        }

        int leftSum =  0;
        int rightSum = 0;

        for(int i =1; i<n; i++){
            rightSum +=(int)arr[i];
        }

        for(int i =1; i<n; i++){
            if(rightSum == leftSum)
                return i;

            leftSum +=(int)arr[i-1];
            rightSum -=(int)arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        long num[] = {1, 3, 5, 2, 2};
        System.out.println(equilibriumPoint(num, num.length));
    }
}
