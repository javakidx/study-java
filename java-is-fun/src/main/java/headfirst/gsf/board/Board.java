package headfirst.gsf.board;

import headfirst.gsf.unit.Unit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bioyang on 2016/3/11.
 */
public class Board {
    private int width;
    private int height;

    private List<List<Tile>> tiles;

    public Board(final int width, final int height) {
        this.width = width;
        this.height = height;
        initialize();
    }

    private void initialize() {
        tiles = new ArrayList<>(width);

        for (int i = 0; i < width; i++) {
            tiles.add(i, new ArrayList<Tile>(height));

            for (int j = 0; j < height; j++) {
                tiles.get(i).add(j, new Tile());
            }
        }
    }

    public Tile getTile(final int x, final int y) {
        return tiles.get(x - 1).get(y - 1);
    }

    public void addUnit(final Unit unit, int x, int y) {
        final Tile tile = getTile(x, y);
        tile.addUnit(unit);
    }

    public void removeUnit(final Unit unit, int x, int y) {
        Tile tile = getTile(x, y);
        tile.removeUnit(unit);
    }

    public void removeUnits(int x, int y) {
        Tile tile = getTile(x, y);
        tile.removeUnits();
    }

    public List<Unit> getUnits(int x, int y) {
        return getTile(x, y).getUnits();
    }
}
