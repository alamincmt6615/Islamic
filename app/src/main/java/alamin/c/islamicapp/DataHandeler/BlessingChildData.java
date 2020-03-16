package alamin.c.islamicapp.DataHandeler;

import android.os.Parcel;
import android.os.Parcelable;

public class BlessingChildData implements Parcelable {

    public   final  String name;
    public   final  String serial;

    public BlessingChildData(String name, String serial) {
        this.name = name;
        this.serial=serial;
    }


    protected BlessingChildData(Parcel in) {
        name = in.readString();
        serial=in.readString();
    }

    public static final Creator<BlessingChildData> CREATOR = new Creator<BlessingChildData>() {
        @Override
        public BlessingChildData createFromParcel(Parcel in) {
            return new BlessingChildData(in);
        }

        @Override
        public BlessingChildData[] newArray(int size) {
            return new BlessingChildData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name);
            dest.writeString(serial);
    }
}
