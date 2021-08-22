
package ApiAdapters.HomeApi;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Slider implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("category")
    @Expose
    private Object category;
    @SerializedName("product")
    @Expose
    private Object product;
    @SerializedName("product_id")
    @Expose
    private Object productId;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("medium")
    @Expose
    private List<Medium> medium = null;
    public final static Creator<Slider> CREATOR = new Creator<Slider>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Slider createFromParcel(android.os.Parcel in) {
            return new Slider(in);
        }

        public Slider[] newArray(int size) {
            return (new Slider[size]);
        }

    }
    ;
    private final static long serialVersionUID = -1782707386676333644L;

    protected Slider(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.category = ((Object) in.readValue((Object.class.getClassLoader())));
        this.product = ((Object) in.readValue((Object.class.getClassLoader())));
        this.productId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.link = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.deletedAt = ((Object) in.readValue((Object.class.getClassLoader())));
        in.readList(this.medium, (ApiAdapters.HomeApi.Medium.class.getClassLoader()));
    }

    public Slider() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public Object getProduct() {
        return product;
    }

    public void setProduct(Object product) {
        this.product = product;
    }

    public Object getProductId() {
        return productId;
    }

    public void setProductId(Object productId) {
        this.productId = productId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public List<Medium> getMedium() {
        return medium;
    }

    public void setMedium(List<Medium> medium) {
        this.medium = medium;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(category);
        dest.writeValue(product);
        dest.writeValue(productId);
        dest.writeValue(link);
        dest.writeValue(status);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
        dest.writeValue(deletedAt);
        dest.writeList(medium);
    }

    public int describeContents() {
        return  0;
    }

}
