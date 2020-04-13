package alamin.c.islamicapp.DataHandeler;

public class SaveAyatDataHandeler {
    String id;
    String english;
    String bangla;
    String ayatSerial;
    String  arabic;
    String suraName;
    String translate;

    public SaveAyatDataHandeler(String id, String english, String bangla, String ayatSerial, String arabic, String suraName,String translate) {
        this.id = id;
        this.english = english;
        this.bangla = bangla;
        this.ayatSerial = ayatSerial;
        this.arabic = arabic;
        this.suraName = suraName;
        this.translate=translate;
    }


    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getBangla() {
        return bangla;
    }

    public void setBangla(String bangla) {
        this.bangla = bangla;
    }

    public String getAyatSerial() {
        return ayatSerial;
    }

    public void setAyatSerial(String ayatSerial) {
        this.ayatSerial = ayatSerial;
    }

    public String getArabic() {
        return arabic;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }

    public String getSuraName() {
        return suraName;
    }

    public void setSuraName(String suraName) {
        this.suraName = suraName;
    }
}
