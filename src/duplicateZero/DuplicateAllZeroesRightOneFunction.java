package duplicateZero;

public class DuplicateAllZeroesRightOneFunction {
    public void duplicateZeros(int[] arr) {
        int numOfZeroes = 0;
        
        // First, get the number of zero we need to duplicate
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                numOfZeroes++;
            }
        }
        
        // Since we want O(1) space, we will have the length without creating another array
        int maxLen = arr.length + numOfZeroes;
        
        for(int i = arr.length - 1, j = maxLen - 1; i < j; i--,j--){
        	// Make sure we only replace when j is within the range of the array
        	// If it's not zero, just move arr[i] to arr[j]
            if(arr[i] != 0){
                if(j < arr.length){
                    arr[j] = arr[i];
                }
            } else {
                if(j < arr.length){
                    arr[j] = arr[i];
                }
                
                // update j so we could make two zeros
                j--;
                
                if(j < arr.length){
                    arr[j] = arr[i];
                }
            }
        }
    }
}
