package arrays;

import java.util.*;

public class Find_Duplicate {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Set<Integer> map = new HashSet<>();
        ArrayList<Integer> dupliList = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                map.add(arr[i]);
            }
        }

        for(Integer m : map){
            dupliList.add(m);
        }

        Collections.sort(dupliList);
        if(dupliList.size()==0)
        {
            dupliList.add(-1);
        }
        return dupliList;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 1, 2, 3};
        int n = arr.length;
        System.out.println(Find_Duplicate.duplicates(arr, n));
    }
}
