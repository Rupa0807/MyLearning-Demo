package com.rupa.mvcdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController  {
   @RequestMapping("/home")
   public String showPage(){

       return "main";
   }

    @RequestMapping("/processForm")
    public String ProcessPage(HttpServletRequest req,@RequestParam("username") String userID, Model model){
        System.out.println("userID "+ userID);
       String username=req.getParameter("username").toUpperCase();
       model.addAttribute("uppername",username);
       model.addAttribute("userID",userID);


        return "processForm";
    }
}
