package DesignPattern.AdapterPattern;

public class AdapterMain {
    public static void main(String[] args) {
        IndiaCharger indiaCharger = new TravelAdapter();

        ChargeService chargeService = new ChargeService();
        chargeService.setIndiaCharger(indiaCharger);
        chargeService.chargeDevice("iPhone");
    }
}