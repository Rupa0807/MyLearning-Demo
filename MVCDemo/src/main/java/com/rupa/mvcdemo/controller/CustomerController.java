package com.rupa.mvcdemo.controller;

import com.rupa.mvcdemo.Entity.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/customers")
public class CustomerController {
int count=0;

@RequestMapping("/form")
    public String showForm( Model model){


    Customer Customer= new Customer();
      model.addAttribute("Customer",  Customer);
      return "customer-form";
    }

    @RequestMapping("/processCustomer")
    public String processForm(@Valid @ModelAttribute("Customer") Customer customer , BindingResult binding,Model model){
        System.out.println("errors ="+binding.getAllErrors());
        if(binding.hasErrors())
            return "customer-form";
        else{
        model.addAttribute("Customer",  customer);
        return "processCustomer";}
    }

    @InitBinder
    public void myBinder(WebDataBinder binder){
        System.out.println("inside Init binder ="+count++);
        StringTrimmerEditor trimmer= new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class,trimmer);
    }
}
