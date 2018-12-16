package edu.nju.party.Controller;

import edu.nju.party.Entity.Note;
import edu.nju.party.Entity.User;
import edu.nju.party.Service.NoteService;
import edu.nju.party.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private NoteService noteService;

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(){
        return "login";
    }

    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value="/userRegister",method = RequestMethod.GET)
    public String userRegister(){

        return "userRegister";
    }


    @RequestMapping(value="/userLogin",method = RequestMethod.POST)
    public String postRegister(Model model, HttpServletRequest request) {
        User user = new User();
        user.setUserID("");

        userService.register(user);
        return "redirect:index";

    }


    @RequestMapping(value="/userLogin",method = RequestMethod.POST)
    public String userLogin(Model model, HttpServletRequest request){
        String userID = request.getParameter("userID");
        String password = request.getParameter("password");
        if (userService.login(userID,password)) {
            if (userID == "root")
                return "redirect:adminInfo";
            else
                return "redirect:userInfo";
        }
        else {
            model.addAttribute("error", "密码错误，请重新登录！");
                return "redirect:index";
        }
    }

    @RequestMapping(value = "/userInfo",method = RequestMethod.GET)
    public String userInfo(Model model, HttpServletRequest request){

        String userID = request.getParameter("userID");

        User user = userService.getInfo(userID);
        model.addAttribute("userInfo", user);


        return "userInfo";
    }


    @RequestMapping(value = "/userInfoUpdate",method = RequestMethod.POST)
    public String userInfoUpdate(Model model, HttpServletRequest request){
        String userID = request.getParameter("userID");


        User user = userService.getInfo(userID);
        model.addAttribute("userInfo", user);
        return "redirect:userInfo";

    }








}
