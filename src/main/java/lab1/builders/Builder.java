package lab1.builders;

import lab1.components.CPU;
import lab1.components.MemoryType;
import lab1.components.GPU;
import lab1.components.RAM;
import lab1.components.HardDrive;

/**
 * The interface Builder.
 */
public interface Builder {
    /**
     * Sets device name.
     *
     * @param name the name
     */
    void setDeviceName(String name);// Device name

    /**
     * Sets device ram.
     *
     * @param ram the ram
     */
    void setDeviceRAM(RAM ram); // RAM ram

    /**
     * Sets device memory type.
     *
     * @param memoryType the memory type
     */
    void setDeviceMemoryType(MemoryType memoryType); // For example DDR3

    /**
     * Sets device cpu.
     *
     * @param cpu the cpu
     */
    void setDeviceCPU(CPU cpu);

    /**
     * Sets device gpu.
     *
     * @param gpu the gpu
     */
    void setDeviceGPU(GPU gpu); // GPU gpu

    /**
     * Sets device hard drive.
     *
     * @param hardDrive the hard drive
     */
    void setDeviceHardDrive(HardDrive hardDrive); // HardDrive hardDrive
}
