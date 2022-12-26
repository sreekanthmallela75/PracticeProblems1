package recursion.array;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int smallest=arr[0];
        System.out.println("Enter smallest element in the array");
        for (int i=0;i< arr.length;i++){
            if( smallest>arr[i]){
                smallest=arr[i];

            }
        }
        System.out.println(smallest);
    }
}
