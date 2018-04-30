package huisenum;

public class Huis {

    private TypeHuis type;
    private TypeMateriaal materiaal;
    private int aantalVloeren;

    public TypeHuis getType() {
        return type;
    }

    public void setType(TypeHuis type) {
        this.type = type;
    }

    public TypeMateriaal getMateriaal() {
        return materiaal;
    }

    public void setMateriaal(TypeMateriaal materiaal) {
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
                "type='" + type.toString() + '\'' +
                ", materiaal='" + materiaal + '\'' +
                ", aantalVloeren=" + aantalVloeren +
                '}';
    }
}
