package behaviours;

import people.Visitor;

public interface ISecurity {

    public boolean isAllowedVisitor(Visitor visitor);
}
