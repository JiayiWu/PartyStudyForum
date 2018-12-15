package edu.nju.party.Controller;

import edu.nju.party.Entity.User;
import edu.nju.party.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

public class UserController {

    @Autowired
    private UserService userService;

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
    public String userLogin(Model model, HttpServletRequest request){
        String userID = request.getParameter("userID");
        String password = request.getParameter("password");
        if (userService.login(userID,password))
            return "redirect:userInfo";
        else
            return "login";
    }

    @RequestMapping(value = "/userInfo",method = RequestMethod.GET)
    public String userInfo(Model model, HttpServletRequest request){

        String userID = request.getParameter("userID");

        User user = userService.getInfo(userID);
        model.addAttribute("userInfo", user);
        return "userInfo";
    }





}
