package com.gxa.controller;

import com.gxa.entity.Emp;
import com.gxa.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/emps")
    public String list(ModelMap map){
        List<Emp> emps = this.empService.queryAll();
        map.addAttribute("emps",emps);
        System.out.println(emps);

        return "emp/list";
        //WEB-INF/jsp/emp/list.jsp
    }
}
