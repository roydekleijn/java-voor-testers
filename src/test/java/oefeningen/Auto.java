package oefeningen;

public class Auto {

    private int aantalDeuren;
    private double maxSnelheid;
    private String typeMotor;

    public Auto(int aantalDeuren, double maxSnelheid, String typeMotor) {
        this.aantalDeuren = aantalDeuren;
        this.maxSnelheid = maxSnelheid;
        this.typeMotor = typeMotor;
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public double getMaxSnelheid() {
        return maxSnelheid;
    }

    public String getTypeMotor() {
        return typeMotor;
    }

    public void start() {

    }

    public void stop() {

    }
}
