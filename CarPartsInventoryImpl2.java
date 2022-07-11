package com.MainProject;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("carParts2")
public class CarPartsInventoryImpl2 {

	@Autowired
	private DataSource dataSource;
	
	public void addNewPart(CarPart carPart) {
		Connection conn = null;
		try {
			long ms1= System.currentTimeMillis();
			conn= dataSource.getConnection();
			long ms2= System.currentTimeMillis();
			System.out.println("Approx time taken to obtain a connection"+ (ms2-ms1) + "ms");
			
			//CallableStatement st =  conn.prepareCall("{call add_carpart(?,?,?,?)}"); we can use callable for call stored procedures
			PreparedStatement st = conn.prepareStatement("insert into tbl_carpart(part_name, car_model, price, quantity) values(?, ?, ?, ?)");
			st.setString(1, carPart.getPartName());
			st.setString(2, carPart.getCarModel());
			st.setDouble(3, carPart.getPrice());
			st.setInt(4, carPart.getQuantity());
			st.executeUpdate();
			
		}catch(SQLException e) { e.printStackTrace();}
	   finally {
		   try { conn.close(); } catch(Exception e) {}
	   }
		
		
	}
}


//create procedure add_carpart(part_name_arg varchar(25),car_model_arg varchar(20),price_arg double,quantity_arg int);
