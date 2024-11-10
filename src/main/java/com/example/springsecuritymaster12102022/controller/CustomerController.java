package com.example.springsecuritymaster12102022.controller;


import com.example.springsecuritymaster12102022.dao.CustomerDao;
import com.example.springsecuritymaster12102022.ds.Customer;
import com.example.springsecuritymaster12102022.security.annotation.customers.IsCustomerCreate;
import com.example.springsecuritymaster12102022.security.annotation.customers.IsCustomerDelete;
import com.example.springsecuritymaster12102022.security.annotation.customers.IsCustomerRead;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;

    @IsCustomerRead
    @GetMapping("/customers")
    public ModelAndView findAllCustomer(){
        return new ModelAndView(
                "customers",
                "customers",
                customerDao.findAll()
        );
    }
    @IsCustomerCreate
    @GetMapping("/create-customer")
    public String createCustomer(Model model){
        model.addAttribute("customer",new Customer());
        return "customer-form";
    }
    @IsCustomerCreate
    @PostMapping("/create-customer")
    public String processCustomer(@Valid Customer customer, BindingResult result){
        if(result.hasErrors()){
            return "customer-form";
        }
        customerDao.save(customer);
        return "redirect:/customers";
    }
    @IsCustomerDelete
    @GetMapping("/customers/delete")
    public String deleteCustomer(@RequestParam("id")int id){
        customerDao.deleteById(id);
        return "redirect:/customers";
    }
}
