package pl.sda.design.pattern.facade.homecinema;

public class HomeCinema {
    private DVD dvd;
    private Speakers speakers;
    private TV tv;

    public HomeCinema(DVD dvd, Speakers speakers, TV tv){
        this.dvd = dvd;
        this.speakers = speakers;
        this.tv = tv;
    }

    public void turnOnCinema(){
        tv.turnOn();
        speakers.turnOnSpeakers();
        dvd.runDVD();
    }
}
