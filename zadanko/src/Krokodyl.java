

public class Krokodyl extends Gad {
    private int dlugoscCiala;

    public Krokodyl(String nazwa, int wiek, int dlugoscCiala) {
        super(nazwa, wiek);
        this.dlugoscCiala = dlugoscCiala;
    }

    @Override
    public String wydajDzwiek() {
        return "Głośne warczenie";
    }

    @Override
    public String poruszajSie() {
        return "Płynie w wodzie";
    }


    public int getDlugoscCiala() {
        return dlugoscCiala;
    }
}
