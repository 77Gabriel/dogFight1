package jpu2016.dogfight.model;

import java.util.ArrayList;

public interface IDogfightModel {

    IArea getArea();
    void buildArea(Dimension dimension);
    void addMobile(IMobile Mobile);
    void removeMobile(IMobile Mobile);
    ArrayList<IMobile> getMobile();
    IMobile getMobileByPlayer(int player);
    void setMobilesHavesMoved();

}
