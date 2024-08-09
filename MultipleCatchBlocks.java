public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[20] = 30 / 2;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
        finally{
            System.err.println("multiple catch blocks used");
    
    }
}
}