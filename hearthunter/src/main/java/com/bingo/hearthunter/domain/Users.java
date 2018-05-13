package com.bingo.hearthunter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by yanbiao on 2017/10/10.
 */
@Entity
public class Users {
    private String id;
    private String nickname;
    private String realname;
    private int age;
    private String gender;
    private String qq;
    private String phone;
    private String province;
    private String city;
    private String address;
    private Date createdTime;
    private Date updatedTime;
    private String job;
    private String skills;
    private String hobby;
    private String motto;
    private String introduction;
    private String idCardPic0;
    private String idCardPic1;
    private String pic0;
    private String pic1;
    private String pic2;
    private String pic3;
    private String pic4;

    @Id
    @Column(name = "id", nullable = false, length = 128)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "nickname", nullable = false, length = 128)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Column(name = "realname", nullable = true, length = 128)
    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Column(name = "age", nullable = true)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "gender", nullable = true, length = 10)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "qq", nullable = true, length = 50)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Column(name = "phone", nullable = true, length = 50)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "province", nullable = true, length = 128)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Column(name = "city", nullable = true, length = 128)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "address", nullable = true, length = 1000)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "created_time", nullable = true)
    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Column(name = "updated_time", nullable = true)
    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Column(name = "job", nullable = true, length = 128)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Column(name = "skills", nullable = true, length = 1000)
    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Column(name = "hobby", nullable = true, length = 1000)
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Column(name = "motto", nullable = true, length = 500)
    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    @Column(name = "introduction", nullable = true, length = 4000)
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Column(name = "id_card_pic0", nullable = true, length = 1000)
    public String getIdCardPic0() {
        return idCardPic0;
    }

    public void setIdCardPic0(String idCardPic0) {
        this.idCardPic0 = idCardPic0;
    }

    @Column(name = "id_card_pic1", nullable = true, length = 1000)
    public String getIdCardPic1() {
        return idCardPic1;
    }

    public void setIdCardPic1(String idCardPic1) {
        this.idCardPic1 = idCardPic1;
    }

    @Column(name = "pic0", nullable = true, length = 1000)
    public String getPic0() {
        return pic0;
    }

    public void setPic0(String pic0) {
        this.pic0 = pic0;
    }

    @Column(name = "pic1", nullable = true, length = 1000)
    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    @Column(name = "pic2", nullable = true, length = 1000)
    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    @Column(name = "pic3", nullable = true, length = 1000)
    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3;
    }

    @Column(name = "pic4", nullable = true, length = 1000)
    public String getPic4() {
        return pic4;
    }

    public void setPic4(String pic4) {
        this.pic4 = pic4;
    }

}
