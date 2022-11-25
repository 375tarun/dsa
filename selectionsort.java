public class selectionsort {
    public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {         
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j; 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
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
