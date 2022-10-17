package lab1;

import java.util.Objects;

public class Device {
    private int RAM;
    private String NameCPU;
    private String NameDevice;
    private String GPU;
    private int HardMemory;
    private Device(DeviceBuilder builder)
    {
        this.RAM = builder.RAM;
        this.NameCPU = builder.NameCPU;
        this.NameDevice = builder.NameDevice;
        this.GPU = builder.GPU;
        this.HardMemory = builder.HardMemory;
    }
    @Override
    public String toString(){
        return  "Device : " + NameDevice + "\n" +
                "CPU : " + NameCPU + "\n" +
                "RAM : " + RAM + "\n" +
                "GPU : " + GPU + "\n" +
                "Memory : " + HardMemory;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || obj.getClass() != this.getClass()) return false;
        Device dev = (Device)obj;
        return (dev.RAM == this.RAM && dev.NameCPU.equals(this.NameCPU) &&
                dev.GPU.equals(this.GPU) && dev.NameDevice.equals(this.NameDevice) &&
                dev.HardMemory == this.HardMemory);
    }
    @Override
    public int hashCode()
    {
        int hash = 31;
        hash = 7 * hash + Objects.hashCode(this.NameDevice);
        hash = 7 * hash + Objects.hashCode(this.NameCPU);
        hash = 7 * hash + Objects.hashCode(this.RAM);
        hash = 7 * hash + Objects.hashCode(this.GPU);
        hash = 7 * hash + Objects.hashCode(this.HardMemory);
        return hash;
    }
    public static class DeviceBuilder
    {
        private int RAM = 0;
        private String NameCPU = "";
        private String NameDevice = "";
        private String GPU = "";
        private int HardMemory = 0;
        public DeviceBuilder(String nameDevice)
        {
            this.NameDevice = nameDevice;
        }
        public DeviceBuilder setRAM(int RAM)
        {
            this.RAM = RAM;
            return this;
        }
        public DeviceBuilder setNameCPU(String nameCPU)
        {
            this.NameCPU = nameCPU;
            return this;
        }
        public DeviceBuilder setGPU(String GPU)
        {
            this.GPU = GPU;
            return this;
        }
        public DeviceBuilder setHardMemory(int hardMemory)
        {
            this.HardMemory = hardMemory;
            return this;
        }
        public Device build()
        {
            return new Device(this);
        }
    }

    public int getRAM()
    {
        return RAM;
    }
    public int getHardMemory()
    {
        return HardMemory;
    }
    public String getNameCPU()
    {
        return NameCPU;
    }
    public String getNameDevice()
    {
        return NameDevice;
    }
    public String getGPU()
    {
        return GPU;
    }
    public void setRAM(int RAM)
    {
        this.RAM = RAM;
    }
    public void setHardMemory(int hardMemory)
    {
        HardMemory = hardMemory;
    }
    public void setGPU(String GPU)
    {
        this.GPU = GPU;
    }
    public void setNameDevice(String nameDevice)
    {
        NameDevice = nameDevice;
    }
    public void setNameCPU(String nameCPU)
    {
        NameCPU = nameCPU;
    }
}