package com.vvoyer.demineur.core.state;

import com.vvoyer.demineur.core.Box;
import com.vvoyer.demineur.core.BoxState;
import com.vvoyer.demineur.core.box.NumberedBox;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberedBoxTest {

    @Test
    void minedNeighbors(){
        List<Box> mined = new ArrayList<>();
        NumberedBox numberedbox = new NumberedBox(mined,new VoidBoxState());

        assertEquals(mined.size(), numberedbox.minedNeighbors);
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