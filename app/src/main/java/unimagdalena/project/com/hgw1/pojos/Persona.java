package unimagdalena.project.com.hgw1.pojos;

import android.os.Parcel;
import android.os.Parcelable;

public class Persona implements Parcelable{
    private String name;
    private String lastName;
    private String email;
    private long phone;

    public Persona(String name, String lastName, String email, long phone) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public Persona() {
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }



    private Persona(Parcel in){
        this.name=in.readString();
        this.lastName =in.readString();
        this.email =in.readString();
        this.phone =in.readLong();
    }



    public static final Parcelable.Creator<Persona>CREATOR=new Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel source) {
            return new Persona(source);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.lastName);
        dest.writeString(this.email);
        dest.writeLong(this.phone);




    }
}
