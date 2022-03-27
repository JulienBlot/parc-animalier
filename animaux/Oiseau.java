package animaux;

public class Oiseau extends Animal {
    
    private String zoneNid;
    private int nbOeufs;

    public Oiseau(String nom, String dateNaiss, String zoneNid, int nbOeufs) {
        super(nom, dateNaiss);
        this.zoneNid = zoneNid;
        this.nbOeufs = nbOeufs;
    }

    public String toString() {
        return super.toString() + '\n' + this.zoneNid + '\n' + this.nbOeufs + " œufs";
    }

    /**
     * Getters
     */

    public String getZoneNid() {
        return this.zoneNid;
    }

    public int getNbOeufs() {
        return this.nbOeufs;
    }

}
