package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by denglob on 8/4/17.
 */
public class CustomArrayList<E> extends ArrayList{

    public static final String EXCEPTION_MESSAGE = "This operations disabled";

    @Override
    public Object remove(int i) {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }

    @Override
    protected void removeRange(int i, int i1) {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }

    @Override
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }
}
