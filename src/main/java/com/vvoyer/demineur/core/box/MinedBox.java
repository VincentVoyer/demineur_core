package com.vvoyer.demineur.core.box;

import com.vvoyer.demineur.core.Box;
import com.vvoyer.demineur.core.BoxState;
import com.vvoyer.demineur.core.DiscoveredException;

import java.util.List;

/** Mined Box */
public class MinedBox
    extends Box {

    /** @see com.vvoyer.demineur.core.Box#Box(List, BoxState)  */
    public MinedBox(List<Box> neighbors, BoxState state) { super(neighbors, state); }

    @Override
    public void unveil() throws DiscoveredException { throw new DiscoveredException(); }
}
