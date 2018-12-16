package edu.nju.party.Controller;

import edu.nju.party.Entity.Note;
import edu.nju.party.Entity.PartyBranch;
import edu.nju.party.Entity.User;
import edu.nju.party.Service.AdminService;
import edu.nju.party.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

public class AdminController {


    @Autowired
    private AdminService adminService;

    @Autowired
    private NoteService noteService;


    @RequestMapping(value = "/adminInfo",method = RequestMethod.GET)
    public String adminInfo(Model model, HttpServletRequest request){

        ArrayList<PartyBranch> allBranch = adminService.getAllBranch();

        return "adminInfo";
    }


    @RequestMapping(value = "/allNoteList",method = RequestMethod.GET)
    public String allNoteList(Model model, HttpServletRequest request){

        ArrayList<Note> allBranch = adminService.getAllNote();

        return "allNoteList";
    }



    @RequestMapping(value="/createBranch",method = RequestMethod.GET)
    public String createBranch(){

        return "createBranch";
    }


    @RequestMapping(value="/deleteBranch",method = RequestMethod.POST)
    public String deleteBranch(Model model, HttpServletRequest request){

        String grade = request.getParameter("grade");
        String index = request.getParameter("index");


        boolean result = adminService.deleteBranch(Integer.getInteger(grade),
                                    Integer.getInteger(index));

        return "redirect:adminInfo";
    }








}
