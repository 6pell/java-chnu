package lab1.director;

import lab1.components.*;
import lab1.builders.*;

/**
 * The type Director.
 */
public class Director {

    /**
     * Construct gaming pc.
     *
     * @param builder the builder
     */
    public void constructGamingPC(Builder builder)
    {
        builder.setDeviceName("PC");
        builder.setDeviceCPU(new CPU("Intel i7",5, 4.2));
        builder.setDeviceGPU(new GPU("Nvidia 3080",19000, 10, 3));
        builder.setDeviceHardDrive(new HardDrive("Samsung", 2.5, 5400, 5));
        builder.setDeviceRAM(new RAM("Kingston",16,2400));
        builder.setDeviceMemoryType(MemoryType.DDR4);
    }

    /**
     * Construct work pc.
     *
     * @param builder the builder
     */
    public void constructWorkPC(Builder builder)
    {
        builder.setDeviceName("PC");
        builder.setDeviceCPU(new CPU("Intel i3",4, 3.0));
        builder.setDeviceGPU(new GPU("Nvidia gtx 660",10000, 1, 1));
        builder.setDeviceHardDrive(new HardDrive("Samsung", 2.5, 3000, 3));
        builder.setDeviceRAM(new RAM("Kingston",8,1666));
        builder.setDeviceMemoryType(MemoryType.DDR3);
    }
}
