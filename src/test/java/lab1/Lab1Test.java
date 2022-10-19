package lab1;

import lab1.builders.DeviceBuilder;
import lab1.devices.Device;
import lab1.director.Director;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.util.Objects;

import static org.testng.Assert.assertEquals;

public class Lab1Test
{
    @Test(dataProvider = "equalPC")
    public void equalPCTest(Device obj1, Device obj2, boolean res)
    {
        assertEquals(Objects.equals(obj1,obj2), res);
    }

    @DataProvider
    public Object[][] equalPC()
    {
        Director director = new Director();
        DeviceBuilder builder = new DeviceBuilder();
        director.constructGamingPC(builder);
        Device gamingPC1 = builder.getResult();
        Device gamingPC2 = builder.getResult();
        director.constructWorkPC(builder);
        Device workPC = builder.getResult();
        return new Object[][] {{gamingPC1, gamingPC2, true}, {gamingPC1, workPC, false}, {gamingPC2,workPC,false}};
    }

}
