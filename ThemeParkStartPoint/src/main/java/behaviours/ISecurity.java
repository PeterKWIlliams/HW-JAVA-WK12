package behaviours;

import people.Visitor;

public interface ISecurity {
    boolean isAllowedToVisitor(Visitor visitor);
}
