package lesson03.model.entity;

/**
 * Created by denglob on 7/27/17.
 */
public class Flower extends Herb {

    private boolean fedding;
    private boolean support;
    private Inflorences inflorence;

    enum Inflorences {
        MONOFLOWER, MULTIFLOWER
    }

    public boolean isFedding() {
        return fedding;
    }

    public void setFedding(boolean fedding) {
        this.fedding = fedding;
    }

    public boolean isSupport() {
        return support;
    }

    public void setSupport(boolean support) {
        this.support = support;
    }

    public Inflorences getInflorence() {
        return inflorence;
    }

    public void setInflorence(Inflorences inflorence) {
        this.inflorence = inflorence;
    }
}
