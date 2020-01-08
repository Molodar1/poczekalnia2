package pl.chmielewski.poczekalnia2;

public class Uzytkownik {
    private String nick;


    public Uzytkownik() {
    }

    public Uzytkownik(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Uzytkownik{" +
                "nick='" + nick + '\'' +
                '}';
    }
}
