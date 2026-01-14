import java.util.Arrays;

// public class MergeSortInPlace {
//     public static void main(String[] args) {
//         int[] arr = {5,7,1,10,8,4};
//         sorter(arr, 0, arr.length-1);
//         System.out.println(Arrays.toString(arr));
//     }

//     private static void sorter (int[] arr, int s, int e){
//         if(e-s == 1){
//             return;
//         }

//         int mid = s + (e-s)/2;

//         sorter(arr, s, mid);
//         sorter(arr, mid+1, e);

//         mixer(arr, s, mid, e);
//     }

//     private static void mixer (int[] arr, int s, int mid, int e){
//         int[] mix = new int[arr.length];
//         int k = 0;
//         int j = mid+1;

//         while(s <= mid){
//             if(arr[s] < arr[mid+1]){
//                 mix[k] = arr[s];
//                 s++;
//             }
//             else{
//                 mix[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }

//         while(s < mid){
//             mix[k] = arr[s];
//             s++;
//         }
//         while (j < e) {
//            mix[k] = arr[j];
//            j++; 
//         }

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = mix[i];
//         }

//     }
// }


public class MergeSortInPlace {

    public static void main(String[] args) {
        int[] arr = { 5, 7, 1, 10, 8, 4 };
        sorter(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sorter(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;

        sorter(arr, s, mid);
        sorter(arr, mid + 1, e);

        mixer(arr, s, mid, e);
    }

    private static void mixer(int[] arr, int s, int mid, int e) {
        int i = s;
        int j = mid + 1;

        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) {
                i++;
            }

            else {
                int temp = arr[j];
                int k = j;

                while (k > i) {
                    arr[k] = arr[k - 1];
                    k--;
                }
                arr[k] = temp;
                i++;
                mid++;
                j++;
            }

        }
    }
}