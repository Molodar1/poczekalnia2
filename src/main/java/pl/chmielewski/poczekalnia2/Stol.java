package pl.chmielewski.poczekalnia2;

public class Stol {

    private Long id;
    private String nazwa;
  private Tryb tryb;
  private Uzytkownik tworcaStolu;

    public Stol() {
    }

    public Stol(Long id, String nazwa, Tryb tryb, Uzytkownik tworcaStolu) {
        this.id = id;
        this.nazwa = nazwa;
        this.tryb = tryb;
        this.tworcaStolu = tworcaStolu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Tryb getTryb() {
        return tryb;
    }

    public void setTryb(Tryb tryb) {
        this.tryb = tryb;
    }

    public Uzytkownik getTworcaStolu() {
        return tworcaStolu;
    }

    public void setTworcaStolu(Uzytkownik tworcaStolu) {
        this.tworcaStolu = tworcaStolu;
    }

    @Override
    public String toString() {
        return "Stol{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", tryb=" + tryb +
                ", tworcaStolu=" + tworcaStolu +
                '}';
    }
}
