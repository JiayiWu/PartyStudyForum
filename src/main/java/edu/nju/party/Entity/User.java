package edu.nju.party.Entity;

public class User {
    private String userID;
    private String userName;
    private String emailAdderss;
    private String password;
    private String branchName;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAdderss() {
        return emailAdderss;
    }

    public void setEmailAdderss(String emailAdderss) {
        this.emailAdderss = emailAdderss;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
