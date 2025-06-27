

public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze lew = new Lew("Lew", 5, "Długą grzywą");
        Zwierze slon = new Slon("Słoń", 10, 5000);
        Zwierze orzel = new Orzel("Orzeł", 3, "Czarno-białe");
        Zwierze pingwin = new Pingwin("Pingwin", 2, "Antarktyda");
        Zwierze waz = new Waz("Wąż", 4, true);
        Zwierze krokodyl = new Krokodyl("Krokodyl", 7, 4);

        Zwierze[] zwierzeta = {lew, slon, orzel, pingwin, waz, krokodyl};


        for (Zwierze zwierze : zwierzeta) {
            zwierze.wyswietlInformacje();
            System.out.println("Środowisko naturalne: " + zwierze.srodowiskoNaturalne());
            System.out.println();
        }
    }
}
