package org.softcits.pc.mgt.common;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class SoftcitsJsonUtil {

	public static final ObjectMapper MAPPER = new ObjectMapper();
	
	//������ת��ΪJSON
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
}
