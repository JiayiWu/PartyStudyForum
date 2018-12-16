package edu.nju.party.Impl;

import edu.nju.party.Entity.Note;
import edu.nju.party.Service.NoteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NoteImpl implements NoteService{

    @Override
    public ArrayList<Note> getNoteList(String userID) {
        return null;
    }

    @Override
    public ArrayList<Note> getDetailNote(String NnteID) {
        return null;
    }

    @Override
    public ArrayList<Note> addNote(Note note) {
        return null;
    }

    @Override
    public boolean deleteNote(String userID, String NoteID) {
        return false;
    }
}
