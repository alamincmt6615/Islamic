package alamin.c.islamicapp.DataHandeler;

public class ParaListHandeler {

      String paraserial;
      String paraname;
      String paraArabic;
      String suranName;


    public ParaListHandeler(String paraserial, String paraname, String paraArabic, String suranName) {
        this.paraserial = paraserial;
        this.paraname = paraname;
        this.paraArabic = paraArabic;
        this.suranName = suranName;
    }


    public String getParaserial() {
        return paraserial;
    }

    public void setParaserial(String paraserial) {
        this.paraserial = paraserial;
    }

    public String getParaname() {
        return paraname;
    }

    public void setParaname(String paraname) {
        this.paraname = paraname;
    }

    public String getParaArabic() {
        return paraArabic;
    }

    public void setParaArabic(String paraArabic) {
        this.paraArabic = paraArabic;
    }

    public String getSuranName() {
        return suranName;
    }

    public void setSuranName(String suranName) {
        this.suranName = suranName;
    }
}
