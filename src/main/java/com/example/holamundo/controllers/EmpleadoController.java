package com.example.holamundo.controllers;

import com.example.holamundo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmpleadoController {


    final employeeRepository employeeRepository;


    public EmpleadoController(employeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping({"/",""})
    public String listaEmpleados(Model model, @RequestParam(required = false) String zona) {
        model.addAttribute("listaEmpleados", employeeRepository.findAll());

        return "empleado/lista";
    }

    @ResponseBody
    @RequestMapping(value = {"/listar2"})
    public String listar() {
        return "listar employee hr";
    }

    @ResponseBody
    @RequestMapping("/crear")
    public String crear() {
        return "crear employee hr";
    }

    @ResponseBody
    @RequestMapping("/editar")
    public String editar() {
        return "editar employee hr";
    }








}
