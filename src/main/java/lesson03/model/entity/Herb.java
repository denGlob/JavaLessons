package lesson03.model.entity;

import lesson03.model.entity.enums.Freshness;

/**
 * Created by denglob on 7/27/17.
 */
public class Herb {

    private Bouquet.Stem stem;
    private Freshness freshness;

    public Bouquet.Stem getStem() {
        return stem;
    }

    public void setStem(Bouquet.Stem stem) {
        this.stem = stem;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }
}
