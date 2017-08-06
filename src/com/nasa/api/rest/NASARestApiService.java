package com.nasa.api.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;

public class NASARestApiService {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		HttpClient client = new DefaultHttpClient();
		String baseUrl = "https://api.nasa.gov/planetary/sounds";
		String reqString = "";
		try {
			//Building URL for service..
			URIBuilder url = new URIBuilder(baseUrl);
			url.addParameter("q", "asdasdsafggfh");
			url.addParameter("api_key", "UnPPJLAzy0eRpm5xV6UrMvTIs6yYB4AvCvV50R5X");
			url.addParameter("limit", "5");
			// 
			reqString = url.build().toString();
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		HttpGet req = new HttpGet(reqString);
		try {

			HttpResponse res = client.execute(req);
			BufferedReader rd = new BufferedReader(new InputStreamReader(res.getEntity().getContent()));
			String line = "";
			while ((line = rd.readLine()) != null) {
				System.out.println(line);
			}
			Header headerRemaining = res.getHeaders("X-RateLimit-Remaining")[0];
			Header headerLimit = res.getHeaders("X-RateLimit-Limit")[0];
			System.out.println(headerLimit.getName() + "-----" + headerLimit.getValue());
			System.out.println(headerRemaining.getName() + "-------" + headerRemaining.getValue());
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
