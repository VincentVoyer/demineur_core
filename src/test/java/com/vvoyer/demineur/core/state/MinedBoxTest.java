package com.vvoyer.demineur.core.state;

import com.vvoyer.demineur.core.Box;
import com.vvoyer.demineur.core.BoxState;
import com.vvoyer.demineur.core.DiscoveredException;
import com.vvoyer.demineur.core.box.MinedBox;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MinedBoxTest {
    @Test
    void unveil() {
        Box minedbox = new MinedBox(new ArrayList<>(),new VoidBoxState());
        assertThrows(DiscoveredException.class,() -> minedbox.unveil());
    }

    static class VoidBoxState implements BoxState {

        @Override
        public BoxState mark() {
            return this;
        }

        @Override
        public BoxState unmark() {
            return this;
        }

        @Override
        public BoxState discover() {
            return this;
        }
    }
}