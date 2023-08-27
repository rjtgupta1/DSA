class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {44,60,18,10,22,15,36,19};


        // printing the array
        System.out.print("Before sorting the array => ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        
        // Sorting the array
        
        for(int i=0; i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        // printing the array
        System.out.print("After sorting the array => ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}