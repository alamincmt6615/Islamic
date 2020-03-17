package alamin.c.islamicapp.DataHandeler;

public class ChoiceData {
    String id;
    String serial;
    String name;
    String url;

    public ChoiceData(String id, String serial, String name, String url) {
        this.id=id;
        this.serial = serial;
        this.name = name;
        this.url = url;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
