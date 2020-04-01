package com.vvoyer.demineur.core.box;

import com.vvoyer.demineur.core.Box;
import com.vvoyer.demineur.core.BoxState;
import com.vvoyer.demineur.core.DiscoveredException;

import java.util.List;

/** Numbered Box */
public class NumberedBox
    extends Box {

    public final int minedNeighbors;

    /** @see com.vvoyer.demineur.core.Box#Box(List, BoxState)  */
    public NumberedBox(List<Box> neighbors, BoxState state)
            throws NullPointerException, IllegalArgumentException {
        super(neighbors, state);
        minedNeighbors = count((Box box)->box instanceof MinedBox);
    }

    @Override
    public void unveil() throws DiscoveredException { discover(); }
}
