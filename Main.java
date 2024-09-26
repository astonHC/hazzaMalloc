/* COPYRIGHT (C) HARRY CLARK 2024 */

/* CUSTOM MEMORY ALLOCATOR FOR JAVA */

/* THIS FILEE PERTAINS TOWARDS THE MAIN FUNCTIONALITY OF THE PROGRAM */

public class Main
{
    public static void main(String[] args)
    {
        Stack STACK = new Stack(100, 10);

       System.out.println("\n--- HARRY CLARK - JAVA MEMORY ALLOCATOR ---");

       STACK.ADD_BLOCKS();

       System.out.println("\nAllocating Memory for the custom Stack:");

       int ADDRESS = STACK.ALLOC(0);
       STACK.WRITE(ADDRESS, (byte)42);

       System.out.println("Stack: Value 42 stored at logical address: " + ADDRESS);
       System.out.println("Stack: Physical Address: " + STACK.GET_ADDRESS(ADDRESS));
    }
}
