/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.dao;

/**
 *
 * @author rico.fauchard
 */

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;

public interface DAO {
	public List<HashMap> findAll(String table);
        public ResultSet findByid(String table,int id);
}
