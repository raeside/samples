public class Solution
{
    final static int PASS = 50;  
    public static void main(String[] args)
    {
        int[] input = { 80, 90, 40, 32, 65, 55, 30, 45, 75 };

        int swapIndex;

        for (int i = 0; i < input.length; i++) {
            
            int current = input[i];
            if (current < PASS) {
                swapIndex = getSwapIndex(input, i);
                
                if (swapIndex == 0) {
                    // Nothing to swap, we're done.
                    break;
                }
                else {
                    // Swap the fail, with the next pass.
                    input[i] = input[swapIndex];
                    input[swapIndex] = current;
                }
            }
        }
        
        // Print out input.
        for (int i : input )
    	    System.out.println(i);
    }
    
    public static int getSwapIndex(int[] input, int startSearch) {
    
        for (int i = startSearch; i < input.length; i++) {
            
            if (input[i] >= PASS) {
                return i;
            }
        }
        return 0;
  }
  
}
