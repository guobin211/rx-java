package io;

/**
 * io   MyVersion
 *
 * @author guobin201314@gmail.com on 2019-01-16
 * @deprecated 1.8
 */
public class MyVersion {

    private String version;

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String v) {
        this.version = v;
    }

    public String toString() {
        return "{version:" + this.version + "}";

    }
}
