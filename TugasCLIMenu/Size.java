package TugasCLIMenu;

public class Size {
    private String nameSize;
    private int extraPrice;

    public Size(String nameSize, int extraPrice) {
        this.nameSize = nameSize;
        this.extraPrice = extraPrice;
    }
    public String getNameSize() {
        return nameSize;
    }
    public int getExtraPrice() {
        return extraPrice;
    }
}
