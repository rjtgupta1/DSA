class InsertionSort{
    public static void main(String [] args){
        int [] arr = {44,60,18,10,22,15,36,19};

        //* printing the array before sorting.
        System.out.print("Before sorting => ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //* sorting the array
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                    arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        //* printing the array after sorting.
        System.out.print("After sorting => ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}