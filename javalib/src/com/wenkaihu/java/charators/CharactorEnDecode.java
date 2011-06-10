package com.wenkaihu.java.charators;

import java.io.UnsupportedEncodingException;

public class CharactorEnDecode {
	@SuppressWarnings("unused")
	private static final String UNICODE = "unicode";
	private static final int BYTELENGTH = 8;
	private static final String UTF_8 = "utf-8";

	public static void main(String[] args) {
//		System.out.println(getHexFromSCC("ø≠–˝µ∆ Œ", UTF_8));
		String stream = 
				/*"450005dc80bb40003206259c3d8784630a40d09a0050d12f1acbb089" +
				"a765e7da501028a81a590000485454502f312e3120323030204f4b0d0a53657276" +
				"65723a206e67696e782f302e372e36350d0a446174653a205475652c203236204170" +
				"7220323031312030373a34373a323720474d540d0a436f6e74656e742d547970653a" +
				"206170706c69636174696f6e2f7868746d6c2b786d6c3b20636861727365743d7574" +
				"662d380d0a5472616e736665722d456e636f64696e673a206368756e6b65640d0a43" +
				"6f6e6e656374696f6e3a20636c6f73650d0a43616368652d436f6e74726f6c3a206e" +
				"6f2d63616368650d0a0d0a6363610d0a3c3f786d6c2076657273696f6e3d22312e30" +
				"223f3e0a3c21444f43545950452068746d6c205055424c494320222d2f2f4f50454e" +
				"574156452f2f445444205848544d4c204d6f62696c6520312e302f2f454e220a2268" +
				"7474703a2f2f7777772e6f70656e776176652e636f6d2f6474642f7868746d6c2d6d" +
				"6f62696c6531302e647464223e0a3c68746d6c20786d6c6e733d22687474703a2f2f" +
				"7777772e77332e6f72672f313939392f7868746d6c223e0a3c6d6574612068747470" +
				"2d65717569763d22436f6e74656e742d547970652220636f6e74656e743d22746578" +
				"742f7868746d6c3b20636861727365743d7574662d3822202f3e0a3c6c696e6b2069" +
				"643d226d61696c5f6d61696e5f6373732220687265663d22687474703a2f2f6a732e" +
				"6d61696c2e736f68752e636f6d2f7765626170702f7761702f6d61696c2e63737322" +
				"2072656c3d227374796c6573686565742220747970653d22746578742f637373222f" +
				"3e0a3c686561643e0a3c7469746c653e" +*/
				// À—∫¸…¡µÁ” œ‰ ÷ª˙∞Ê
				//"e6909ce78b90e997aae794b5e982aee7aeb1e6898be69cbae78988" +
				/*"3c2f7469746c653e0a3c6d6574612069643d2276696577706f" +
				"727422206e616d653d2276696577706f72742220636f6e74656e743d227769647468" +
				"3d3332303b20696e697469616c2d7363616c653d312e303b206d6178696d756d2d73" +
				"63616c653d322e303b20757365722d7363616c61626c653d312e303b22202f3e0a0a" +
				"3c2f686561643e0a3c626f64793e0a3c7461626c652077696474683d223130302522" +
				"20626f726465723d2230222063656c6c73706163696e673d2230222063656c6c7061" +
				"6464696e673d2230223e0a20203c74723e0a202020203c746420636c6173733d2274" +
				"6f70223e3c6120687265663d222322206f6e636c69636b3d226c6f636174696f6e2e" +
				"687265663d276d61696e27223e3c696d67207372633d22687474703a2f2f6a732e6d" +
				"61696c2e736f68752e636f6d2f7765626170702f7761702f696d616765732f6c6f67" +
				"6f2e67696622202f3e3c2f613e3c2f74643e0a20203c2f74723e0a20203c74723e0a" +
				"202020203c7464206865696768743d2232362220636c6173733d227469746c652220" +
				"616c69676e3d2263656e746572223e0a2020202077656e6b6169687540736f68752e" +
				"636f6d6d" +*/
				"e9949befbfbd" +
				//<a href="main">
				//"3c6120687265663d226d61696e223e" +
				// messy code
				//"e996adee86beee8688e6a3a3e6a0ade38089" +
				
				//"3c2f613e" +
				/*"207c203c6120687265663d22687474703a2f2f6d2e6d" +
				"61696c2e736f68752e636f6d2f6c6f676f75742e6a7370223ee996abefbfbde98d91" +
				"efbfbd3c2f613e200a202020203c2f74643e0a20203c2f74723e0a20203c74723e0a" +
				"202020203c74643e3c7461626c652077696474683d22313030252220626f72646572" +
				"3d22302220616c69676e3d2263656e746572222063656c6c70616464696e673d2234" +
				"222063656c6c73706163696e673d2230223e0a2020202009203c74723e3c74642062" +
				"67636f6c6f723d2223663866386638223e3c623ee7bbafe88da4e7b2bae98f82e59b" +
				"a6e6aca2e6beb6efbfbd3c2f623e3c2f74643e3c2f74723e0a2020202009203c7472" +
				"3e3c746420636c6173733d2267726579223e3c7461626c652077696474683d223939" +
				"252220626f726465723d22302220616c69676e3d2263656e746572222063656c6c70" +
				"616464696e673d2230222063656c6c73706163696e673d2234223e0a090a09092020" +
				*/
				"2323232323"+
				"20203c74723e3c74643e3c";
		System.out.println(getSCCFromHex(stream, "utf-8", null));
	}

	public static String getSCCFromHex(String hex, String charset, String separator){
		String [] chars;
		if (null == separator){
//			hex.replaceAll(" ", "");
			chars = new String[(hex.length() + 1) / 2];
			int c=0;
	        for (int i=0; i< hex.length(); i++){
	        	if (i % 2 == 1){
	        		//System.out.println(stream.substring(i - 1, i + 1));
	        		chars[c++] = hex.substring(i - 1, i + 1);
	        	}
	        }
		}else{
			chars = hex.split(separator);
		}
		
		byte[] codes = new byte[chars.length];
		int j=0;
		for (int i = 0; i < chars.length; i++){
			if (!chars[i].equals("")){
				codes[j++] = (byte) Integer.parseInt(chars[i], 16);
			}
		}
		try {
//			System.out.println("###" + new String(codes, 0, j, "utf-8"));
			return new String(codes, 0, j, charset);
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		return null;
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
