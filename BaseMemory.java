/* COPYRIGHT (C) HARRY CLARK 2024 */

/* CUSTOM MEMORY ALLOCATOR FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE OVERARCHING LOGIC AND FUNCTIONALITY OF THE PROGRAM */
/* FOCUSSING ON PROVIDING A LIGHTWEIGHT INTERFACE SOLUTION TO COMMUNICATE WITH OTHER ACTORS */

/* SYSTEM IMPORTS */

import java.util.ArrayList;
import java.util.List;

public abstract class BaseMemory implements MemoryFactory
{
    public static List<MemoryBlock> BLOCKS = new ArrayList<>();
    private static int BLOCK_INDEX;
    private static int OFFSET;

    static int TOP;
    static int BOTTOM;
    static int TOTAL_SIZE;
    static int BLOCK_SIZE;
    public static int BLOCK_NO;

    public byte[] DATA;
    public boolean ALLOCATED;
    public int SIZE;

    public BaseMemory(){}

    public BaseMemory(int VALUE)
    {
        super();
        BLOCKS = new ArrayList<>();
        BLOCK_NO = TOTAL_SIZE / BLOCK_SIZE;
    }
    
    /* DEFINE THE CURRENT INDEX NOTATION OF THE BLOCK OF MEMORY */
    /* USE THE GET METHOD TO ASSERT THE CURRENT ELEMENT IN THE LIST */

    /* RETURN THE TYPE-CASTED DATA BASED ON THE PRE-REQ'S */

    public final long GET_ADDRESS(int VALUE)
    {
        BLOCK_INDEX = VALUE / BLOCK_SIZE;
        OFFSET = VALUE % BLOCK_SIZE;

        return BLOCKS.get(BLOCK_INDEX).BLOCK_DATA.length + OFFSET;
    }

    /* SAME METHOD EXCEPT THIS TIME, DATA IS EVALUATED ON THE BASIS OF AN ARRAY */
    /* WHICH STORES THE CURRENT OFFSET IN CHUNKS */ 


    public final byte READ(int ADDRESS)
    {
        BLOCK_INDEX = ADDRESS / BLOCK_SIZE;
        OFFSET = ADDRESS % BLOCK_SIZE;

        return BLOCKS.get(BLOCK_INDEX).BLOCK_DATA[OFFSET];
    }

    public final void WRITE(int ADDRESS, byte VALUE)
    {
        BLOCK_INDEX = ADDRESS / BLOCK_SIZE;
        OFFSET = ADDRESS % BLOCK_SIZE;

        BLOCKS.get(BLOCK_INDEX).BLOCK_DATA[OFFSET] = VALUE;
    }
}
