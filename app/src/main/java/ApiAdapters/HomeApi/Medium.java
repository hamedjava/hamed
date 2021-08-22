
package ApiAdapters.HomeApi;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Medium implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("file_name")
    @Expose
    private String fileName;
    @SerializedName("extension")
    @Expose
    private String extension;
    @SerializedName("mime")
    @Expose
    private String mime;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("mediumable_id")
    @Expose
    private String mediumableId;
    @SerializedName("mediumable_field")
    @Expose
    private String mediumableField;
    @SerializedName("mediumable_type")
    @Expose
    private String mediumableType;
    @SerializedName("mediumable_position")
    @Expose
    private String mediumablePosition;
    @SerializedName("manner")
    @Expose
    private String manner;
    @SerializedName("comments_count")
    @Expose
    private String commentsCount;
    @SerializedName("likes_count")
    @Expose
    private String likesCount;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("url")
    @Expose
    private String url;
    public final static Creator<Medium> CREATOR = new Creator<Medium>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Medium createFromParcel(android.os.Parcel in) {
            return new Medium(in);
        }

        public Medium[] newArray(int size) {
            return (new Medium[size]);
        }

    }
    ;
    private final static long serialVersionUID = 154650614996040249L;

    protected Medium(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.caption = ((String) in.readValue((String.class.getClassLoader())));
        this.fileName = ((String) in.readValue((String.class.getClassLoader())));
        this.extension = ((String) in.readValue((String.class.getClassLoader())));
        this.mime = ((String) in.readValue((String.class.getClassLoader())));
        this.size = ((String) in.readValue((String.class.getClassLoader())));
        this.mediumableId = ((String) in.readValue((String.class.getClassLoader())));
        this.mediumableField = ((String) in.readValue((String.class.getClassLoader())));
        this.mediumableType = ((String) in.readValue((String.class.getClassLoader())));
        this.mediumablePosition = ((String) in.readValue((String.class.getClassLoader())));
        this.manner = ((String) in.readValue((String.class.getClassLoader())));
        this.commentsCount = ((String) in.readValue((String.class.getClassLoader())));
        this.likesCount = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Medium() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMediumableId() {
        return mediumableId;
    }

    public void setMediumableId(String mediumableId) {
        this.mediumableId = mediumableId;
    }

    public String getMediumableField() {
        return mediumableField;
    }

    public void setMediumableField(String mediumableField) {
        this.mediumableField = mediumableField;
    }

    public String getMediumableType() {
        return mediumableType;
    }

    public void setMediumableType(String mediumableType) {
        this.mediumableType = mediumableType;
    }

    public String getMediumablePosition() {
        return mediumablePosition;
    }

    public void setMediumablePosition(String mediumablePosition) {
        this.mediumablePosition = mediumablePosition;
    }

    public String getManner() {
        return manner;
    }

    public void setManner(String manner) {
        this.manner = manner;
    }

    public String getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(String commentsCount) {
        this.commentsCount = commentsCount;
    }

    public String getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(String likesCount) {
        this.likesCount = likesCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(caption);
        dest.writeValue(fileName);
        dest.writeValue(extension);
        dest.writeValue(mime);
        dest.writeValue(size);
        dest.writeValue(mediumableId);
        dest.writeValue(mediumableField);
        dest.writeValue(mediumableType);
        dest.writeValue(mediumablePosition);
        dest.writeValue(manner);
        dest.writeValue(commentsCount);
        dest.writeValue(likesCount);
        dest.writeValue(description);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
        dest.writeValue(url);
    }

    public int describeContents() {
        return  0;
    }

}
