public class Koeretoej {
    private double vaegtafgift;
    private String registreringsnummer;


    public void udskriv() {
        System.out.println("reg er "+registreringsnummer);
        System.out.println(vaegtafgift);


    }

    public Koeretoej() {
    }

    public Koeretoej(double vaegtafgift, String registreringsnummer) {
        this.vaegtafgift = vaegtafgift;
        this.registreringsnummer = registreringsnummer;
    }

    public double getVaegtafgift() {
        return vaegtafgift;
    }

    public void setVaegtafgift(double vaegtafgift) {
        this.vaegtafgift = vaegtafgift;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public void setRegistreringsnummer(String registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
    }
}













