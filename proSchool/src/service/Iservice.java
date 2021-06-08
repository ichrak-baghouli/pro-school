/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public interface Iservice<T> {
    
    boolean add (T t)throws SQLException;
    boolean update (T t) throws SQLException;
    boolean delete (T t) throws SQLException;
    List<T> searchAll() throws SQLException;
    List<T> search(T t) throws SQLException;
}
