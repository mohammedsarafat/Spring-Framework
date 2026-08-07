package com.producttrackingproject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

public class Main {

	public static void main(String[] args) {

		System.out.println("Container started");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OperationConfig.class);

		OperationDao operation = context.getBean("operation", OperationDao.class);

		Scanner sc = new Scanner(System.in);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		while (true) {

			System.out.println("\n===============================");
			System.out.println("      PRODUCT TRACKING");
			System.out.println("===============================");
			System.out.println("1. Get Product Price");
			System.out.println("2. Display All Products");
			System.out.println("3. Add Product");
			System.out.println("4. Delete Product");
			System.out.println("5. Update Product");
			System.out.println("6. Count Product By Name");
			System.out.println("7. Group Products By Address");
			System.out.println("8. Exit");
			System.out.println("===============================");

			System.out.print("Enter your choice : ");

			int choice;

			try {
				choice = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Invalid Input!");
				continue;
			}

			switch (choice) {

			case 1:

				try {

					System.out.print("Enter Product Name : ");
					String productName = sc.nextLine();

					Float price = operation.getProductPrice(productName);

					System.out.println("Product Price : Rs. " + price);

				} catch (EmptyResultDataAccessException e) {

					System.out.println("No Product Found!");

				}

				break;

			case 2:

				List<ProductDelivery> products = operation.getAllProduct();

				if (products.isEmpty()) {

					System.out.println("No Product Available.");

				} else {

					products.forEach(System.out::println);

				}

				break;

			case 3:

				try {

					ProductDelivery delivery = new ProductDelivery();

					System.out.print("Enter Product Name : ");
					delivery.setProductName(sc.nextLine());

					System.out.print("Enter Shipping Address : ");
					delivery.setProductShippingAddress(sc.nextLine());

					System.out.print("Enter Product Price : ");
					delivery.setProductPrice(Float.parseFloat(sc.nextLine()));

					System.out.print("Enter Quantity : ");
					delivery.setProductQuantity(Integer.parseInt(sc.nextLine()));

					System.out.print("Enter Place Date (dd-MM-yyyy): ");

					LocalDate date = LocalDate.parse(sc.nextLine(), formatter);

					delivery.setProductPlaceDate(java.sql.Date.valueOf(date));

					int result = operation.insertProduct(delivery);

					if (result > 0) {

						System.out.println("Product Added Successfully.");

					} else {

						System.out.println("Insertion Failed.");

					}

				} catch (Exception e) {

					System.out.println("Invalid Input!");

				}

				break;

			case 4:

				System.out.print("Enter Product Name : ");

				String deleteProduct = sc.nextLine();

				int delete = operation.deleteProduct(deleteProduct);

				if (delete > 0) {

					System.out.println("Product Deleted Successfully.");

				} else {

					System.out.println("Product Not Found.");

				}

				break;

			case 5:

				try {

					System.out.print("Enter Product Name : ");
					String updateName = sc.nextLine();

					System.out.print("Enter New Shipping Address : ");
					String address = sc.nextLine();

					System.out.print("Enter Updated Date (dd-MM-yyyy): ");

					LocalDate date = LocalDate.parse(sc.nextLine(), formatter);

					int update = operation.updateProduct(address, date, updateName);

					if (update > 0) {

						System.out.println("Product Updated Successfully.");

					} else {

						System.out.println("Product Not Found.");

					}

				} catch (Exception e) {

					System.out.println("Invalid Input!");

				}

				break;

			case 6:

				System.out.print("Enter Product Name : ");

				String findName = sc.nextLine();

				long count = operation.getAllProduct().stream()
						.filter(p -> p.getProductName().equalsIgnoreCase(findName)).count();

				System.out.println("Total Product Count : " + count);

				break;

			case 7:

				operation.getAllProduct().stream()
						.collect(java.util.stream.Collectors.groupingBy(ProductDelivery::getProductShippingAddress))
						.forEach((address, list) -> {

							System.out.println("\nShipping Address : " + address);

							list.forEach(System.out::println);

						});

				break;

			case 8:

				System.out.println("Application Closed.");

				sc.close();

				context.close();

				System.exit(0);

				break;

			default:

				System.out.println("Invalid Choice!");

			}

		}

	}

}
