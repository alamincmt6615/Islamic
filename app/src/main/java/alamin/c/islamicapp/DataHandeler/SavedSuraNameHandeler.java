package alamin.c.islamicapp.DataHandeler;

public class SavedSuraNameHandeler {

    String name;
    String serial;
    String  translate;
    String arabic;
    String id;

    public SavedSuraNameHandeler(String name, String serial, String translate, String arabic,String id) {
        this.name = name;
        this.serial = serial;
        this.translate = translate;
        this.arabic = arabic;
        this.id=id;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getArabic() {
        return arabic;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }
}
