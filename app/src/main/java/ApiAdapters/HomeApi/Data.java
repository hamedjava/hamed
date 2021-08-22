
package ApiAdapters.HomeApi;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable, Parcelable
{

    @SerializedName("slider")
    @Expose
    private List<Slider> slider = null;
    @SerializedName("suggestion_day")
    @Expose
    private List<SuggestionDay> suggestionDay = null;
    public final static Creator<Data> CREATOR = new Creator<Data>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Data createFromParcel(android.os.Parcel in) {
            return new Data(in);
        }

        public Data[] newArray(int size) {
            return (new Data[size]);
        }

    }
    ;
    private final static long serialVersionUID = -3527738081491966236L;

    protected Data(android.os.Parcel in) {
        in.readList(this.slider, (Slider.class.getClassLoader()));
        in.readList(this.suggestionDay, (SuggestionDay.class.getClassLoader()));
    }

    public Data() {
    }

    public List<Slider> getSlider() {
        return slider;
    }

    public void setSlider(List<Slider> slider) {
        this.slider = slider;
    }

    public List<SuggestionDay> getSuggestionDay() {
        return suggestionDay;
    }

    public void setSuggestionDay(List<SuggestionDay> suggestionDay) {
        this.suggestionDay = suggestionDay;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeList(slider);
        dest.writeList(suggestionDay);
    }

    public int describeContents() {
        return  0;
    }

}
