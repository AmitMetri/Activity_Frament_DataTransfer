package activity_to_activity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by dell on 4/21/2018.
 */

public class Person implements Parcelable {

    /*Reference link
    https://www.survivingwithandroid.com/2012/09/passing-data-between-activities-2.html
*/
    //Getter ans setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String name, surname, email;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }


    private Person(Parcel in) {
        name = in.readString();
        surname = in.readString();
        email = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public Person() {

    }

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(surname);
        parcel.writeString(email);
    }


}
