import java.util.Scanner;

class linear_search {

    public static int search(int a, int[] arr){
        int ans=-1;
        for(int i =0;i<arr.length;i++){
            if (arr[i]==a){
               ans =i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter the size of array");
            int size = input.nextInt();
            int[] arr = new int[size];
            for(int i=0;i<size;i++){
                arr[i]=input.nextInt();
            }
            System.out.println("elements of array are:");
            for(int i=0;i<size;i++){
            System.out.println(arr[i]);
            }
            System.out.println("enter the key to search");
            int key = input.nextInt();
            int result = search(key,arr);
            if(result >= 0){
            System.out.println("element found at index ="+result);
            }
            else{
                System.out.println("element not found ");
            }
        }
    }
}
