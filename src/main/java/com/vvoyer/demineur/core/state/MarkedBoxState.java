package com.vvoyer.demineur.core.state;

import com.vvoyer.demineur.core.BoxState;

/** Mark state. */
public class MarkedBoxState
        implements BoxState {

    @Override
    public BoxState mark() { return this; }

    @Override
    public BoxState unmark() { return new CoveredBoxState(); }

    @Override
    public BoxState discover() { return this; }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof MarkedBoxState);
    }
}
