package smarthome;

public class SterownikPieca implements Readable {
    private StacjaPogodowa stacjaPogodowa;

    public SterownikPieca(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    @Override
    public void read() {
        if(stacjaPogodowa.getTemp()<15){
            System.out.println("Nie jest ciepło. Uruchamiam piec.");
        }else
            System.out.println("Jest ciepło. Nie uruchamiam pieca.");
    }
}
