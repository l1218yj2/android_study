package com.drakeash.okhttp3;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

/**
 * Created by YongJae on 2016-03-22.
 */
@Root(name = "response")
public class Response implements Serializable {
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Element(name="data")
    Data data;
}
