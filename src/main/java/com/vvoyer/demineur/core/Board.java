package com.vvoyer.demineur.core;

import java.util.*;

/** Board game. */
public class Board
    extends Enumerable<Box> {

    /**
     * Initialize board.
     * @param boxes box list.
     * @throws NullPointerException throw if list was null.
     * @throws IllegalArgumentException throw if list is empty.
     */
    public Board(List<Box> boxes) throws NullPointerException, IllegalArgumentException {
        super(boxes);
        if (this.elements.isEmpty()) { throw new IllegalArgumentException(); }
    }

    /** @param box  */
    public void mark(Box box) {
        Optional<Box> toUpdateBox = first((Box b)->b.equals(box));
        if (toUpdateBox.isPresent()) {
            toUpdateBox.get().mark();
        }
    }

    /** @param box  */
    public void unmark(Box box) {
        Optional<Box> toUpdateBox = first((Box b)->b.equals(box));
        if (toUpdateBox.isPresent()) {
            toUpdateBox.get().unmark();
        }
    }

    /** @param box  */
    public void unveil(Box box) throws DiscoveredException {
        Optional<Box> toUpdateBox = first((Box b)->b.equals(box));
        if (toUpdateBox.isPresent()) {
            toUpdateBox.get().unveil();
        }
    }

}
