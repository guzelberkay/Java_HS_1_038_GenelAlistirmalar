package com.berkay;

import java.util.Random;
import java.util.UUID;

public class User {
  private String id;
  private String ad;
  private String soyad;
  private int yas;

    public User( String ad, String soyad, int yas) {
        this.id =  UUID.randomUUID().toString();
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", soyad='").append(soyad).append('\'');
        sb.append(", yas=").append(yas);
        sb.append('}');
        return sb.toString();
    }
}
