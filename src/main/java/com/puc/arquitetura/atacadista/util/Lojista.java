package com.puc.arquitetura.atacadista.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class Lojista {
	
	private static Map<String, String> lojistaApi = new HashMap<String, String>() {{
		put("scheme", "http");
		put("host", "localhost:8090/api/v1");
		put("postOrder", "/pedido");
		put("putBudget", "/budget");
	}};

	public static String postPedido(String requestBody) throws IOException, URISyntaxException {
		String response = Curl.makeRequest(
				lojistaApi.get("scheme"),
				lojistaApi.get("host"),
				lojistaApi.get("postOrder"),
				"POST",
				requestBody);

		return response;
	}

	public static String postBudgetAcceptance(String requestBody) throws IOException, URISyntaxException {
		String response = Curl.makeRequest(
				lojistaApi.get("scheme"),
				lojistaApi.get("host"),
				lojistaApi.get("putBudget"),
				"PUT",
				requestBody);

		return response;
	}
}
