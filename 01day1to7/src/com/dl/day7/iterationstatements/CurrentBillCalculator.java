package com.dl.day7.iterationstatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CurrentBillCalculator {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// default values
		double allTubeLishtsCost = 0;
		double allBulbsCost = 0;
		double allFansCost = 0;
		double allWashingMachinensCost = 0;
		double allCookersCost = 0;
		double allGraindersCost = 0;
		double allTVsCost = 0;
		double allMixersCost = 0;
		double allACsCost = 0;
		double allCoolersCost = 0;
		double allMotersCost = 0;
		double allInvertorsCost = 0;
		double unitcost = 0;
		double totalUnitsused = 0;
		double monthlycurrentBill = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Which state your belongs to ?");
		String state = br.readLine();

		System.out.println("How many TUBE-LIGHTs you wanna use ?");
		int tbl = Integer.parseInt(br.readLine());

		System.out.println("How many BULBs you wanna use ?");
		int bulbs = Integer.parseInt(br.readLine());

		System.out.println("How many FANs you wanna use ?");
		int fans = Integer.parseInt(br.readLine());

		System.out.println("How many WASHING-MACHINEs you wanna use ?");
		int wm = Integer.parseInt(br.readLine());

		System.out.println("How many COOKERs you wanna use ?");
		int cookers = Integer.parseInt(br.readLine());

		System.out.println("How many GRINDERs you wanna use ?");
		int grainders = Integer.parseInt(br.readLine());

		System.out.println("How many TVs you wanna use ?");
		int tvs = Integer.parseInt(br.readLine());

		System.out.println("How many MIXERs you wanna use ?");
		int mixers = Integer.parseInt(br.readLine());

		System.out.println("How many ACs you wanna use ?");
		int acs = Integer.parseInt(br.readLine());

		System.out.println("How many COOLERs you wanna use ?");
		int coolers = Integer.parseInt(br.readLine());

		System.out.println("How many WATER-MOTERs you wanna use ?");
		int moters = Integer.parseInt(br.readLine());

		System.out.println("How many INVERTORs you wanna use ?");
		int invertors = Integer.parseInt(br.readLine());

		// --- get the unit charge for a state
		if (state == "TS") {
			unitcost = 6.60;
		} else if (state == "AP") {
			unitcost = 6.90;
		} else {
			unitcost = 7.10;
		}

		// --- find the monthly current bill
		if (tbl > 0) {
			allTubeLishtsCost = tbl * 2.9;
		}
		if (bulbs > 0) {
			allBulbsCost = bulbs * 3.4;
		}
		if (fans > 0) {
			allFansCost = fans * 5.20;
		}
		if (wm > 0) {
			allWashingMachinensCost = wm * 7.00;
		}
		if (cookers > 0) {
			allCookersCost = cookers * 6.05;
		}
		if (grainders > 0) {
			allGraindersCost = grainders * 4.08;
		}
		if (tvs > 0) {
			allTVsCost = tvs * 10.6;
		}
		if (mixers > 0) {
			allMixersCost = mixers * 6.05;
		}
		if (acs > 0) {
			allACsCost = acs * 12.03;
		}
		if (coolers > 0) {
			allCoolersCost = coolers * 4.06;
		}
		if (moters > 0) {
			allMotersCost = moters * 8.56;
		}
		if (invertors > 0) {
			allInvertorsCost = invertors * 9.23;
		}
		
		totalUnitsused = (allTubeLishtsCost + allBulbsCost + allFansCost + allWashingMachinensCost + allCookersCost
				+ allGraindersCost + allTVsCost + allMixersCost + allACsCost + allCoolersCost + allMotersCost
				+ allInvertorsCost);
		monthlycurrentBill = totalUnitsused * unitcost;

		System.out.println("Expected monthly current bill will be: " + monthlycurrentBill + "rupees only");
	}

}
