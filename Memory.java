/* COPYRIGHT (C) HARRY CLARK 2024 */

/* CUSTOM MEMORY ALLOCATOR FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE OVERARCHING LOGIC AND FUNCTIONALITY OF THE PROGRAM */
/* FOCUSSING ON PROVIDING A LIGHTWEIGHT INTERFACE SOLUTION TO COMMUNICATE WITH OTHER ACTORS */

/* SYSTEM IMPORTS */

import java.util.ArrayList;
import java.util.List;

public interface Memory
{
    public int ALLOC(int SIZE);
    public void FREE(long VALUE);
    public byte READ(int ADDRESS);
    public void WRITE(int ADDRESS, byte VALUE);
    public long GET_ADDRESS(int VALUE);

    public byte[] DATA();
    public boolean ALLOCATED();
    public int SIZE();
};

abstract class BaseMemory implements Memory
{
    public List<MemoryBlock> BLOCKS;
    private static int BLOCK_INDEX;
    private static int OFFSET;

    public BaseMemory(){}

    public BaseMemory(int VALUE)
    {
        this.BLOCKS = new ArrayList<>();
    }
}
