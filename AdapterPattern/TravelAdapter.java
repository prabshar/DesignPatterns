package DesignPattern.AdapterPattern;

public class TravelAdapter implements IndiaCharger{

    @Override
    public void charge(String device) {
        EuropeSocket europeSocket = new EuropeSocket();
        europeSocket.plugIn();
        System.out.println("Charging " + device + " using travel adapter.");
    }
    
}
