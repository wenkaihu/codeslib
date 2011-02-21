package com.wenkaihu.java.charators.enordecode;

import java.io.UnsupportedEncodingException;

public class CharactorEncode {
	@SuppressWarnings("unused")
	private static final String UNICODE = "unicode";
	private static final int BYTELENGTH = 8;
	private static final String UTF_8 = "utf-8";

	public static void main(String[] args) {
		System.out.println(getHexFromSCC("±ÿ”¶", UTF_8));
	}

	public static String getHexFromSCC(String scc, String charset) {
		StringBuffer sb = new StringBuffer();
		try {
			byte[] a = scc.getBytes(charset);
			//int count = 0;
			for (int x = 0; x < a.length; x++) {
				String byt = Integer.toHexString(a[x]);
				if (BYTELENGTH == byt.length()) {
					byt = byt.substring(6);
				}
				sb.append(byt + " ");
				//sb.append(count++ % 2 == 0 ? "\\u" + byt : byt);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return sb.toString();
	}
}
