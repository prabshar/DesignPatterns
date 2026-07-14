package DesignPattern.AdapterPattern;

public class ChargeService {
    private IndiaCharger indiaCharger;

    public IndiaCharger getIndiaCharger() {
        return indiaCharger;
    }

    public void setIndiaCharger(IndiaCharger indiaCharger) {
        this.indiaCharger = indiaCharger;
    }

    public void chargeDevice(String device) {
        indiaCharger.charge(device);
    }
}
