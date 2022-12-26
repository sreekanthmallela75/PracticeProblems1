package recursion.array;

public class DuplicateElements {
    public static void main(String[] args) {
        int arr[]={1,2,33,33,44,44,55,55,};
        System.out.println("Enter Duplicate elements : ");
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(+arr[j]+" ");
                }
            }
        }

    }
}
