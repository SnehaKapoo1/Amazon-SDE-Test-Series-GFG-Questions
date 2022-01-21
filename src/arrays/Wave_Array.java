package arrays;

public class Wave_Array {
    public static void convertToWave(int arr[], int n){

        // Your code here
        int i=0;
        int j=1;

        while(i< n && j < n){
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;

            i +=2;
            j +=2;
        }

        for (int p=0; p<n; p++){
            System.out.print(arr[p] + " ,");
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        convertToWave(arr, arr.length);
    }
}
