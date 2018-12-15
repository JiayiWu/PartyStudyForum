package edu.nju.party.Entity;

import java.util.List;
import java.util.Map;

public class PartyBranch {
    private int grade;
    private int index;
    private String branchName;
    private List<String> members;
    private String secretaryName;

    private Map<String,String> leadTeam;//这玩意要吗？

    public Map<String, String> getLeadTeam() {
        return leadTeam;
    }

    public void setLeadTeam(Map<String, String> leadTeam) {
        this.leadTeam = leadTeam;
    }

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
}
