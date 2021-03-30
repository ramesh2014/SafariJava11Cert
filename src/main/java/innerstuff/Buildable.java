package innerstuff;

public class Buildable {
  private String name;
  private int value;
  private Buildable() {}

  public static class Builder {
    Buildable target = new Buildable();
    private Builder() {}

    public Builder name(String n) {
      target.name = n;
      return this;
    }

    public Builder value(int v) {
      target.value = v;
      return this;
    }

    public Buildable build() {
      // validate integrity of target first!!...
      return target;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "Buildable{" +
        "name='" + name + '\'' +
        ", value=" + value +
        '}';
  }
}

class Runner {
  public static class Entry {
    public static void main(String[] args) {
      Buildable b = Buildable.builder()
          .name("Fred")
          .value(99)
          .build();
      System.out.println(b);
    }
  }
}