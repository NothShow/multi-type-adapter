package com.baurine.multitypeadaptersample.model;

/**
 * Created by baurine on 1/11/17.
 */

public class Faker {
    public static BaseModel fakeModel(int type) {
        if (type == 0) {
            return new ImageModel();
        } else {
            return new TextModel();
        }
    }
}
