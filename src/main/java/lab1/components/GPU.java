package lab1.components;

public class GPU {
    private String mark;
    private int memoryFrequency;
    private int memorySize;
    private int countOfFans;
    private boolean started;

    public GPU(String mark, int memoryFrequency, int memorySize, int countOfFans) {
        this.mark = mark;
        this.memoryFrequency = memoryFrequency;
        this.memorySize = memorySize;
        this.countOfFans = countOfFans;
    }
    public void on() { started = true; }
    public void off() { started = false; }
    public boolean isStarted() { return started; }
    public String getMark() { return mark; }
    public int getMemoryFrequency() { return memoryFrequency; }
    public int getMemorySize() { return memorySize; }
    public int getCountOfFans() { return countOfFans;}
}
