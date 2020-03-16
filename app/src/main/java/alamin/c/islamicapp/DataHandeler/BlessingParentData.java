package alamin.c.islamicapp.DataHandeler;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class BlessingParentData extends ExpandableGroup<BlessingChildData> {
    String serial;
    public BlessingParentData(String title, List<BlessingChildData> items) {
        super(title, items);
    }


    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
