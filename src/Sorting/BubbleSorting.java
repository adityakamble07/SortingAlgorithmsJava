package Sorting;

public class BubbleSorting {
    public static void main(String[] args) {
        int arr[]={7,8,1,2};
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<4-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
      for(int num:arr){
          System.out.print(num  +" ");
            }}

}