package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isOn;
    
    public TemperatureSensor() {
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn() {
        this.isOn = true;
    }

    public void setOff() {
        this.isOn = false;
    }

    public int read() {
        if(isOn) {
            Random rand = new Random();
            int range = 30 - (-30) + 1;
    
            return rand.nextInt(range) + (-30);
        } else {
            throw new IllegalStateException();
        }
    }
}
