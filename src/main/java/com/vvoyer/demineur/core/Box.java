package com.vvoyer.demineur.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/** Represent box on the Grid. */
public abstract class Box
    extends Enumerable<Box> {
    /** Box state. */
    private BoxState state;

    /**
     * Create a Box.
     * @param neighbors Box neighbors.
     * @throws NullPointerException if neighbors was null.
     * @throws IllegalArgumentException if number of neighbors is not correct.
     */
    public Box(List<Box> neighbors, BoxState state) throws NullPointerException, IllegalArgumentException {
        super(neighbors);
        this.state = Optional.of(state).get();
    }

    /** @return Box neighbors. */
    public List<? extends Box> getNeighbors() { return content(); }

    /** @return Marked box. */
    public void mark() { state = state.mark(); }

    /** @return Unmarked box. */
    public void unmark() { state = state.unmark(); }

    /** @return Discovered the box. */
    protected void discover() { state = state.discover(); }

    /** Unveil box. */
    public abstract void unveil() throws DiscoveredException;
}
