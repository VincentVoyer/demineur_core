package com.vvoyer.demineur.core.box;

import com.vvoyer.demineur.core.BoxState;
import com.vvoyer.demineur.core.state.CoveredBoxState;
import com.vvoyer.demineur.core.state.DiscoveredBoxState;
import com.vvoyer.demineur.core.state.MarkedBoxState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoveredBoxStateTest {

    @Test
    void mark() {
        BoxState state = new CoveredBoxState();
        assertEquals(new MarkedBoxState(),state.mark());
    }

    @Test
    void unmark() {
        BoxState state = new CoveredBoxState();
        assertEquals(new CoveredBoxState(),state.unmark());
    }

    @Test
    void discover() {
        BoxState state = new CoveredBoxState();
        assertEquals(new DiscoveredBoxState(),state.discover());
    }
}