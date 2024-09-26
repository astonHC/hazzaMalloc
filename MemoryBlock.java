/* COPYRIGHT (C) HARRY CLARK 2024 */

/* CUSTOM MEMORY ALLOCATOR FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE MEMORY BLOCK FUNCTIONALITY OF THE PROGRAM */

public abstract class MemoryBlock implements Memory
{   
    static byte[] BLOCK_DATA;
    static int BLOCK_SIZE;
    static boolean ALLOCATED;

    public MemoryBlock(){}

    public MemoryBlock(int SIZE)
    {
        BLOCK_DATA = DATA(); 
        BLOCK_SIZE = SIZE();
        ALLOCATED = ALLOCATED();
    }
}
