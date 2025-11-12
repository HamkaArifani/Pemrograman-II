package TugasCLIMenu;

public abstract class IceCream {
  private String flavour;
  protected Size size;

  public IceCream(String flavour, Size size) {
      this.flavour = flavour;
      this.size = size;
  }

  public String getFlavour() {
      return flavour;
  }

  public Size getSize() {
      return size;
  }

  public abstract String getType();
}
