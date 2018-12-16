package edu.nju.party.Entity;

public class Note {
    private String noteID;
    private String content;
    private String isRoot; //是不是楼主

    private String replyID;
    private String ownerID;
    private String ownerName;

    private String isSecretary; //是不是班子发的帖
    private String isAdmin; //获取时候提前判断有没有删除的权限，可能需要

    public String getNoteID() {
        return noteID;
    }

    public void setNoteID(String noteID) {
        this.noteID = noteID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(String isRoot) {
        this.isRoot = isRoot;
    }

    public String getIsSecretary() {
        return isSecretary;
    }

    public void setIsSecretary(String isSecretary) {
        this.isSecretary = isSecretary;
    }

    public String getReplyID() {
        return replyID;
    }

    public void setReplyID(String replyID) {
        this.replyID = replyID;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
