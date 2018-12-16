package edu.nju.party.Controller;

import edu.nju.party.Entity.Note;
import edu.nju.party.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

public class NoteController {

    @Autowired
    private NoteService noteService;


    @RequestMapping(value = "/noteList",method = RequestMethod.GET)
    public String noteInfo(Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        String userID = (String) session.getAttribute("userID");
        ArrayList<Note> allBranch = noteService.getNoteList(userID);

        return "noteList";
    }

    @RequestMapping(value="/addNote",method = RequestMethod.GET)
    public String addNote(){

        return "addNote";
    }

    @RequestMapping(value="/addNoteDetail",method = RequestMethod.POST)
    public String addNoteDetail(Model model,HttpServletRequest request){

        Note note = new Note();
        //get attr

        ArrayList<Note> result = noteService.addNote(note);

        //add attr

        return "noteDetialInfo";
    }



    @RequestMapping(value = "/noteDetailInfo",method = RequestMethod.GET)
    public String noteDetailInfo(Model model, HttpServletRequest request){

        String noteID = request.getParameter("noteID");
        ArrayList<Note> notes = noteService.getDetailNote(noteID);

        return "noteDetailInfo";

    }

    @RequestMapping(value="/addNoteDetail",method = RequestMethod.POST)
    public String deleteNote(Model model,HttpServletRequest request){

        HttpSession session = request.getSession();
        String userID = (String) session.getAttribute("userID");
        String noteID = request.getParameter("noteID");
        ArrayList<Note> result = noteService.deleteNote(userID,noteID);

        //add attr

        return "noteDetialInfo";
    }







}
