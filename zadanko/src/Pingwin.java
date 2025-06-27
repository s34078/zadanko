

public class Pingwin extends Ptak {
    private String habitat;

    public Pingwin(String nazwa, int wiek, String habitat) {
        super(nazwa, wiek);
        this.habitat = habitat;
    }

    @Override
    public String wydajDzwiek() {
        return "Kwakanie";
    }

    @Override
    public String poruszajSie() {
        return "Chodzi po lodzie";
    }


    public String getHabitat() {
        return habitat;
    }
}
