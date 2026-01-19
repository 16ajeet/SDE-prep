
/*
1. initiate two pointers ie. start and end
2. calculate middle
3. if target > middle -> start = mid+1
4. else end = mid-1
*/

package Binary_Search;

import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter " + i + "th number : ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("enter target : ");
        int target = sc.nextInt();
        int i = binarySearch(arr, 0, arr.length-1, target);
        if (i > 0) {
            System.out.println("the target is present at " + i + "th position ");
        }

        else{
            System.out.println("element not found ");
        }
        sc.close();
    }

    private static int binarySearch(int[] arr, int s, int e, int target){
        
        

        while (s <= e) {
            int mid = (s+e)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if( arr[mid] > target){
                e = mid-1;
            }
            else{
                s = mid + 1;
            }
        }
        return -1;
    }
}