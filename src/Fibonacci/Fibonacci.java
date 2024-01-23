/**
 * Fibonacci series is a sequence of number where next number is equivalent
 * to sum of previous two.
 * 
 *  For example: 1,1, 2, 3, 5, 8, 13, 21
 * 
 */
public class Fibonacci {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int number = 5;

        System.out.println("Fibonacci series upto " + number + " numbers : ");
        
        // printing Fibonacci series up to "number" of times
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    /**
     * Using tail recursion
     * 
     * In tail recursion you usually have a "base-case" which is what stops 
     * the recursive calls and begins going backwards in the call stack
     * 
     * A function is tail recursive if there is nothing to do after the function returns except return its value
     * 
     * @return Fibonacci number
     */
    public static int fibonacci(int number){
        
        // base-case
        if(number == 1 || number == 2){
            return 1;
        }
      
        return fibonacci(number-1) + fibonacci(number -2); // tail recursion
    }
  
    /**
     * Using iteration
     * 
     * @return Fibonacci number
     */
    public static int fibonacci2(int number ){
        
        if(number == 1 || number == 2){
            return 1;
        }
        
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci; //Fibonacci number
    }
    
}