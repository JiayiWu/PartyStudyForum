package edu.nju.party.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

public class PartyBranchController {

    @RequestMapping(value="/updateBranch",method = RequestMethod.POST)
    public String updateBranch(Model model, HttpServletRequest request){

        String noteID = request.getParameter("noteID");

        return "redirect:noteList";
    }

}
