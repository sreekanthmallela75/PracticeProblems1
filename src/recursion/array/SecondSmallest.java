package recursion.array;

public class SecondSmallest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int temp=0;
        System.out.println("The second Smallest element is");
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(+arr[1]+" ");
    }
}
