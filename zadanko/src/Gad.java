

public abstract class Gad extends Zwierze {
    public Gad(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Błota i lasy tropikalne";
    }
}

