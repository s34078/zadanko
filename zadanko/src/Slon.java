

public class Slon extends Ssak {
    private double tusza;

    public Slon(String nazwa, int wiek, double tusza) {
        super(nazwa, wiek);
        this.tusza = tusza;
    }

    @Override
    public String wydajDzwiek() {
        return "Trąbienie";
    }

    @Override
    public String poruszajSie() {
        return "Chodzi powoli";
    }


    public double getTusza() {
        return tusza;
    }
}


