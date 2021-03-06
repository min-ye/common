package com.lia.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public enum JsonHelper {
   INSTANCE;
   public void writeJson(List<CommonObject> objectList,String jsonFile) throws Exception{
      JSONArray jsonList = new JSONArray(objectList);

      String output = jsonList.toString(3);
      
      FileHelper.INSTANCE.saveContent(output, jsonFile);
   }
   
   public List<Map<String, String>> readJson(String jsonFile){
      String jsonContent = FileHelper.INSTANCE.getContent(jsonFile);
      JSONArray jsonList = new JSONArray(jsonContent);
      List<Map<String, String>> output = new ArrayList<Map<String, String>>();
      for (int index = 0; index < jsonList.length(); index++) {
         JSONObject obj = jsonList.getJSONObject(index);
         String[] nameArray = JSONObject.getNames(obj);
         Map<String, String> item = new HashMap<String, String>();
         for (String name : nameArray){
            item.put(name, obj.get(name).toString());
         }
         output.add(item);         
      }
      return output;
   }
}
