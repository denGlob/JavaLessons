package lesson03.model.entity;

import lesson03.model.entity.enums.Accessory;

import java.util.List;

/**
 * Created by denglob on 7/27/17.
 */
public class Bouquet {

    private List<Herb> herbs;
    private Accessory pottle;
    private Accessory ribbon;
    private Accessory wrap;

    private Price price;
    private Purpose purpose;
    private Size size;

    enum Price {
        CHEAP, BUDGETARY, EXPENSIVE, VIP
    }

    enum Purpose {
        ALLWAYS, FESTIVE, FUNERAL, WEDDING
    }

    enum Stem {
        NONE, SHORT, MEDIUM, LONG
    }

    enum Size {
        SMALL, MEDIUM, LARGE, VERY_LARGE
    }

    public List<Herb> getHerbs() {
        return herbs;
    }

    public void setHerbs(List<Herb> herbs) {
        this.herbs = herbs;
    }

    public Accessory getPottle() {
        return pottle;
    }

    public void setPottle(Accessory pottle) {
        this.pottle = pottle;
    }

    public Accessory getRibbon() {
        return ribbon;
    }

    public void setRibbon(Accessory ribbon) {
        this.ribbon = ribbon;
    }

    public Accessory getWrap() {
        return wrap;
    }

    public void setWrap(Accessory wrap) {
        this.wrap = wrap;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void addHerbToBouquet(Herb herb) {
        this.herbs.add(herb);
    }

    public void setStemForHerb(Stem stem) {
        for (Herb herb : herbs)
            herb.setStem(stem);
    }

    public void setStemForHerb(Stem stem, Herb herb) {
        herb.setStem(stem);
    }
}
