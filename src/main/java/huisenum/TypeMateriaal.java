package huisenum;

public enum TypeMateriaal {
    HOUT("hout"), STEEN("steen"), LEEM("leem");

    private String materiaal;

    TypeMateriaal(String materiaal) {
        this.materiaal = materiaal;
    }

    public String getMateriaal() {
        return materiaal;
    }
}
