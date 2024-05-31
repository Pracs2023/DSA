package array;
//2pointer approach
public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int n = arr.length;
        for (int element: arr) {
            System.out.print(element+" ");
        }
        System.out.println("\nAfter moving 0s to end :");
        arr = moveZeroes(n,arr);
        for (int element: arr) {
            System.out.print(element+" ");
        }
    }

    private static int[]  moveZeroes(int n, int[] arr) {
        int j = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if(j == -1)
            return arr;

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
