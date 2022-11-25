public class bubblesort {
   public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println("\narray after sorting");
                for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            }
public static void main(String[] args) {
    int arr[] = {5,235,52,2,1,65,3,55,3};
    int n = arr.length;
    System.out.println("elements in arrays");
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
    bubbleSort(arr);
}    
}
