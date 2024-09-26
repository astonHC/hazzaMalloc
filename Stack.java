/* COPYRIGHT (C) HARRY CLARK 2024 */

/* CUSTOM MEMORY ALLOCATOR FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE MAIN FUNCTIONALITY OF THE STACK */
/* UTILISING THE PRE-REQUISITES DEFINED IN THE BASE MEMORY CLASS */

/* THIS AIMS TO PROVIDE A BASE, LIGHTWEIGHT SOLUTION TO ADDING AND FREE MEMORY */

public class Stack extends BaseMemory
{
    public Stack(){}

    /* A SUPER CONSTRUCTOR OBJECT BASED ON THE BASE MEMORY PRE-REQUISITE */

    public Stack(int TOTAL_SIZE)
    {
        super();
    }

    /* HOWEVER, IF WE WANT TO ALLOCATE THE BLOCK SIZE ASYNCHRONOUSLY  */

    public Stack(int TOTAL_SIZE, int BLOCK_SIZE)
    {
        this.TOTAL_SIZE = TOTAL_SIZE;
        this.BLOCK_SIZE = BLOCK_SIZE;

        ADD_BLOCKS();
    }

    /* ITERATE THROUGH EACH RESPECTIVE AND ALLOCATABLE AREA */
    /* OF THE STACK BASED ON THE MEMORY BLOCK SIZE */

    public static final void ADD_BLOCKS()
    {
        int INDEX = 0;
        
        for(INDEX = 0; INDEX < BLOCK_NO; INDEX++)
        {
            BLOCKS.add(new MemoryBlock(BLOCK_SIZE));
        }

        TOP -= 1;
        System.out.println("Stack initialised with: " + BLOCK_NO + "Block Size: " + BLOCK_SIZE + "bytes.");
    }


    /* ALLOCATE AND EVALUATE SPACE FOR EACH RESPECTIVE STACK */
    /* ITERATE THROUGH EACH ELEMENT AND DETERMINE THE BLOCKS FROM TOP TO BOTTOM */

    public static final int ALLOC(int SIZE)
    {
        return TOP * BLOCKS.get(0).SIZE;
    }
}
