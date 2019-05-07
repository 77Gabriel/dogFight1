package jpu2016.dogfight.model;

import java.awt.*;

public class Sky implements IArea {

    private Dimension dimension;

    public void Sky(Dimension dimension){
        this.dimension = dimension;
    }
    public Dimension getDimension(){
        return this.dimension;

    }
    public Image getImage(){
        return this.getImage();
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
