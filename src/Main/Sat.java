package Main;

public class Sat extends Radnik {

    private static final double satPlata = 300;
    private double brojSati;

    public Sat(String ime, String prezime, String jmbg, String ziroRacun, double brojSati) {
        super(ime, prezime, jmbg , ziroRacun);
        this.brojSati = brojSati;
    }

    public double obracunajPlatu() {
        return satPlata * brojSati;
    }

    @Override
    public void isplatiPlatu() {
        plata = obracunajPlatu();
        super.isplatiPlatu();
    }
}
