/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical6.Q2;

import java.io.*;

/**
 *
 * @author elliott
 */
public class ProductManager {

	public static void saveProduct(Product pdt) {
		File f = new File("src/Practical6/Q2/product.dat");
		try {
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(pdt);
			os.close();
			fos.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static Product loadProduct(String filename) {
		Product product = null;
		try {
			FileInputStream fileIn = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			product = (Product) in.readObject();
			in.close();
			fileIn.close();
			return product;
		} catch (IOException e) {
			return null;
		} catch (ClassNotFoundException ex) {
			return null;
		}
	}

	public static void main(String[] args) {
		Product myProduct = new Product("004", 199);
		ProductManager.saveProduct(myProduct);
		Product p = ProductManager.loadProduct("src/Practical6/Q2/product.dat");
		if (p != null) {
			System.out.println("Code:\t" + p.getCode());
			System.out.println("Price:\t" + p.getPrice());
		}
	}
}
