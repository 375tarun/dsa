import java.util.Scanner;

public class arrayDeletion {
    
    public static void main(String[] args) {
        int[] arr= {12,39,123,34,36};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the element to delete");
            int key = sc.nextInt();
            System.out.println("elements of array are:");
            for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);}
            delete(key,arr);
        }
      
    }

    public static void delete(int key, int[] arr) {
        int [] arrnew = new int[arr.length-1];
        for(int i=0,j =0 ;i<arr.length;i++,j++){
            if(arr[i]!=key){
                arrnew[j]=arr[i];
            }
        }
        System.out.println("elements of array are:");
            for(int i=0;i<arrnew.length;i++){
            System.out.println(arrnew[i]);}

    }
}
