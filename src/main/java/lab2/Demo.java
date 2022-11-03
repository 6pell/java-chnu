package lab2;

import lab1.components.*;
import lab1.devices.Device;
import lab1.devices.PC;
import lab1.devices.PlayStation;
import lab2.serialize.Serialize;
import lab2.serialize.SerializeToJSON;
import lab2.serialize.SerializeToTxt;
import lab2.serialize.SerializeToXml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PC.PCBuilder pcBuilder = new PC.PCBuilder();
        pcBuilder.setKeyboard("Razer BlackWidow Chroma V2");
        pcBuilder.setMouse("Logitech G PRO Wireless");
        pcBuilder.setCpu(new CPU("Ryzen 5 3600", 6, 4.2));
        pcBuilder.setGpu(new GPU("MSI 1060",8000,6,2));
        pcBuilder.setRam(new RAM("Hyperx",16,2400));
        pcBuilder.setMemoryType(MemoryType.DDR4);
        pcBuilder.setHardDrive(new HardDrive("Kingston",2.5,5000,5));
        PC pc = (PC) pcBuilder.build();

        PlayStation.PSBuilder playStation5 = new PlayStation.PSBuilder();
        playStation5.setType(PlayStation.PlayStationType.PS5);
        playStation5.setCpu(new CPU("AMD Ryzen Zen 2",8,3.5));
        playStation5.setGpu(new GPU("AMD Radeon RDNA 2", 18000,12,3));
        playStation5.setRam(new RAM("idk",16,3666));
        playStation5.setMemoryType(MemoryType.DDR6);
        playStation5.setHardDrive(new HardDrive("idk",0,5000,57));
        PlayStation ps5 = playStation5.build();

        List<Device> myList = new ArrayList<>();
        myList.add(pc);
        myList.add(ps5);

        SerializeToJSON serializerJSON = new SerializeToJSON();
        serializerJSON.writeToFile(myList,"test123.json");
        serializerJSON.readFromFile("test123.json");
        SerializeToXml serializerToXml = new SerializeToXml();
        serializerToXml.writeToFile(myList,"test1234.xml");
        serializerToXml.readFromFile("test1234.xml");
        System.out.println(serializerToXml.readFromFile("test1234.xml"));
        SerializeToTxt serializerToTxt = new SerializeToTxt();
        serializerToTxt.writeToFile(myList,"test1235.txt");
    }
}