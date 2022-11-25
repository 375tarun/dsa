import java.util.Scanner;
class arrayInsert {
    
    
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
            }
}
}
    