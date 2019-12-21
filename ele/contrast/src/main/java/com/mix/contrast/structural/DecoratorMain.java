package com.mix.contrast.structural;

interface DomElement {
    /**
     * render()
     */
    void render();
}

class DivElement implements DomElement {

    @Override
    public void render() {
        System.out.println("DivElement render()");
    }
}

class SpanElement implements DomElement {

    @Override
    public void render() {
        System.out.println("SpanElement render()");
    }
}

abstract class BaseDocument implements DomElement {

    private DomElement element;

    BaseDocument(DomElement domElement) {
        element = domElement;
    }

    @Override
    public void render() {
        element.render();
    }
}

class Document extends BaseDocument {

    private static final Integer DOUBLE_INT = 2;

    private int random = 0;

    Document(DomElement domElement) {
        super(domElement);
    }

    @Override
    public void render() {
        super.render();
        if (this.random % DOUBLE_INT == 0) {
            this.setColor("#ffffff");
        } else {
            this.setColor("#cccccc");
        }
        this.random++;
    }

    private void setColor(String color) {
        System.out.println("Document.color = " + color);
    }
}

/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-13  10:08
 */
public class DecoratorMain {
    public static void main(String[] args) {
        System.out.println("装饰器模式");
        Document document = new Document(new DivElement());
        document.render();
        document.render();
    }
}
