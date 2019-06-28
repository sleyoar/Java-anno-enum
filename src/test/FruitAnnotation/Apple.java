package test.FruitAnnotation;

public class Apple {
    @FruitName(name = "阿飞苹果")
    private String name;
    @FruitColor(color = "青色")
    private String color;
    @FruitProvider(provider ="冰糖心")
    private String provider;

    public Apple() { }

    @FruitName()
    @FruitProvider()
    @FruitColor()
    public Apple(String name, String color, String provider) {
        this.name = name;
        this.color = color;
        this.provider = provider;
    }
    @FruitName()
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @FruitColor()
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @FruitProvider()
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
