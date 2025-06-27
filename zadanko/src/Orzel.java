

public class Orzel extends Ptak {
    private String kolorPiór;

    public Orzel(String nazwa, int wiek, String kolorPiór) {
        super(nazwa, wiek);
        this.kolorPiór = kolorPiór;
    }

    @Override
    public String wydajDzwiek() {
        return "Kra, kra";
    }

    @Override
    public String poruszajSie() {
        return "Leci w przestworzach";
    }

    // Unikalna metoda dla orła
    public String getKolorPiór() {
        return kolorPiór;
    }
}
