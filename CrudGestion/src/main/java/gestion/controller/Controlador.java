/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.controller;

import gestion.dao.ClienteDAO;
import gestion.dao.ClienteDAOImp;
import gestion.entity.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Elias
 */
@Controller
@RequestMapping("/cliente")
public class Controlador {
    
    
    @RequestMapping("/lista")
    public String listaClientes(Model elModelo){
        List<Cliente> losClientes = clienteDao.getClientes();
        elModelo.addAttribute("clientes", losClientes);
        return "lista-clientes";
    }
    
    @RequestMapping("/muestraFormularioAgregar")
    public String muestraFormularioAgregar(Model model){
        Cliente nuevoCliente = new Cliente();
        model.addAttribute("nuevoCliente", nuevoCliente);
        return "formulario-cliente-agregar";
    }
    
    
    @PostMapping("/insertarCliente")
    public String insertarNuevoCliente(@ModelAttribute("nuevoCliente") Cliente model){
        
        //insertar cliente en la base de datos
        clienteDao.insertarCliente(model);
        return "redirect:/cliente/lista";
    }
    
    @GetMapping("/muestraFormularioActualizar")
    public String MuestramodifcarCliente(@RequestParam("clienteId")Integer id, Model model){
        Cliente cliente = clienteDao.getCliente(id);
        model.addAttribute("clienteActualizar", cliente);
        return "formulario-cliente-modificar";
    }
    
    @PostMapping("/actualizarCliente")
    public String actualizaCliente(@ModelAttribute("clienteActualizar") Cliente model){
        clienteDao.actualizar(model);
        return "redirect:/cliente/lista";
    }
    
    @GetMapping("eliminarCliente")
    public String eliminarcliente(@RequestParam("clienteId") Integer id){
        Cliente clId = new Cliente();
        clId.setId(id);
        clienteDao.eliminar(clId);
        return "redirect:/cliente/lista";
    }
    
    @Autowired
    private ClienteDAO clienteDao;
    
}
