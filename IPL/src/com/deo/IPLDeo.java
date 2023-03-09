package com.deo;

import java.sql.SQLException;
import java.util.List;

import com.deo.impl.IPLDeoImpl;
import com.entity.IPL;

public interface IPLDeo {
	public List<IPL>findAll() throws ClassNotFoundException, SQLException;
	public void insertIPL(IPL i) throws ClassNotFoundException, SQLException;
	public void updateIPL(IPL i) throws ClassNotFoundException, SQLException;
	public void deleteIPL(IPL i) throws ClassNotFoundException, SQLException;

	}
