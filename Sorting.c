#include <stdio.h>

int Swap(int Array[],int index,int location){
    int tmp = Array[index];
    Array[index] = Array[location];
    Array[location] = tmp;
}

int Selection_Sort(int Array[]){
    int min;
    int location;
    for(int i=0;i<10;i++){
        min = Array[i];
        location = i;
        for(int j=i+1;j<10;j++){
            if(min>Array[j]){
                min = Array[j];
                location = j;
            }
        }
        if(Array[i]!=Array[location])
            Swap(Array,i,location);
    }
    // printing the sorted Array
    for(int k=0;k<10;k++){
        printf("%d ",Array[k]);
    }
}

int Bubble_Sort(int Array[]){
    int ptr;
    for (int i = 0; i < 10; i++)
    {
        ptr = 0;
        while (ptr<10-i)
        {
            if(Array[ptr]>Array[ptr+1])
            {
                Swap(Array,ptr,ptr+1);
            }
            ptr++;
        }
    }  
    // printing the sorted Array
    for(int k=0;k<10;k++){
        printf("%d ",Array[k]);
    }
}

int main() {
    int arr[] = {1,5,7,9,2,6,11,4,3,8};
    printf("Before Sorting the array\n");
    for(int i=0;i<10;i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
    
    printf("\nSelection Sort\n");
    Selection_Sort(arr);
    printf("\n");

    printf("\nBubble Sort\n");
    Bubble_Sort(arr);
    printf("\n");

    return 0;
}
