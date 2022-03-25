package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;


public abstract class Button extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    private Quaggle quaggle;

    public Button(Coordinate2D initialLocation, Quaggle quaggle, String caption) {
        super(initialLocation, caption);
        this.quaggle = quaggle;
    }
}
