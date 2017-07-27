package lesson03.model.entity;

/**
 * Created by denglob on 7/27/17.
 */
public class NotFlower extends Herb {

    private Type type;

    enum Type {
        BUSH, BRANCH
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
