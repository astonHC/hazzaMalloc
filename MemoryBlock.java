/* COPYRIGHT (C) HARRY CLARK 2024 */

/* CUSTOM MEMORY ALLOCATOR FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE MEMORY BLOCK FUNCTIONALITY OF THE PROGRAM */

public abstract class MemoryBlock implements Memory
{   
    byte[] BLOCK_DATA;
    int BLOCK_SIZE;
    boolean ALLOCATED;

    public MemoryBlock(){}

    public MemoryBlock(int SIZE)
    {
        BLOCK_DATA = new byte[SIZE]; 
        BLOCK_SIZE = SIZE;
        ALLOCATED = false;
    }
}
