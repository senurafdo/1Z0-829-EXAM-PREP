package generics.genericInterfaces;

public class ShippableAbstractCrate <U> implements Shippable <U> {

    @Override
    public void ship(U t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ship'");
    }

}
