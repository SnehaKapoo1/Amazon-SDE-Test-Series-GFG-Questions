package arrays;

public class Max_sum_path_in_two_arrays {

    static int maxPathSum(int ar1[], int ar2[])
    {
        // Your code here
        int m = ar1.length;
        int n = ar2.length;

        int sum1 =0, sum2=0, i=0, j=0, output =0;
        while(i < m && j < n){
            if(ar1[i] < ar2[j]){
                sum1 += ar1[i];
                i++;
            }

            else if(ar2[j] < ar1[i]){
                sum2 += ar2[j];
                j++;
            }

            else{
                output += (Math.max(sum1, sum2) + ar1[i]);

                sum1 =0;
                sum2 =0;
                i++;
                j++;
            }
        }

        while(i < m){
            sum1 += ar1[i];
            i++;
        }

        while(j < n){
            sum2 += ar2[j];
            j++;
        }

        output += Math.max(sum1, sum2);

        return output;
    }

    public static void main(String[] args) {
        int num1[] ={2,3,7,10,12};
        int num2[] = {1,5,7,8};

        System.out.println(maxPathSum(num1, num2));
    }
}

   /* Given two sorted arrays A and B of size M and N respectively.
        Each array contains only distinct elements but may have some elements in common with the other array.
        Find the maximum sum of a path from the beginning of any array to the end of any of the two arrays.
        We can switch from one array to another array only at the common elements.
        Note: Only one repeated value is considered in the valid path sum.*/