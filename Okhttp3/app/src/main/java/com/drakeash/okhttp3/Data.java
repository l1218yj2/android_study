package com.drakeash.okhttp3;

import java.io.Serializable;

/**
 * Created by YongJae on 2016-03-22.
 */
public class Data implements Serializable {
    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    @org.simpleframework.xml.Element(name = "images")
    Images images;
}
