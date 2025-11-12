package TugasCLIMenu;

public class IceCreamCone extends IceCream implements HavePrice{
    public IceCreamCone(String flavour) {
        super(flavour, new Size("-", 0));
    }

    @Override
    public String getType() {
        return "Cone";
    }

    @Override
    public int getPrice() {
        return 13000;
    }
}
