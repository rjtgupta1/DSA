import java.util.*;

class BinarySearch {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Input a number to find ");
        int input = scn.nextInt();
        
        int [] arr = {5,7,12,13,30,45,51,58,62};
        
        int beg = 0;
        int end = arr.length - 1;
        int mid = (beg+end)/2;
        int location = -1;
        
        while(beg<=end){
            if(arr[mid]==input){
                location = mid;
                break;
            }else if(arr[mid]>input){
                end = mid - 1;
            }else {
                beg = mid + 1;
            }
            mid =  (beg+end)/2;
        }
        if(location==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Found on index number "+ location);
        }
    }
}