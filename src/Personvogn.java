class Personvogn extends Koeretoej {
    private int hastighed;
    private String motorStoerrelse;
    private int hestekraefter;

    public Personvogn() {
    }

    public void udskriv() {
        super.udskriv();
        System.out.println(hastighed);
        System.out.println(motorStoerrelse);
        System.out.println(hestekraefter);
    }

    public Personvogn(int hastighed, String motorStoerrelse, int hestekraefter) {
        this.hastighed = hastighed;
        this.motorStoerrelse = motorStoerrelse;
        this.hestekraefter = hestekraefter;
    }

    public Personvogn(double vaegtafgift, String registreringsnummer, int hastighed, String motorStoerrelse, int hestekraefter) {
        super(vaegtafgift, registreringsnummer);
        this.hastighed = hastighed;
        this.motorStoerrelse = motorStoerrelse;
        this.hestekraefter = hestekraefter;
    }

    public int getHastighed() {
        return hastighed;
    }

    public void setHastighed(int hastighed) {
        this.hastighed = hastighed;
    }

    public String getMotorStoerrelse() {
        return motorStoerrelse;
    }

    public void setMotorStoerrelse(String motorStoerrelse) {
        this.motorStoerrelse = motorStoerrelse;
    }

    public int getHestekraefter() {
        return hestekraefter;
    }

    public void setHestekraefter(int hestekraefter) {
        this.hestekraefter = hestekraefter;
    }
}