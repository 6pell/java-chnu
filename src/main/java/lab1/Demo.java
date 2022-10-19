package lab1;

import lab1.builders.*;
import lab1.devices.*;
import lab1.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        DeviceBuilder builder = new DeviceBuilder();
        director.constructGamingPC(builder);
        Device gamingPC = builder.getResult();
        System.out.print("Program have done the build PC");
    }
}
