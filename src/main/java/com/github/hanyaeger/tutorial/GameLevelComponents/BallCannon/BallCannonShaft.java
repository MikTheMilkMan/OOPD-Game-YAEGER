package com.github.hanyaeger.tutorial.GameLevelComponents.BallCannon;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.impl.DynamicRectangleEntity;
import com.github.hanyaeger.tutorial.GameLevelComponents.CursorEntity;
import javafx.scene.Cursor;

public class BallCannonShaft extends DynamicRectangleEntity implements UpdateExposer {
    private BallCannon ballCannon;
    private CursorEntity cursor;


    protected BallCannonShaft(Coordinate2D initialLocation, BallCannon ballCannon, CursorEntity cursor) {
        super(initialLocation, new Size(20, 110));
        this.ballCannon = ballCannon;
        this.cursor = cursor;
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
    }

    @Override
    public void explicitUpdate(long l) {
        var angle = angleTo(cursor);
        setRotate(angle);

    }
}
