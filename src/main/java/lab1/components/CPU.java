package lab1.components;

public class CPU {
    private String mark; // марка
    private int cores; // ядра
    private double frequency; // частота
    private boolean started;

    public CPU(String mark, int cores, double frequency)
    {
        this.mark = mark;
        this.cores = cores;
        this.frequency = frequency;
    }
    public void on() { started = true; }
    public void off() { started = false; }
    public boolean isStarted() { return started; }
    public String getMark() { return mark; }
    public int getCores() { return cores; }
    public double getFrequency() { return frequency; }
}
