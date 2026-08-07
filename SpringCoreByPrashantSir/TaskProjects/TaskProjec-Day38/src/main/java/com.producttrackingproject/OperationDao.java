package com.producttrackingproject;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("operation")
public class OperationDao {

	@Autowired
	private JdbcTemplate template;

	// ================= SELECT =================

	private static final String SQL_QUERY_FOR_GETPRODUCTPRICE = "SELECT price FROM ProductDetail WHERE productName = ?";

	private static final String SQL_QUERY_FOR_GETALLPRODUCT = "SELECT * FROM ProductDetail";

	// ================= INSERT =================

	private static final String SQL_QUERY_FOR_INSERTPRODUCT = "INSERT INTO ProductDetail(productName, shippingAdd, price, quantity, placeDate) VALUES(?,?,?,?,?)";

	// ================= DELETE =================

	private static final String SQL_QUERY_FOR_DELETEPRODUCT = "DELETE FROM ProductDetail WHERE productName=?";

	// ================= UPDATE =================

	private static final String SQL_QUERY_FOR_UPDATEPRODUCT = "UPDATE ProductDetail SET shippingAdd=?, placeDate=? WHERE productName=?";


	public Float getProductPrice(String productName) {

		return template.queryForObject(SQL_QUERY_FOR_GETPRODUCTPRICE, Float.class, productName);

	}


	public List<ProductDelivery> getAllProduct() {

		return template.query(SQL_QUERY_FOR_GETALLPRODUCT,

				(rs, rowNum) -> {

					ProductDelivery delivery = new ProductDelivery();

					delivery.setProductName(rs.getString("productName"));
					delivery.setProductShippingAddress(rs.getString("shippingAdd"));
					delivery.setProductPrice(rs.getFloat("price"));
					delivery.setProductQuantity(rs.getInt("quantity"));
					delivery.setProductPlaceDate(rs.getDate("placeDate"));

					return delivery;
				});

	}


	public int insertProduct(ProductDelivery delivery) {

		return template.update(

				SQL_QUERY_FOR_INSERTPRODUCT,

				delivery.getProductName(), delivery.getProductShippingAddress(), delivery.getProductPrice(),
				delivery.getProductQuantity(), delivery.getProductPlaceDate());

	}


	public int deleteProduct(String productName) {

		return template.update(SQL_QUERY_FOR_DELETEPRODUCT, productName);

	}


	public int updateProduct(String address, LocalDate date, String productName) {

		return template.update(

				SQL_QUERY_FOR_UPDATEPRODUCT,

				address, java.sql.Date.valueOf(date), productName);

	}

}
