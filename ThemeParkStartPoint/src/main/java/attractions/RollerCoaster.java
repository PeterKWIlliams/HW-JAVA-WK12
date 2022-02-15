package attractions;


import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }


    @Override
    public boolean isAllowedToVisitor(Visitor visitor) {
        if (visitor.getHeight() >= 145 && visitor.getAge()>=12){return true;}
        return false;
    }

    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) {
            return 8.40 * 2;
        }
        else return 8.40;
    }
}
