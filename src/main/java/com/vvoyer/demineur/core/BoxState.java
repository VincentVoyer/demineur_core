package com.vvoyer.demineur.core;

/** Bax state. */
public interface BoxState {

    /**
     * @return Marked Box state.
     */
    BoxState mark();

    /**
     * @return Unmarked box state.
     */
    BoxState unmark();

    /**
     * @return Discovered box state.
     */
    BoxState discover();
}
