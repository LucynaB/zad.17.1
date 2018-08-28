package smarthome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {
    public static void main(String[] args) {
//        StacjaPogodowa stacjaPogodowa = new StacjaPogodowa();
//        SterownikRolet sterownikRolet = new SterownikRolet(stacjaPogodowa);
//        SterownikPieca sterownikPieca = new SterownikPieca(stacjaPogodowa);
//        SterownikGlosnika sterownikGlosnika = new SterownikGlosnika(stacjaPogodowa);
//
//       SmartHome smartHome = new SmartHome(sterownikGlosnika, sterownikPieca, sterownikRolet);
//       smartHome.start();

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        SmartHome smartHome = context.getBean(SmartHome.class);
        smartHome.start();
    }
}
