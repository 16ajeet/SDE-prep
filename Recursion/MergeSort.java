import java.util.*;

class mergeSort{
    public static void main(String[] args){
        int[] arr = {93, 2, 19, 6, 81 , 5};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        //divide in two
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right){
        int i = 0, j = 0, k = 0;
        int[] mix = new int[left.length + right.length];

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }
            else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            mix[k] = right[j];
            j++;
        }

        return mix;
    }
}