package jpu2016.dogfight.gameframe;

import java.awt.*;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {

    void applyModelToGraphic(Graphics graphics, ImageObserver observer);

     static int getGlobalWidth(){
        return 0;
    }

    static int getGlobalHeight(){
         return 0;
    }
}
