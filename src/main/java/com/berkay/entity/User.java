package com.berkay.entity;

import java.io.Serializable;

public class User implements Serializable {
    String gender;
    String email;
    String phone;
    Name name;
    Register registered;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("gender='").append(gender).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", name=").append(name);
        sb.append(", registered=").append(registered);
        sb.append('}');
        return sb.toString();
    }

    public Register getRegistered() {
        return registered;
    }

    public void setRegistered(Register registered) {
        this.registered = registered;
    }

    public static class Register implements Serializable{
        String date;
        Integer age;

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Register{");
            sb.append("date='").append(date).append('\'');
            sb.append(", age=").append(age);
            sb.append('}');
            return sb.toString();
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }


    public static class Name implements Serializable{
        String title;
        String first;
        String last;

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Name{");
            sb.append("title='").append(title).append('\'');
            sb.append(", first='").append(first).append('\'');
            sb.append(", last='").append(last).append('\'');
            sb.append('}');
            return sb.toString();
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }
    }

    public User(String gender, String email, String phone, Name name) {
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.name = name;
    }

    public User() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}