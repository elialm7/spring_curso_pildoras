/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.dao;

import gestion.entity.Cliente;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Elias
 */

@Repository
public class ClienteDAOImp implements ClienteDAO{

    @Transactional
    @Override
    public List<Cliente> getClientes() {
        Session miSession = this.sessionFactory.getCurrentSession();
        Query<Cliente> miQuery = miSession.createQuery("from Cliente", Cliente.class);
        List<Cliente> clientes = miQuery.getResultList(); 
        return clientes;
    }
    @Transactional
    @Override
    public void insertarCliente(Cliente cliente) {
        Session miSession = this.sessionFactory.getCurrentSession();
        miSession.save(cliente);
    }

    @Transactional
    @Override
    public Cliente getCliente(Integer id) {
          Session miSession = this.sessionFactory.getCurrentSession();
          return miSession.get(Cliente.class, id);
    }

    @Transactional
    @Override
    public void actualizar(Cliente model) {
        Session miSession = this.sessionFactory.getCurrentSession();
        miSession.update(model);
    }

    @Transactional
    @Override
    public void eliminar(Cliente clId) {
        Session miSession = this.sessionFactory.getCurrentSession();
        miSession.delete(clId);
    }
    
    
    
    
    
    @Autowired
    private SessionFactory sessionFactory;

  
    
}
