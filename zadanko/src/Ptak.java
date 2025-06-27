

public abstract class Ptak extends Zwierze {
    public Ptak(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Wysokie góry";
    }
}

