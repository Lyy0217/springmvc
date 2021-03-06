package pojo;

import org.springframework.web.multipart.MultipartFile;

public class UploadedImageFile {
    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    /**
     * 在UploadedImageFile中封装MultipartFile类型的字段 image ，用于接受页面的注入
     * <p>
     * 这里的字段 image必须和上传页面upload.jsp中的image
     * <input type="file" name="image" accept="image/*" />
     * 保持一致
     */
    private MultipartFile image;
}