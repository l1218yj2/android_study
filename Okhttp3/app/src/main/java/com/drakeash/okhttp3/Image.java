package com.drakeash.okhttp3;

import org.simpleframework.xml.Element;

import java.io.Serializable;

/**
 * Created by YongJae on 2016-03-22.
 */

public class Image implements Serializable {

    @Element(name = "url")
    String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Element(name = "id")
    String id;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
