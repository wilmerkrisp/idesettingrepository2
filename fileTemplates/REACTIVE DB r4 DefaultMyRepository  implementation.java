#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#parse("File Header.java")

import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import lombok.NonNull;//@NOTNULL

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


#set( $regex = "([A-Z]{1}[a-z]+)(Repository)")
#set( $replacement1 = "$1")
#set( $part1a = $NAME.replaceAll($regex, $replacement1) )
#set( $part1b = $part1a.toLowerCase() )

/**please name it DefaultEmployeeRepository */

@Repository
public interface ${NAME} 
    extends ReactiveCrudRepository<$part1a,${ID_TYPE}>
	{
	
	/*
	@Query( "select * from DEFAULT_EMPLOYEE where name = :name" )
	Flux<Employee> findByName( String name );
		
	@Query( "INSERT INTO DEFAULT_EMPLOYEE (ID, NAME) VALUES(:id, :name )" )
	Mono<Long> create( String id ,
	                   String name );
	                   */
		
	}

 