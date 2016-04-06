package headfirst.gsf.board;

import headfirst.gsf.unit.Unit;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by bioyang on 2016/3/11.
 */
public class Tile {
    private List<Unit> units;

    public Tile() {
        this.units = new LinkedList<>();
    }

    protected void addUnit(final Unit unit) {
        units.add(unit);
    }

    protected void removeUnit(final Unit unit) {
        units.remove(unit);
    }

    protected void removeUnits() {
    }

    protected List<Unit> getUnits() {
        return null;
    }
}
