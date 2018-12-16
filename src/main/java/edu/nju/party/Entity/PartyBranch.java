package edu.nju.party.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PartyBranch {
    private int grade;
    private int index;
    private String branchName;
    private List<String> members;
    private String secretaryName;

//    private Map<String,String> leadTeam;//这玩意要吗？
    private String leadTeam1Name;
    private String leadTeam2Name;
    private String leadTeam3Name;

    private String password; //加入密码

    private String isAdmin;//获取时候提前判断有没有删除的权限，可能需要



    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public void setSecretaryName(String secretaryName) {
        this.secretaryName = secretaryName;
    }


    public String getLeadTeam1Name() {
        return leadTeam1Name;
    }

    public void setLeadTeam1Name(String leadTeam1Name) {
        this.leadTeam1Name = leadTeam1Name;
    }

    public String getLeadTeam2Name() {
        return leadTeam2Name;
    }

    public void setLeadTeam2Name(String leadTeam2Name) {
        this.leadTeam2Name = leadTeam2Name;
    }

    public String getLeadTeam3Name() {
        return leadTeam3Name;
    }

    public void setLeadTeam3Name(String leadTeam3Name) {
        this.leadTeam3Name = leadTeam3Name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
