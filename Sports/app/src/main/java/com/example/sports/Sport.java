package com.example.sports;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Sport implements Parcelable {
    private String title;
    private String info;
    private final int imageResource;


    public Sport(String title, String info, int imageResource) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;

    }

    protected Sport(Parcel in) {
        title = in.readString();
        info = in.readString();
        imageResource = in.readInt();
    }

    public static final Creator<Sport> CREATOR = new Creator<Sport>() {
        @Override
        public Sport createFromParcel(Parcel in) {
            return new Sport(in);
        }

        @Override
        public Sport[] newArray(int size) {
            return new Sport[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResource() {
        return imageResource;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(info);
        parcel.writeInt(imageResource);
    }
}
