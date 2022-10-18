package lab1.components;

public class HardDrive {
    private String mark;
    private double formFactor; // 2.5" or 3.5"
    private int spindleSpeed; // for example 5400 rpm
    private int transferRate; // 5gb in s
    private boolean started;

    public HardDrive(String mark, double formFactor, int spindleSpeed, int transferRate) {
        this.mark = mark;
        this.formFactor = formFactor;
        this.spindleSpeed = spindleSpeed;
        this.transferRate = transferRate;
    }
    public void on() { started = true; }
    public void off() { started = false; }
    public boolean isStarted() { return started; }
    public String getMark() { return mark; }
    public double getFormFactor() { return formFactor; }
    public int getSpindleSpeed() { return spindleSpeed; }
    public int getTransferRate() { return transferRate; }
}
