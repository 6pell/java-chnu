package lab1.devices;

import lab1.components.*;

public class Device {
    private final String name;
    private final RAM ram;
    private final MemoryType memoryType;
    private final CPU cpu;
    private final GPU gpu;
    private final HardDrive hardDrive;

    public Device(String name, RAM ram, MemoryType memoryType, CPU cpu, GPU gpu, HardDrive hardDrive) {
        this.name = name;
        this.ram = ram;
        this.memoryType = memoryType;
        this.cpu = cpu;
        this.gpu = gpu;
        this.hardDrive = hardDrive;
    }

    public String getName() {
        return name;
    }

    public RAM getRam() {
        return ram;
    }

    public MemoryType getMemoryType() {
        return memoryType;
    }

    public CPU getCpu() {
        return cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }
}
