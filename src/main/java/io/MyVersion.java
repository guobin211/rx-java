package io;

/**
 * io   MyVersion
 *
 * @author guobin201314@gmail.com on 2019-01-16
 * @version  1.0.0
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
        return String.format("{\"version\": \"%s\"}", this.version);
    }
}
