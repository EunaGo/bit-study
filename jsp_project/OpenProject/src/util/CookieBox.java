package util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieBox {

	// Cookie 紐⑸줉�쓣 Map�뿉 ���옣�빐�꽌 愿�由�
	private Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();

	public CookieBox(HttpServletRequest request) {

		Cookie[] cookies = request.getCookies();

		// 荑좏궎 �뜲�씠�꽣瑜� Map�뿉 紐⑤몢 ���옣
		for (int i = 0; i < cookies.length; i++) {

			// Map �뜲�씠�꽣 ���옣
			cookieMap.put(cookies[i].getName(), cookies[i]);
		}
	}

	public Cookie getCookie(String name) {

		return cookieMap.get(name);
	}

	public String getValue(String name) {

		String result = null;

		// 荑좏궎�뿬遺� �솗�씤
		Cookie cookie = getCookie(name);

		// 荑좏궎媛� 議댁옱�븳�떎硫�
		if (cookie != null) {
			result = cookie.getValue();
		}

		// return�� �븯�굹濡� �궗�슜�븯�뒗 寃껋씠 醫뗭쓬
		return result;
	}

	public boolean exist(String name) {
		return cookieMap.get(name) != null;
	}

	// 荑좏궎 媛앹껜 �깮�꽦 硫붿꽌�뱶(static)
	public static Cookie createCookie(String name, String value) {
		return new Cookie(name, value);
	}

	public static Cookie createCookie(String name, String value, String path, int maxAge) {

		Cookie cookie = new Cookie(name, value);
		// 경로 설정
		cookie.setPath(path);

		// maxAge 설정
		cookie.setMaxAge(maxAge);

		return cookie;
	}

	public static Cookie createCookie(String name, String value, String domain, String path, int maxAge) {

		Cookie cookie = new Cookie(name, value);

		// 도메인 설정
		cookie.setDomain(domain);

		// 경로 설정
		cookie.setPath(path);

		// maxAge 설정
		cookie.setMaxAge(maxAge);

		return cookie;
	}
	

}
