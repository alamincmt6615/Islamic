package alamin.c.islamicapp.DataHandeler;

public class SuraValues {

    String arabic;
    String banglaTranslate;
    String bangla;
    String ayahserial;

    public SuraValues(String arabic, String banglaTranslate, String bangla,String ayahserial) {
        this.arabic = arabic;
        this.banglaTranslate = banglaTranslate;
        this.bangla = bangla;
        this.ayahserial=ayahserial;
    }

    public String getArabic() {
        return arabic;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }

    public String getBangla() {
        return bangla;
    }

    public void setBangla(String bangla) {
        this.bangla = bangla;
    }

    public String getBanglaTranslate() {
        return banglaTranslate;
    }

    public void setBanglaTranslate(String banglaTranslate) {
        this.banglaTranslate = banglaTranslate;
    }

    public String getAyahserial() {
        return ayahserial;
    }

    public void setAyahserial(String ayahserial) {
        this.ayahserial = ayahserial;
    }
}
