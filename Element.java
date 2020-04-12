package org.commerce.visitor;

public interface Element {
    void accept(Visitor visitor);
}
