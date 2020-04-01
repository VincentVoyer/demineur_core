package com.vvoyer.demineur.core.state;

import com.vvoyer.demineur.core.Box;
import com.vvoyer.demineur.core.BoxState;
import com.vvoyer.demineur.core.DiscoveredException;
import com.vvoyer.demineur.core.box.EmptyBox;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmptyBoxTest {

    @Test
    void unveil() {
        try {
            Box emptybox = new EmptyBox(new ArrayList<Box>() {{
                add(new AssertBox());
            }}, new VoidBoxState());
            emptybox.unveil();
        }
        catch (Exception e) {
            fail();
        }
    }

    static class AssertBox extends Box {
        public AssertBox() throws NullPointerException, IllegalArgumentException { super(new ArrayList<>(), new VoidBoxState()); }

        @Override
        public void unveil() throws DiscoveredException { assertTrue(true); }
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