

public class Lew extends Ssak {
    private String grzywa;

    public Lew(String nazwa, int wiek, String grzywa) {
        super(nazwa, wiek);
        this.grzywa = grzywa;
    }

    @Override
    public String wydajDzwiek() {
        return "Ryk";
    }

    @Override
    public String poruszajSie() {
        return "Biega po sawannie";
    }


    public String getGrzywa() {
        return grzywa;
    }
}

