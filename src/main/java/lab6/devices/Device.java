package lab6.devices;

import lab6.components.*;

import java.util.Objects;

/**
 * The type Device.
 */
abstract public class Device {
    protected final RAM ram;
    protected final MemoryType memoryType;
    protected final CPU cpu;
    protected final GPU gpu;
    protected final HardDrive hardDrive;
    public Device(DeviceBuilder bd) {
        this.ram = bd.ram;
        this.memoryType = bd.memoryType;
        this.cpu = bd.cpu;
        this.gpu = bd.gpu;
        this.hardDrive = bd.hardDrive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;
        Device device = (Device) o;
        return ram.equals(device.ram) && memoryType == device.memoryType && cpu.equals(device.cpu) && gpu.equals(device.gpu) && hardDrive.equals(device.hardDrive);
    }

    @Override
    public int hashCode() {
        return Objects.hash( ram, memoryType, cpu, gpu, hardDrive);
    }

    @Override
    public String toString() {
        return "Device{" +
                "ram=" + ram +
                ", memoryType=" + memoryType +
                ", cpu=" + cpu +
                ", gpu=" + gpu +
                ", hardDrive=" + hardDrive +
                '}';
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

    static abstract class DeviceBuilder
    {

        protected RAM ram;
        protected MemoryType memoryType;
        protected CPU cpu;
        protected GPU gpu;
        protected HardDrive hardDrive;
        DeviceBuilder() {};
        public DeviceBuilder setRam(RAM ram) {
            this.ram = ram;
            return this;
        }

        public DeviceBuilder setMemoryType(MemoryType memoryType) {
            this.memoryType = memoryType;
            return this;
        }
        public DeviceBuilder setCpu(CPU cpu) {
            this.cpu = cpu;
            return this;
        }
        public DeviceBuilder setGpu(GPU gpu) {
            this.gpu = gpu;
            return this;
        }
        public DeviceBuilder setHardDrive(HardDrive hardDrive) {
            this.hardDrive = hardDrive;
            return this;
        }
        abstract public Device build();
    }
}
