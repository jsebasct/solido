package org.learn.base.lsp;

/**
 * we do not want any client (someone who uses our class in their code)
 * to change height or weight in a way that can violate the square property.
 *
 * Therefore we override the setters to set both properties whenever one of them is changed. But by doing that
 * we have just violated the Liskov substitution principle
 */
public class Square extends Rectangle {

    public Square() {
    }

    public Square(int size) {
        width = height = size;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
