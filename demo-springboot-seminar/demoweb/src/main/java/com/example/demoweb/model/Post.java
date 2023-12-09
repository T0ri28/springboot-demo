package com.example.demoweb.model;

import com.example.demoweb.Repository.TuyenDungRepository;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "JobPost")
public class Post {
    private String tenCongViec;
    private String gioiThieuCongViec;
    private String kinhNghiem;
    private String kyNang;

    public Post() {
    }

    public Post(String tenCongViec, String gioiThieuCongViec, String kinhNghiem, String kyNang) {
        this.tenCongViec = tenCongViec;
        this.gioiThieuCongViec = gioiThieuCongViec;
        this.kinhNghiem = kinhNghiem;
        this.kyNang = kyNang;
    }
    public String getTenCongViec() {
        return tenCongViec;
    }

    public void setTenCongViec(String tenCongViec) {
        this.tenCongViec = tenCongViec;
    }

    public String getGioiThieuCongViec() {
        return gioiThieuCongViec;
    }

    public void setGioiThieuCongViec(String gioiThieuCongViec) {
        this.gioiThieuCongViec = gioiThieuCongViec;
    }

    public String getKinhNghiem() {
        return kinhNghiem;
    }

    public void setKinhNghiem(String kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }

    public String getKyNang() {
        return kyNang;
    }

    public void setKyNang(String kyNang) {
        this.kyNang = kyNang;
    }

    @Override
    public String toString() {
        return "Post{" +
                "tenCongViec='" + tenCongViec + '\'' +
                ", gioiThieuCongViec='" + gioiThieuCongViec + '\'' +
                ", kinhNghiem='" + kinhNghiem + '\'' +
                ", kyNang=" + kyNang +
                '}';
    }
}