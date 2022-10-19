package lab1;

import lab1.builders.*;
import lab1.devices.*;
import lab1.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        DeviceBuilder builder = new DeviceBuilder();
        director.constructGamingPC(builder);
        Device gamingPC1 = builder.getResult();
        Device gamingPC2 = builder.getResult();
        director.constructWorkPC(builder);
        Device workPC = builder.getResult();
        System.out.println(gamingPC1.toString());
        System.out.println(gamingPC2.equals(gamingPC1));
    }
}