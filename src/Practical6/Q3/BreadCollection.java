/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical6.Q3;

/**
 *
 * @author elliott
 */
public class BreadCollection {
	// (part a)

	public final static String[] BREADTYPE = {
			"Plain", "Wholemeal", "Raisin",
			"Banana", "Corn" };
	// (part b)
	public final static int PLAIN = 0;
	public final static int WHOLEMEAL = 1;
	public final static int RAISIN = 2;
	public final static int BANANA = 3;
	public final static int CORN = 4;
	private double costOfFlour;
	private Bread[] breads;

	public BreadCollection()/* missing code */ {
		this.breads = new Bread[5];
		this.breads[0] = new Bread(BREADTYPE[PLAIN]);
		this.breads[1] = new Bread(BREADTYPE[WHOLEMEAL]);
		this.breads[2] = new Bread(BREADTYPE[RAISIN]);
		this.breads[3] = new Bread(BREADTYPE[BANANA]);
		this.breads[4] = new Bread(BREADTYPE[CORN]);
	}

	public void initAmountOfFlour() {
		this.breads[PLAIN].setAmtOfFlour(500);
		this.breads[WHOLEMEAL].setAmtOfFlour(600);
		this.breads[RAISIN].setAmtOfFlour(300);
		this.breads[BANANA].setAmtOfFlour(400);
		this.breads[CORN].setAmtOfFlour(600);
	}

	public int getNumOfBreads() {
		return this.breads.length;
	}

	public Bread getBread(int bread) {
		return this.breads[bread];
	}

	public double getCostOfFlour() {
		return this.costOfFlour;
	}

	public void setCostOfFlour(double cost) {
		this.costOfFlour = cost;
	}

}
