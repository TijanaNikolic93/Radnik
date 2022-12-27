package Main;

public class Fiksno extends Radnik {

    private final static double fiksnaPlata = 200000;

    public Fiksno(String ime, String prezime, String jmbg, String ziroRacun) {
        super(ime, prezime, jmbg, ziroRacun);
    }



    public double obracunajPlatu() {
        return fiksnaPlata;
    }

    @Override
    public void isplatiPlatu() {
        plata = obracunajPlatu();
        super.isplatiPlatu();
    }
}
