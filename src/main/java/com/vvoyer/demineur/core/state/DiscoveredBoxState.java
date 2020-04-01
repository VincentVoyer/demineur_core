package com.vvoyer.demineur.core.state;

import com.vvoyer.demineur.core.BoxState;

/** Discover state. */
public class DiscoveredBoxState
        implements BoxState {

    @Override
    public BoxState mark() { return this; }

    @Override
    public BoxState unmark() { return this; }

    @Override
    public BoxState discover() { return this; }
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof DiscoveredBoxState);
    }
}
