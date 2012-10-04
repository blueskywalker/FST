package org.blueskywalker.fst;

public class StateType {

    public boolean finished;
    public int size;
    public int location;

    public StateType(boolean finished, int size, int location) {
        this.finished = finished;
        this.size = size;
        this.location = location;
    }

    public StateType() {
        this(false, 0, 0);
    }
}
