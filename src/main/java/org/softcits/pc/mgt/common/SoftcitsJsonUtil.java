package org.softcits.pc.mgt.common;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class SoftcitsJsonUtil {

	public static final ObjectMapper MAPPER = new ObjectMapper();
	
	//将对象转化为JSON
	public static String objectToJson(Object data) {
		try {
			String string = MAPPER.writeValueAsString(data);
			return string;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
    /**
     * 将json结果集转化为对象
     * 
     * @param jsonData json数据
     * @param clazz 对象中的object类型
     * @return
     */
    public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
        try {
            T t = MAPPER.readValue(jsonData, beanType);
            return t;
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
}
