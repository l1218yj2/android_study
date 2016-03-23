package com.drakeash.okhttp3;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

/**
 * Created by YongJae on 2016-03-22.
 */
@Root(name="image")
public class Image implements Serializable {

    @Element(name = "url")
    String url;
    @Element(name = "source_url")
    String source_url;
    @Element(name = "id")
    String id;

    public String getSource_url() {
        return source_url;
    }

    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
