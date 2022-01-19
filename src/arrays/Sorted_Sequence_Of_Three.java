package arrays;

import java.util.ArrayList;

public class Sorted_Sequence_Of_Three {

    static ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        // add code here.

        ArrayList<Integer> list = new ArrayList<>();

        int min =0;
        int max = n-1;

        int mina[] = new int[n];
        int maxa[] = new int[n];

        mina[0] = -1;
        maxa[n-1] = -1;

        for(int i=1; i<n; i++){
            if(arr.get(i) <= arr.get(min)){
                min = i;
                mina[i] = -1;
            }else{
                mina[i] = min;
            }
        }

        for(int i=n-2; i>=0; i--){
            if(arr.get(i) >= arr.get(max)){
                max = i;
                maxa[i] = -1;
            }
            else{
                maxa[i] = max;
            }
        }

        for(int i=0; i<n; i++){
            if(mina[i] != -1 && maxa[i] != -1){
                list.add(arr.get(mina[i]));
                list.add(arr.get(i));
                list.add(arr.get(maxa[i]));
                break;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(1);
        arr.add(3);

        System.out.println(Sorted_Sequence_Of_Three.find3Numbers(arr, arr.size()));

    }
}
