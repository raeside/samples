public class Solution
{
    final static int PASS = 50;  
    public static void main(String[] args)
    {
        int[] input = { 80, 90, 40, 32, 10, 20, 30, 65, 55, 30, 45, 75 };

        int swapIndex = 0;

        for (int i = 0; i < input.length; i++) {
            
            if (input[i] > PASS) {

                doSwap(input, i, swapIndex++);               
            }
        }
        
        // Verify input.
        for (int i : input) {
    	    System.out.println(i);
	}
    }
    
    public static void doSwap(int[] input, int current, int swapIndex) {
        
        if (current == swapIndex) {
            return;
        }
        
        int temp = input[current];
        input[current] = input[swapIndex];
        input[swapIndex] = temp;
    }
}
