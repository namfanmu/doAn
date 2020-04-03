package com.example.doan;

public class phuongTien {
    private String username;
    private String password;
    private String password_confirm;
    private String licensePlate;

    public phuongTien(String username, String password, String password_confirm, String licensePlate) {
        this.username = username;
        this.password = password;
        this.password_confirm = password_confirm;
        this.licensePlate = licensePlate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword_confirm() {
        return password_confirm;
    }

    public void setPassword_confirm(String password_confirm) {
        this.password_confirm = password_confirm;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
