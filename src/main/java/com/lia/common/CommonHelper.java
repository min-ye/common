package com.lia.common;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.CookieStore;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BasicNameValuePair;

public class CommonHelper {
   public static Short convertToShort(String input, Short defaultValue) {
      try {
         return Short.parseShort(input);
      }
      catch (Exception ex) {
         return defaultValue;
      }
   }
   
   public static Integer convertToInteger(String input, Integer defaultValue) {
      try {
         return Integer.parseInt(input);
      }
      catch (Exception ex) {
         return defaultValue;
      }
   }
   
   public static Long convertToLong(String input, Long defaultValue) {
      try {
         return Long.parseLong(input);
      }
      catch (Exception ex) {
         return defaultValue;
      }
   }
   
   public static Float convertToFloat(String input, Float defaultValue) {
      try {
         return Float.parseFloat(input);
      }
      catch (Exception ex) {
         return defaultValue;
      }
   }
   
   public static Double convertToDouble(String input, Double defaultValue) {
      try {
         return Double.parseDouble(input);
      }
      catch (Exception ex) {
         return defaultValue;
      }
   }
   
   public static Boolean convertToBoolean(String input, Boolean defaultValue) {
      try {
         return Boolean.parseBoolean(input);
      }
      catch (Exception ex) {
         return defaultValue;
      }
   }
}
