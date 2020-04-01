package com.vvoyer.demineur.core;

/** Bax state. */
public interface BoxState {

    /**
     * @return
     */
    BoxState mark();

    /**
     * @return
     */
    BoxState unmark();

    /**
     * @return
     */
    BoxState discover();
}
