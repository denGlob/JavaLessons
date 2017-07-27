package lesson03.model.entity;

import lesson03.model.entity.enums.Freshness;

/**
 * Created by denglob on 7/27/17.
 */
public class Herb {

    private Bouquet.Steam steam;
    private Freshness freshness;

    public Bouquet.Steam getSteam() {
        return steam;
    }

    public void setSteam(Bouquet.Steam steam) {
        this.steam = steam;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }
}
