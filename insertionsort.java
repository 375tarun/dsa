public class insertionsort {
   public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
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
        sort(arr);
    }    
    
}
