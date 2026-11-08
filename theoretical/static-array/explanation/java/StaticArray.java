public class StaticArray{
    // Insert n into arr at the next open position.
    // Length is the number of 'real' values in arr, and capacity
    // is the size (aka memory allocated for the fixed size array).
    public int[] insertEnd(int[] arr, int n,int realValuesLength, int arrCapacity){
        if(realValuesLength< arrCapacity){
            arr[realValuesLength] = n;
        }
        else{
            System.out.println("Array is full. Cannot insert " + n);
        }
        return arr;
    }
    // Remove from the last position in the array if the array
    // is not empty (i.e. length is non-zero).
    public int[] removeEnd(int[] arr, int length){
        if(length>0){
            arr[length - 1] = 0;
        }else{
            System.out.println("Array is empty. Cannot remove from end.");
        }
        return arr;
    }

    // Insert n into index i after shifting elements to the right.
    // Assuming i is a valid index and arr is not full.
    public int[] insertAtMiddle(int[] arr, int n, int i, int realValuesLength, int arrCapacity){
        if(realValuesLength< arrCapacity && i < realValuesLength){
            for (int x= realValuesLength; x>i ;x--){
                arr[x] = arr[x - 1];
            }
            arr[i] = n;
        }else {
        System.out.println("Insertion not possible. Either the array is full or the index is invalid.");
    }
    return arr;
    }
    // Remove value at index i before shifting elements to the left.
    // Assuming i is a valid index.
    public int[] removeAtIndex(int[] arr, int i, int realValuesLength){
        if(i<realValuesLength && i>=0){
            for(int x = i; x<realValuesLength -1; x++){
                arr[x] = arr[x+1];
            }
            arr[realValuesLength-1] = 0;
            realValuesLength--;
        }else{
            System.out.println("Invalid index. Removal not performed.");
        }
        return arr;
    }

}