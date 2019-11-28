#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

 


#parse("File Header.java")

 
                                                                                            
/**
 * Base abstract class for aggregate (DDD pattern)
 *
 * @param <ID>
 * 	the type of entity ID
 */

public interface ${NAME}<ID>
	{
	
	ID getId();
	
	//void setId(T id);
	
	String getName();
	
	//void setName(String name);
	
	}
