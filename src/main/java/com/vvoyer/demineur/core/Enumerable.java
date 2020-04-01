package com.vvoyer.demineur.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/** Enumerable element. */
public abstract class Enumerable<T> {
    /** Content of enumeration. */
    protected List<T> elements;

    /** Base initialization. */
    public Enumerable(List<T> elements) { this.elements = Optional.of(elements).get(); }

    /** @return Content */
    public List<T> content() { return new ArrayList<>(elements); }

    /** @return count of matched elements. */
    public int count(Predicate<T> predicate)  { return select(predicate).size(); }

    /** @return matched elements. */
    public List<T> select(Predicate<T> predicate) {
        List<T> founds = new ArrayList<>();

        for (T element : elements) {
            if (predicate.test(element)) {
                founds.add(element);
            }
        }

        return founds;
    }

    /** @return first matched element. */
    public Optional<T> first(Predicate<T> predicate) {
        T found = null;

        for (T element : elements) {
            if (predicate.test(element)) {
                found = element;
                break;
            }
        }

        return Optional.ofNullable(found);
    }
}
