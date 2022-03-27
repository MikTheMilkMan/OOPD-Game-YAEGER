package com.github.hanyaeger.tutorial.GameLevelComponents;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.BonusCirclePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.PowerupCirclePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.RegularCirclePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.RequiredCirclePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs.BonusRectanglePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs.PowerupRectanglePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs.RegularRectanglePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs.RequiredRectanglePeg;

//public class PegTileMap extends TileMap {
//    //The array indicating what the location of each peg should be
//    private final int[][] pegArray;
//
//    //Constructor
//    public PegTileMap(int[][] pegArray){
//        super();
//        this.pegArray = pegArray;
//    }
//
//    //All required entities will be set up
//    @Override
//    public void setupEntities() {
//        addEntity(1, BonusCirclePeg.class, "sprites/BonusCirclePeg.png");
//        addEntity(2, PowerupCirclePeg.class, "sprites/PowerupCirclePeg.png");
//        addEntity(3, RegularCirclePeg.class, "sprites/RegularCirclePeg.png");
//        addEntity(4, RequiredCirclePeg.class, "sprites/RequiredCirclePeg.png");
//        addEntity(5, BonusRectanglePeg.class, "sprites/BonusRectanglePeg.png");
//        addEntity(6, PowerupRectanglePeg.class, "sprites/PowerupRectanglePeg.png");
//        addEntity(7, RegularRectanglePeg.class, "sprites/RegularRectanglePeg.png");
//        addEntity(8, RequiredRectanglePeg.class, "sprites/RequiredRectanglePeg.png");
//    }
//
//    @Override
//    public int[][] defineMap() {
//        return new int[0][];
//    }
//
//    @Override
//    public int[][] defineMap() {
//        return pegArray;
//    }
//}

public class PegTileMap extends TileMap {
    private int[][] levelMap;

    public PegTileMap(int[][] levelMap){
//        this.levelMap = levelMap;
    }

    @Override
    public void setupEntities() {
//        addEntity(1, BonusCirclePeg.class, "sprites/BonusCirclePeg.png");
//        addEntity(1, PowerupCirclePeg.class, "sprites/PowerupCirclePeg.png");
//        addEntity(1, BonusRectanglePeg.class, "sprites/BonusRectanglePeg");
        addEntity(1, BonusCirclePeg.class, "sprites/BonusCirclePeg.png");
        addEntity(2, PowerupCirclePeg.class, "sprites/PowerupCirclePeg.png");
        addEntity(3, RegularCirclePeg.class, "sprites/RegularCirclePeg.png");
        addEntity(4, RequiredCirclePeg.class, "sprites/RequiredCirclePeg.png");
        addEntity(5, BonusRectanglePeg.class, "sprites/BonusRectanglePeg.png");
        addEntity(6, PowerupRectanglePeg.class, "sprites/PowerupRectanglePeg.png");
        addEntity(7, RegularRectanglePeg.class, "sprites/RegularRectanglePeg.png");
        addEntity(8, RequiredRectanglePeg.class, "sprites/RequiredRectanglePeg.png");

    }

    @Override
    public int[][] defineMap() {
        return new int[][] {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7},
                {0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0},
                {0, 0, 0, 0, 3, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {3, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 1, 0, 0, 2, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 2, 4, 0, 0, 1, 0, 0, 0, 0, 0, 0, 3, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 1, 0, 3, 0, 0, 0, 0, 0, 4, 0, 0, 0},
                {2, 3, 1, 0, 0, 2, 0, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 1, 4, 0, 0, 0, 0, 0, 0, 0, 6}
        };
    }
}