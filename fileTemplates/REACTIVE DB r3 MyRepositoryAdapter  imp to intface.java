#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#parse("File Header.java")

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import lombok.NonNull;//@NOTNULL

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


#set( $regex = "([A-Z]{1}[a-z]+)(RepositoryAdapter)")
#set( $replacement1 = "$1")
#set( $part1a = $NAME.replaceAll($regex, $replacement1) )
#set( $part1b = $part1a.toLowerCase() )

/**<pre>please name it EmployeeRepositoryAdapter  

* Preconditions: 	none
* Postconditions:	none
* Side effects:		none
* Tread safety:		Not thread-safe
</pre>
*/

@SuppressWarnings("unchecked")
@Repository("${part1b}Repository")
public  class ${NAME}  /*not final because spring testing cannot inherit proxy*/
    extends ForwardingReactiveCrudRepository<$part1a,${ID_TYPE}>
	implements ${part1a}Repository
	{
	
	private final ReactiveCrudRepository<? extends ${part1a},${ID_TYPE} > delegate; // backing list
	
	@Override
	protected ReactiveCrudRepository<? extends ${part1a},${ID_TYPE} > delegate()
		{
		return delegate;
		}

	private ${NAME}()
		{
		super();
		
		#parse("throwdontuse")
		
		}
		
	@Autowired
	public ${NAME}(@NonNull @Lazy ReactiveCrudRepository<? extends ${part1a},${ID_TYPE} > backingRepository )
		{
		this.delegate = backingRepository;
		}
	
		
	}

 