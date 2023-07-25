package com.day2.dl.basics;

public class Eg5 {

	public static void main(String[] args) {

		// MIN
		byte bMIN = Byte.MIN_VALUE;
		short sMIN = Short.MIN_VALUE;
		int iMIN = Integer.MIN_VALUE;
		long lMIN = Long.MIN_VALUE;
		float fMIN = Float.MIN_VALUE;
		double dMIN = Double.MIN_VALUE;
		char chMIN = Character.MIN_VALUE;

		// MAX
		byte bMAX = Byte.MAX_VALUE;
		short sMAX = Short.MAX_VALUE;
		int iMAX = Integer.MAX_VALUE;
		long lMAX = Long.MAX_VALUE;
		float fMAX = Float.MAX_VALUE;
		double dMAX = Double.MAX_VALUE;
		char chMAX = Character.MAX_VALUE;

		// SIZE
		byte bSIZE = Byte.SIZE;
		short sSIZE = Short.SIZE;
		int iSIZE = Integer.SIZE;
		long lSIZE = Long.SIZE;
		float fSIZE = Float.SIZE;
		double dSIZE = Double.SIZE;
		int chSIZE = Character.SIZE;

		// BYTE
		byte bBYTE = Byte.BYTES;
		short sBYTE = Short.BYTES;
		int iBYTE = Integer.BYTES;
		long lBYTE = Long.BYTES;
		float fBYTE = Float.BYTES;
		double dBYTE = Double.BYTES;
		int chBYTE = Character.BYTES;

		System.out.println("MIN : MAX : SIZE : BYTE");

		System.out.println(bMIN + " : " + bMAX + ":" + bSIZE + ":" + bBYTE);
		System.out.println(sMIN + " : " + sMAX + " : " + sSIZE + " : " + sBYTE);
		System.out.println(iMIN + " : " + iMAX + " : " + iSIZE + " : " + iBYTE);
		System.out.println(lMIN + " : " + lMAX + " : " + lSIZE + " : " + lBYTE);
		System.out.println(fMIN + " : " + fMAX + " : " + fSIZE + " : " + fBYTE);
		System.out.println(dMIN + " : " + dMAX + " : " + dSIZE + " : " + dBYTE);
		System.out.println(chMIN + " : " + chMAX + " : " + chSIZE + " : " + chBYTE);

	}

}
