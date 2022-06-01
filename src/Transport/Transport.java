package Transport;

abstract public class Transport {

    String type;
    String name;
    boolean isPublic;

    public Transport(String type, String name, boolean isPublic) {
        this.type = type;
        this.name = name;
        this.isPublic = isPublic;
    }

    public String getType() { return type; }

    public String getName() { return name; }

    public boolean isPublic() { return isPublic; }

}
