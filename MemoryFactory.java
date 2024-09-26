public interface MemoryFactory
{
    public int ALLOC(int SIZE);
    public void FREE(long VALUE);
    public byte READ(int ADDRESS);
    public void WRITE(int ADDRESS, byte VALUE);
    public long GET_ADDRESS(int VALUE);
};
