/* COPYRIGHT (C) HARRY CLARK 2024 */

/* CUSTOM MEMORY ALLOCATOR FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE MEMORY BLOCK FUNCTIONALITY OF THE PROGRAM */

public class MemoryBlock extends BaseMemory
{   
    public byte[] BLOCK_DATA;
    public int BLOCK_SIZE;
    public boolean ALLOCATED;

    public MemoryBlock(){}

    public MemoryBlock(int SIZE)
    {
        this.BLOCK_DATA = new byte[SIZE]; 
        this.BLOCK_SIZE = SIZE;
        this.ALLOCATED = false;
    }
}
