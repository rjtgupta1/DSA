import java.util.*;

class LinearSearch {
    public static void main(String [] args){
        int [] arr = {5,7,12,13,30,45,51,58,62};

        Scanner scn = new Scanner(System.in);
        System.out.print("Please input to find the index => ");
        int input = scn.nextInt();

        int location = -1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]==input){
                location = i;
            }
        }
        if(location==-1){
            System.out.print("Not found");
        }else{
            System.out.println(input +" found on index " + location);
        }
    }
}