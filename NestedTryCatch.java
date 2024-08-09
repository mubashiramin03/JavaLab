public class NestedTryCatch {
    public static void main(String[] args) {
        
        try {
           
            try {
                System.out.println("Attempting to divide by zero...");
                
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }

            
            try {
                int[] array = new int[5];
                System.out.println("Accessing element at index 5...");
                array[5] = 10; 
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            }

            System.out.println("Other statements in the outer try block...");
        } catch (Exception e) {
            System.out.println("Caught Exception in outer try block: " + e.getMessage());
        }

        
    }
}

