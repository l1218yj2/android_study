package com.drakeash.okhttp3;

import org.simpleframework.xml.ElementList;

import java.io.Serializable;
import java.util.List;

/**
 * Created by YongJae on 2016-03-22.
 */
public class Images implements Serializable {
    @ElementList(inline = true)
    List<Image> Images;

    public List<Image> getImages() {
        return Images;
    }

    public void setImages(List<Image> Images) {
        this.Images = Images;
    }
}
