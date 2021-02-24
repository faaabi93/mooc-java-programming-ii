package application;

public class StandardSensor implements Sensor {
    private int parameter;

    public StandardSensor(int parameter) {
        this.parameter = parameter;
    }

    public boolean isOn() {
        return true;
    }

    public void setOn() {

    }

    public void setOff() {

    }

    public int read() {
        return this.parameter;
    }
}
