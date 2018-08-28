package smarthome;

public class SterownikGlosnika implements Readable{
    private StacjaPogodowa stacjaPogodowa;

    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    @Override
    public void read() {
        String info = "Dzień dobry. Dzisiejsza temperatura " + stacjaPogodowa.getTemp() + "*C i ";
        if (stacjaPogodowa.isCzySlonecznie()) {
            info += "jest ";
        } else
            info += "nie jest ";
        info += "słonecznie. Miłego dnia!";

        System.out.println(info);
    }
}
