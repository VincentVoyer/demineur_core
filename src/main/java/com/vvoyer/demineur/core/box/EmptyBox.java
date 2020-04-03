package com.vvoyer.demineur.core.box;

import com.vvoyer.demineur.core.Box;
import com.vvoyer.demineur.core.BoxState;
import com.vvoyer.demineur.core.DiscoveredException;

import java.util.List;

/** Empty box. */
public class EmptyBox
    extends Box {

    /** @see com.vvoyer.demineur.core.Box#Box(List, BoxState)  */
    public EmptyBox(List<Box> neighbors, BoxState state) { super(neighbors, state); }

    @Override
    public void unveil() throws DiscoveredException {
        discover();
        for (Box neighbor : elements) { neighbor.unveil(); }
    }
}
