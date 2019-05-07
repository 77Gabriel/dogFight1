package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.DogfightController;
import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.DogfightModel;
import jpu2016.dogfight.model.IDogfightModel;
import java.util.Observable;

public abstract class DogfightView implements IViewSystem {

    public DogfightView(DogfightController dogfightController, DogfightModel dogfightModel) {

    }


    private void run() {

    }

    public void closeAll() {

    }

    public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel,
                         Observable observer){

    }
    public void displayMessage(String message){

    }

}

