package com.github.hanyaeger.tutorial.GameLevelComponents;

import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.CirclePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs.RectanglePeg;

public class PegTileMap extends TileMap {
    //The array indicating what the location of each peg should be
    private int[][] pegArray;

    //Array with CirclePegs to be added as entities
    private CirclePeg[] circlePegEntityArray;

    //Array with RectanglePegs to be added as entities
    private RectanglePeg[] rectanglePegEntityArray;

    //Constructor 1, in case one wants to make a TileMap with only CirclePegs
    public PegTileMap(int[][] pegArray, CirclePeg[] circlePegEntityArray){
        this.pegArray = pegArray;
        this.circlePegEntityArray = circlePegEntityArray;
    }

    //Constructor 2, in case one wants to make a TileMap with only RectanglePegs
    public PegTileMap(int[][] pegArray, RectanglePeg[] rectanglePegEntityArray){
        this.pegArray = pegArray;
        this.rectanglePegEntityArray = rectanglePegEntityArray;
    }

    //Constructor 3, in case one wants to make a TileMap with both CirclePegs and RectanglePegs
    public PegTileMap(int[][] pegArray, CirclePeg[] circlePegEntityArray, RectanglePeg[] rectanglePegEntityArray){
        this.pegArray = pegArray;
        this.circlePegEntityArray = circlePegEntityArray;
        this.rectanglePegEntityArray = rectanglePegEntityArray;
    }

    //All required entities will be set up
    @Override
    public void setupEntities() {
        if(circlePegEntityArray.length > 0) {
            for (CirclePeg c : circlePegEntityArray) {
                addEntity(c.entityID, CirclePeg.class, c.spriteImagePath);
            }
        }

        if(rectanglePegEntityArray.length > 0) {
            for (RectanglePeg r : rectanglePegEntityArray) {
                addEntity(r.entityID, RectanglePeg.class, r.spriteImagePath);
            }
        }
    }

    @Override
    public int[][] defineMap() {
        return pegArray;
    }
}
