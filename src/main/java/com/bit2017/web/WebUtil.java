package com.bit2017.web;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class WebUtil {

	public static String encodeURL( String url, String encode ){
		String urlEncode = null;
		try {
			urlEncode = URLEncoder.encode( url, encode );
		} catch ( UnsupportedEncodingException ex ) {
			throw new RuntimeException( ex );
		}
		
		return urlEncode;
	}

}
