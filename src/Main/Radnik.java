package Main;

abstract class Radnik {

    protected String ime;
    protected String prezime;
    protected String jmbg;
    protected String ziroRacun;
    protected double plata;

    public Radnik(String ime, String prezime, String jmbg, String ziroRacun) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.ziroRacun = ziroRacun;
    }

    public void isplatiPlatu(){
        System.out.println("Ime radnika: " + ime + " Prezime radnika: " + prezime + " jmbg radnika: " + jmbg + " ziro racuna: " + ziroRacun + " plata: " + plata);
    }
}
