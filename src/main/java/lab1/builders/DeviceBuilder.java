package lab1.builders;

import lab1.devices.Device;
import lab1.components.*;

public class DeviceBuilder implements Builder{
    private String name;
    private RAM ram;
    private MemoryType memoryType;
    private CPU cpu;
    private GPU gpu;
    private HardDrive hardDrive;

    @Override
    public void setDeviceName(String name) {
        this.name = name;
    }

    @Override
    public void setDeviceRAM(RAM ram) {
        this.ram = ram;
    }

    @Override
    public void setDeviceMemoryType(MemoryType memoryType) {
        this.memoryType = memoryType;
    }

    @Override
    public void setDeviceCPU(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setDeviceGPU(GPU gpu) {
        this.gpu = gpu;
    }

    @Override
    public void setDeviceHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Device getResult()
    {
        return new Device(name, ram, memoryType, cpu, gpu, hardDrive);
    }

}
