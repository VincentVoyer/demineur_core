package com.vvoyer.demineur.core;

import java.util.*;

/** Board game. */
public class Board
    extends Enumerable<Box> {

    /**
     * Initialize board.
     * @param boxes box list.
     */
    public Board(List<Box> boxes)  {
        super(boxes);
        if (this.elements.isEmpty()) { throw new IllegalArgumentException(); }
    }

    /** @param box to mark. */
    public void mark(Box box) {
        Optional<Box> toUpdateBox = first((Box b)->b.equals(box));
        if (toUpdateBox.isPresent()) {
            toUpdateBox.get().mark();
        }
    }

    /** @param box to unmark. */
    public void unmark(Box box) {
        Optional<Box> toUpdateBox = first((Box b)->b.equals(box));
        if (toUpdateBox.isPresent()) {
            toUpdateBox.get().unmark();
        }
    }

    /** @param box to unveil */
    public void unveil(Box box) throws DiscoveredException {
        Optional<Box> toUpdateBox = first((Box b)->b.equals(box));
        if (toUpdateBox.isPresent()) {
            toUpdateBox.get().unveil();
        }
    }

}
