package com.lia.common;

import java.util.List;
import java.util.Map;

public abstract class CommonObject {
   public abstract String fetchObjectName();
   
   public abstract String getPropertyValue(String propertyName) throws Exception;
   
   public abstract void setValue(String propertyName, String propertyValue) throws Exception;
   
   public abstract void importModel(Map<String, Object> item) throws Exception;
   
   public abstract Map<String, String> exportPropertyMap();
   
   public abstract Map<String, String> exportKeyPropertyMap();
   
   public abstract Map<String, String> exportValueFieldMap();
   
   public abstract List<String> fetchPropertyName();
   
   public abstract Object[] fetchObject();
   
   protected String getPropertyValueString(String value) {
      return String.format("'%s'", value);
   }
   
   protected String getPropertyValueString(int value) {
      return String.format("%d", value);
   }
   
   protected String getPropertyValueString(double value) {
      return String.format("%d", value);
   }
}
