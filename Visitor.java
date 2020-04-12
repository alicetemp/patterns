package org.commerce.visitor;

public interface Visitor {
    void visit(Customer element);
    void visit(Endpoint element);
}
