public class insertion_sort {

    public static void main(String[] args) {

        int[] arr = {9, 14, 3, 2, 43, 11, 58, 22};

        System.out.println("Original array:");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 1; i < arr.length; i++) {  //for (int i : arr)
            int temp = arr[i];
            int j = i - 1;

            // Compare key with elements on the left of it
            while (j > -1 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at the correct position
            arr[j + 1] = temp;
        }

        System.out.println("\nSorted array:");
        for (int i =0 ; i < arr.length ;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
