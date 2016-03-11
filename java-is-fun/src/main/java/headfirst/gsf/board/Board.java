package headfirst.gsf.board;

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


}
