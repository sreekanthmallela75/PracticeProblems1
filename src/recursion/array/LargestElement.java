package recursion.array;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int largest=arr[0];
        System.out.println("Enter the largest element: ");
        for (int i=0; i<arr.length;i++){
            if (largest<arr[i]){
                largest=arr[i];

            }
        }
        System.out.println(largest);
    }
}
