package lab1.builders;

import lab1.components.CPU;
import lab1.components.MemoryType;
import lab1.components.GPU;
import lab1.components.RAM;
import lab1.components.HardDrive;

public interface Builder {
    void setDeviceName(String name);// Device name
    void setDeviceRAM(RAM ram); // RAM ram
    void setDeviceMemoryType(MemoryType memoryType); // For example DDR3
    void setDeviceCPU(CPU cpu);
    void setDeviceGPU(GPU gpu); // GPU gpu
    void setDeviceHardDrive(HardDrive hardDrive); // HardDrive hardDrive
}
