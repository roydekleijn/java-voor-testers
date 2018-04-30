package huis;

public class Huis {

    private String type;
    private String materiaal;
    private int aantalVloeren;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMateriaal() {
        return materiaal;
    }

    public void setMateriaal(String materiaal) {
        this.materiaal = materiaal;
    }

    public int getAantalVloeren() {
        return aantalVloeren;
    }

    public void setAantalVloeren(int aantalVloeren) {
        this.aantalVloeren = aantalVloeren;
    }

    @Override
    public String toString() {
        return "Het door ons gemaakt huis heeft de volgende eigenschappen{" +
                "type='" + type + '\'' +
                ", materiaal='" + materiaal + '\'' +
                ", aantalVloeren=" + aantalVloeren +
                '}';
    }
}
