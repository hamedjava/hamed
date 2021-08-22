
package ApiAdapters.HomeApi;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class SuggestionDay implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("asin")
    @Expose
    private String asin;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("parent_asin")
    @Expose
    private Object parentAsin;
    @SerializedName("en_title")
    @Expose
    private String enTitle;
    @SerializedName("fa_title")
    @Expose
    private String faTitle;
    @SerializedName("fa_description")
    @Expose
    private String faDescription;
    @SerializedName("en_description")
    @Expose
    private String enDescription;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("category_1")
    @Expose
    private String category1;
    @SerializedName("category_2")
    @Expose
    private Object category2;
    @SerializedName("category_3")
    @Expose
    private List<String> category3 = null;
    @SerializedName("original_price")
    @Expose
    private String originalPrice;
    @SerializedName("primary_price")
    @Expose
    private String primaryPrice;
    @SerializedName("rate")
    @Expose
    private String rate;
    @SerializedName("total_rate")
    @Expose
    private String totalRate;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("role_id")
    @Expose
    private Object roleId;
    public final static Creator<SuggestionDay> CREATOR = new Creator<SuggestionDay>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SuggestionDay createFromParcel(android.os.Parcel in) {
            return new SuggestionDay(in);
        }

        public SuggestionDay[] newArray(int size) {
            return (new SuggestionDay[size]);
        }

    }
    ;
    private final static long serialVersionUID = -8026453230229970743L;

    protected SuggestionDay(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.asin = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.parentAsin = ((Object) in.readValue((Object.class.getClassLoader())));
        this.enTitle = ((String) in.readValue((String.class.getClassLoader())));
        this.faTitle = ((String) in.readValue((String.class.getClassLoader())));
        this.faDescription = ((String) in.readValue((String.class.getClassLoader())));
        this.enDescription = ((String) in.readValue((String.class.getClassLoader())));
        this.image = ((String) in.readValue((String.class.getClassLoader())));
        this.link = ((String) in.readValue((String.class.getClassLoader())));
        this.brand = ((String) in.readValue((String.class.getClassLoader())));
        this.weight = ((String) in.readValue((String.class.getClassLoader())));
        this.category1 = ((String) in.readValue((String.class.getClassLoader())));
        this.category2 = ((Object) in.readValue((Object.class.getClassLoader())));
        in.readList(this.category3, (String.class.getClassLoader()));
        this.originalPrice = ((String) in.readValue((String.class.getClassLoader())));
        this.primaryPrice = ((String) in.readValue((String.class.getClassLoader())));
        this.rate = ((String) in.readValue((String.class.getClassLoader())));
        this.totalRate = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.roleId = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public SuggestionDay() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getParentAsin() {
        return parentAsin;
    }

    public void setParentAsin(Object parentAsin) {
        this.parentAsin = parentAsin;
    }

    public String getEnTitle() {
        return enTitle;
    }

    public void setEnTitle(String enTitle) {
        this.enTitle = enTitle;
    }

    public String getFaTitle() {
        return faTitle;
    }

    public void setFaTitle(String faTitle) {
        this.faTitle = faTitle;
    }

    public String getFaDescription() {
        return faDescription;
    }

    public void setFaDescription(String faDescription) {
        this.faDescription = faDescription;
    }

    public String getEnDescription() {
        return enDescription;
    }

    public void setEnDescription(String enDescription) {
        this.enDescription = enDescription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCategory1() {
        return category1;
    }

    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    public Object getCategory2() {
        return category2;
    }

    public void setCategory2(Object category2) {
        this.category2 = category2;
    }

    public List<String> getCategory3() {
        return category3;
    }

    public void setCategory3(List<String> category3) {
        this.category3 = category3;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getPrimaryPrice() {
        return primaryPrice;
    }

    public void setPrimaryPrice(String primaryPrice) {
        this.primaryPrice = primaryPrice;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(String totalRate) {
        this.totalRate = totalRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getRoleId() {
        return roleId;
    }

    public void setRoleId(Object roleId) {
        this.roleId = roleId;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(asin);
        dest.writeValue(type);
        dest.writeValue(parentAsin);
        dest.writeValue(enTitle);
        dest.writeValue(faTitle);
        dest.writeValue(faDescription);
        dest.writeValue(enDescription);
        dest.writeValue(image);
        dest.writeValue(link);
        dest.writeValue(brand);
        dest.writeValue(weight);
        dest.writeValue(category1);
        dest.writeValue(category2);
        dest.writeList(category3);
        dest.writeValue(originalPrice);
        dest.writeValue(primaryPrice);
        dest.writeValue(rate);
        dest.writeValue(totalRate);
        dest.writeValue(status);
        dest.writeValue(roleId);
    }

    public int describeContents() {
        return  0;
    }

}
