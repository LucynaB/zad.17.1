package smarthome;

public class Main {
    public static void main(String[] args) {
        StacjaPogodowa stacjaPogodowa = new StacjaPogodowa();
        SterownikRolet sterownikRolet = new SterownikRolet(stacjaPogodowa);
        SterownikPieca sterownikPieca = new SterownikPieca(stacjaPogodowa);
        SterownikGlosnika sterownikGlosnika = new SterownikGlosnika(stacjaPogodowa);

        SmartHome smartHome = new SmartHome(sterownikGlosnika, sterownikPieca, sterownikRolet);
        sterownikGlosnika.read();
        sterownikPieca.read();
        sterownikRolet.read();
    }
}
