package lab6.devices;

import java.util.Objects;

/**
 * The type Pc.
 */
final public class PC extends Device {
    private final String mouse;
    private final String keyboard;
    public PC(PCBuilder pcB)
    {
        super(pcB);
        this.keyboard = pcB.keyboard;
        this.mouse = pcB.mouse;
    }
    public String getMouse() {
        return mouse;
    }
    public String getKeyboard() {
        return keyboard;
    }

    @Override
    public String toString() {
        return "PC{" +
                "mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", ram=" + ram +
                ", memoryType=" + memoryType +
                ", cpu=" + cpu +
                ", gpu=" + gpu +
                ", hardDrive=" + hardDrive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PC)) return false;
        if (!super.equals(o)) return false;
        PC pc = (PC) o;
        return mouse.equals(pc.mouse) && keyboard.equals(pc.keyboard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mouse, keyboard);
    }
    final static public class PCBuilder extends DeviceBuilder
    {
        private String mouse;
        private String keyboard;
        public PCBuilder setMouse(String mouse)
        {
            this.mouse = mouse;
            return this;
        }
        public PCBuilder setKeyboard(String keyboard)
        {
            this.keyboard = keyboard;
            return this;
        }
        @Override
        public Device build() {
            return new PC(this);
        }
    }
}