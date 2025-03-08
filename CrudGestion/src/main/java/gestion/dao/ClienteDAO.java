/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestion.dao;
import gestion.entity.Cliente;
import java.util.List;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Elias
 */
public interface ClienteDAO {
    
    public List<Cliente> getClientes();
    public void insertarCliente(Cliente cliente);
    
    public Cliente getCliente(Integer id);

    public void actualizar(Cliente model);

    public void eliminar(Cliente clId);
    

    
}
