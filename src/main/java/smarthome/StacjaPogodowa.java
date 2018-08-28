package smarthome;

import java.util.Random;

public class StacjaPogodowa {
    static Random rand = new Random();
    private int temp;
    private boolean czySlonecznie;

    public StacjaPogodowa() {
        System.out.println("Stacja pogodowa pobiera informacje o temperaturze");
        this.temp = myRandom(-25, 35);
        this.czySlonecznie = rand.nextBoolean();
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public boolean isCzySlonecznie() {
        return czySlonecznie;
    }

    public void setCzySlonecznie(boolean czySlonecznie) {
        this.czySlonecznie = czySlonecznie;
    }

    private static int myRandom(int min, int max) {

        return rand.nextInt(max - min + 1) + min;
    }
}
