class SelectionSort{
    public static void main(String [] args){
        int [] arr = {44,60,18,10,22,15,36,19};

        System.out.print("Before sorting => ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            int pos = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    pos = j;
                }
            }
            if(arr[pos]!=arr[i]){
                int tmp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = tmp;
            }
        }

        System.out.print("After sorting => ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
}