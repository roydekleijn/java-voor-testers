package oefeningen;

public class Fiets {

    private int beginSnelheid;
    private int beginVersnelling;
    private int snelheid;

    public Fiets(int beginSnelheid, int beginVersnelling) {
        this.snelheid = beginSnelheid;
        this.beginVersnelling = beginVersnelling;
    }

    public void versnellen(int versnelling) {
        this.snelheid += versnelling;
    }

    public void remmen(int vertraging) {
        this.snelheid -= vertraging;
    }

    public void setVersnelling(int nieuweVersnelling) {
        this.beginVersnelling = nieuweVersnelling;
    }

    public int getBeginSnelheid() {
        return beginSnelheid;
    }

    public int getBeginVersnelling() {
        return beginVersnelling;
    }

    public int getSnelheid() {
        return snelheid;
    }

}
