public class Approach {

    public void swap(int arr[], int i, int j){
        int val = arr[i];
        arr[i] = arr[j];
        arr[j] = val;
    }

    public void reverse(int arr, int startIndex, int endIndex){
        while ( startIndex <= endIndex){
            swap(arr, startIndex--, endIndex--);
        }
    }

    
    public void getNextPermutation(int [] arr){
        int n = arr.length;
        int pivotIndex = -1;

        for(int i = n-1; i >= 0; i--){
            //Find the first number from the last that is disobeying the increasing sequence from right to end.
            if (arr[i-1] > arr[i]){
                pivotIndex = i-1;
            }
        }
        // If pivot index is not found that means the number is biggest and there's no 
        // other bigger number in that case we need to list the smallest number.
        if(pivotIndex == -1) {
            reverse(arr, 0, n-1);
            return;
        }
        
        // If there's a pivot index that means we have some work to do.
        for(int i = n-1; i > pivotIndex; i--){
            //Finding the proper index for placing the pivotElement.
            if(arr[i] > arr[pivotIndex]){
                swap(arr, i, pivotIndex);
                //reverse the array after the pivotIndex.
                reverse(arr, pivotIndex+1, n-1);
            }
        }
    }
}
