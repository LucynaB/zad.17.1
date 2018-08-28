package smarthome;

import org.springframework.stereotype.Component;

@Component
public class SterownikRolet implements Readable{
    private StacjaPogodowa stacjaPogodowa;

    public SterownikRolet(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    @Override
    public void read() {
        if(stacjaPogodowa.isCzySlonecznie()){
            System.out.println("Jest słonecznie. Zasłaniam rolety.");
        }else
            System.out.println("Nie jest słonecznie. Nie zasłaniam rolet.");
    }
}
