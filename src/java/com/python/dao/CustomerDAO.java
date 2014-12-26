/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.dao;

import com.python.model.Customer;
import java.util.List;

/**
 *
 * @author Akhmad Fariiqun
 */
public interface CustomerDAO {
   
    public void simpanCustomer(Customer customer);
    public void deleteCustomer(String idCustomer);
    public void updateCustomer(String idCustomer, Customer customer);
    public Customer load(String idCustomer);
    public List<Customer> getAll();
  
}