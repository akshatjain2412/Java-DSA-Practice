package Searching;


public class BinarySearch {
    public static boolean binarySearch(int arr[],int i,int j,int target) {

        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                j = mid-1;
            } else {
                i = mid+1;
            }
        }
        return false;
    }
    public static boolean binaryRecu(int arr[],int l,int r,int target){
        if(r<l) {
            return false;
        }
        int mid = (l + r) / 2;
        if (target == arr[mid])
                return true;
        if (arr[mid] < target) {
                return binaryRecu(arr, mid + 1, r, target);
        } else {
                return binaryRecu(arr, l, mid - 1, target);
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;
        System.out.println("enter");
        if(binaryRecu(arr, 0, arr.length - 1, target))
            System.out.println("found");
        else
            System.out.println("not");
    }
}

