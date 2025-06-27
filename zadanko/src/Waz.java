
public class Waz extends Gad {
    private boolean jadowity;

    public Waz(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek);
        this.jadowity = jadowity;
    }

    @Override
    public String wydajDzwiek() {
        return "Syczący dźwięk";
    }

    @Override
    public String poruszajSie() {
        return "Pełza po ziemi";
    }


    public boolean jestJadowity() {
        return jadowity;
    }
}

