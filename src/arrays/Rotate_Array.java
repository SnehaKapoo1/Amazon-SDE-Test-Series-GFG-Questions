package arrays;

public class Rotate_Array {

    static void rotateArr(int arr[], int d, int n)
    {// add your code here

        leftRotateArray(arr, 0, d-1);
        leftRotateArray(arr, d, n-1);
        leftRotateArray(arr, 0, n-1);

        System.out.println();
    }

    static void leftRotateArray(int arr[], int low, int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }

    static void printArray(int [] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int d = 2;
        int n = arr.length;
        rotateArr(arr, d, n);
        printArray(arr, n);

    }
}
