package edu.nju.party.Service;

import edu.nju.party.Entity.Note;

import java.util.ArrayList;

public interface NoteService {


    public ArrayList<Note> getNoteList(String userID);

    public ArrayList<Note> getDetailNote(String NoteID);


    //新增和回复使用同一个接口
    public ArrayList<Note> addNote(Note note);

    //userid 用于判断权限
    public ArrayList<Note> deleteNote(String userID ,String NoteID);

}
