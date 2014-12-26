/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.query;

import com.python.dao.CustomerDAO;
import com.python.model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akhmad Fariiqun
 */
public class CustomerQuery implements CustomerDAO{
    private Connection conn=null;
    public CustomerQuery(Connection conn){
        this.conn=conn;
    }
    

    @Override
    public void simpanCustomer(Customer customer) {
        
        String sql = "INSERT INTO customer(ID_CUS,ID_KOTA,NAMA_CUS,ALAMAT_CUS,TLP_CUS) VALUES(?,?,?,?,?)";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
            
        st.setString(1, customer.getIdCustomer());
        st.setString(2, customer.getIdKota());
        st.setString(3, customer.getNamaCustomer());
        st.setString(4, customer.getAlamatCustomer());
        st.setString(5, customer.getTlpCustomer());
        st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex+customer.getIdCustomer());
            System.out.println();
        }
    }

    @Override
    public void deleteCustomer(String idCustomer) {
        String sql = "DELETE FROM customer WHERE ID_CUS=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idCustomer);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public void updateCustomer(String idCustomer, Customer customer) {
        String sql = "UPDATE customer SET NAMA_CUS=?,ALAMAT_CUS=?,TLP_CUS=?,ID_KOTA=? WHERE ID_CUS=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, customer.getNamaCustomer());
        st.setString(2, customer.getAlamatCustomer());
        st.setString(3, customer.getTlpCustomer());
        st.setString(4, customer.getIdKota());
        st.setString(5, customer.getIdCustomer());
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    @Override
    public Customer load(String idCustomer) {
        Customer customer = null;
        String sql = "SELECT * FROM customer WHERE ID_CUS=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idCustomer);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
        customer = new Customer();
        customer.setIdCustomer(rs.getString(1));
        customer.setIdKota(rs.getString(2));
        customer.setNamaCustomer(rs.getString(3));
        customer.setAlamatCustomer(rs.getString(4));
        customer.setTlpCustomer(rs.getString(5));
      
        }
        } catch (SQLException ex) {
        Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customer;
    }

    @Override
    public List<Customer> getAll() {
        String sql = "SELECT * FROM customer";
        List<Customer> list = new ArrayList<Customer>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setIdCustomer(rs.getString(1));
                customer.setIdKota(rs.getString(2));
                 customer.setNamaCustomer(rs.getString(3));
                customer.setAlamatCustomer(rs.getString(4));
                customer.setTlpCustomer(rs.getString(5));
                list.add(customer);
            }
        } catch (SQLException ex) {
        Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    
}
