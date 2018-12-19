package com.dedao.web;

import com.dedao.domain.Account;
import com.dedao.service.IAccountService;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * author:admin
 * Date:2018/12/19
 * Time:9:50
 */
@Controller
@RequestMapping("/accountController")
public class AccountController {
    @Autowired
    private IAccountService service;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Account> accounts = service.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("accounts",accounts);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/findAccountById")
    public ModelAndView findAccountById(Integer id){
        Account account = service.findAccountById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("account",account);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        service.saveAccount(account);
        return "success";
    }

    @RequestMapping("/deleteAccount")
    public String deleteAccount(Integer id){
        service.deleteAccount(id);
        return "success";
    }

    @RequestMapping("/updateAccount")
    public String updateAccount(@Param("id") Integer id,@Param("money") Double money){
        System.out.println(id);
        System.out.println(money);
        service.updateAccount(id,money);
        return "success";
    }
}
