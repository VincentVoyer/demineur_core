package com.vvoyer.demineur.core.box;

import com.vvoyer.demineur.core.BoxState;
import com.vvoyer.demineur.core.state.DiscoveredBoxState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscoveredBoxStateTest {

    @Test
    void mark() {
        BoxState state = new DiscoveredBoxState();
        assertEquals(new DiscoveredBoxState(),state.mark());
    }

    @Test
    void unmark() {
        BoxState state = new DiscoveredBoxState();
        assertEquals(new DiscoveredBoxState(),state.unmark());
    }

    @Test
    void discover() {
        BoxState state = new DiscoveredBoxState();
        assertEquals(new DiscoveredBoxState(),state.discover());
    }
}