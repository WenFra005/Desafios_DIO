public class Heroi {

    private String nomeHeroi;
    private int xpHeroi;
    private String nivelHeroi;
    
    public Heroi(String nomeHeroi, int xpHeroi, String nivelHeroi) {
        this.nomeHeroi = nomeHeroi;
        this.xpHeroi = xpHeroi;
        this.nivelHeroi = nivelHeroi;
    classificadorHeroi.classificadorHeroi(xpHeroi);
    }

    public String getNomeHeroi() {
        return nomeHeroi;
    }

    public void setNomeHeroi(String nomeHeroi) {
        this.nomeHeroi = nomeHeroi;
    }

    public int getXpHeroi() {
        return xpHeroi;
    }

    public void setXpHeroi(int xpHeroi) {
        this.xpHeroi = xpHeroi;
    }

    public String getNivelHeroi() {
        return nivelHeroi;
    }

    public void setNivelHeroi(String nivelHeroi) {
        this.nivelHeroi = nivelHeroi;
    }

    public void ganharXp(int xp) {
        this.xpHeroi += xp;
        this.nivelHeroi = classificadorHeroi.classificadorHeroi(xpHeroi);
        
    }

    @Override
    public String toString() {
        return "O Heroi de nome " + nomeHeroi + "está no nível de " + nivelHeroi;
    }

    

}
