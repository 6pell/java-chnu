package lab1.devices;

import lab1.components.*;

import java.util.Objects;

/**
 * The type Device.
 */
public class Device {
    private final String name;
    private final RAM ram;
    private final MemoryType memoryType;
    private final CPU cpu;
    private final GPU gpu;
    private final HardDrive hardDrive;

    /**
     * Instantiates a new Device.
     *
     * @param name       the name
     * @param ram        the ram
     * @param memoryType the memory type
     * @param cpu        the cpu
     * @param gpu        the gpu
     * @param hardDrive  the hard drive
     */
    public Device(String name, RAM ram, MemoryType memoryType, CPU cpu, GPU gpu, HardDrive hardDrive) {
        this.name = name;
        this.ram = ram;
        this.memoryType = memoryType;
        this.cpu = cpu;
        this.gpu = gpu;
        this.hardDrive = hardDrive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;
        Device device = (Device) o;
        return name.equals(device.name) && ram.equals(device.ram) && memoryType == device.memoryType && cpu.equals(device.cpu) && gpu.equals(device.gpu) && hardDrive.equals(device.hardDrive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ram, memoryType, cpu, gpu, hardDrive);
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", memoryType=" + memoryType +
                ", cpu=" + cpu +
                ", gpu=" + gpu +
                ", hardDrive=" + hardDrive +
                '}';
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets ram.
     *
     * @return the ram
     */
    public RAM getRam() {
        return ram;
    }

    /**
     * Gets memory type.
     *
     * @return the memory type
     */
    public MemoryType getMemoryType() {
        return memoryType;
    }

    /**
     * Gets cpu.
     *
     * @return the cpu
     */
    public CPU getCpu() {
        return cpu;
    }

    /**
     * Gets gpu.
     *
     * @return the gpu
     */
    public GPU getGpu() {
        return gpu;
    }

    /**
     * Gets hard drive.
     *
     * @return the hard drive
     */
    public HardDrive getHardDrive() {
        return hardDrive;
    }
}
