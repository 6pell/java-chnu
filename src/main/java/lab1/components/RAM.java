package lab1.components;

public class RAM {
    private String mark;
    private int memorySize;
    private int memoryFrequency;
    private boolean started;

    public RAM(String mark, int memorySize, int memoryFrequency) {
        this.mark = mark;
        this.memorySize = memorySize;
        this.memoryFrequency = memoryFrequency;
    }
    public void on() { started = true; }
    public void off() { started = false; }
    public boolean isStarted() { return started; }
    public String getMark() {return mark;}
    public int getMemorySize() {return memorySize;}
    public int getMemoryFrequency() {return memoryFrequency;}
}
