package com.vvoyer.demineur.core.state;

import com.vvoyer.demineur.core.BoxState;

/** Cover state. */
public class CoveredBoxState
    implements BoxState {

    @Override
    public BoxState mark() { return new MarkedBoxState(); }

    @Override
    public BoxState unmark() { return this; }

    @Override
    public BoxState discover() { return new DiscoveredBoxState(); }

    @Override
    public boolean equals(Object obj) { return (obj instanceof CoveredBoxState); }
}
