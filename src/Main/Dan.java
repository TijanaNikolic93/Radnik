package Main;

public class Dan extends Radnik {

    private static final double danPlata = 2000;
    private double brojDana;

    public Dan(String ime, String prezime, String jmbg, String ziroRacun, double brojDana) {
        super(ime, prezime, jmbg, ziroRacun);
        this.brojDana = brojDana;
    }

    public double obracunajPlatu() {
        return danPlata * brojDana;
    }

    @Override
    public void isplatiPlatu() {
        plata = obracunajPlatu();
        super.isplatiPlatu();
    }
}