package TugasCLIMenu;

public class IceCreamCup extends IceCream implements HavePrice {
    public IceCreamCup(String flavour, Size size) {
        super(flavour, size);
    }

    @Override
    public String getType() {
        return "Cup";
    }

    @Override
    public int getPrice() {
        int base = 15000;
        return base+size.getExtraPrice();
    }
}
