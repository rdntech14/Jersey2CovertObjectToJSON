package package1;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertObjectToJSON {

	public static void main(String[] args) {
		try {
			String[] roles = {"dev","tester"};
			POJOObject obj = new POJOObject("mike", 11, roles);

			ObjectMapper mapper = new ObjectMapper();

			//******** Object to JSON in file
			mapper.writeValue(new File("resp.json"), obj);
//			mapper.writerWithDefaultPrettyPrinter().writeValue(new File("resp.json"), obj);

			// ****** Object to JSON in String
			String jsonInString = mapper.writeValueAsString(obj);
//			String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
			System.out.println(jsonInString);
			
			
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
