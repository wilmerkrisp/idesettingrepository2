#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
 



#parse("File Header.java")


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.stereotype.Repository;
 
import io.r2dbc.spi.ConnectionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;
 
 

#set( $regex = "([A-Z]{1}[a-z]+)(RepositoryTest)")
#set( $replacement1 = "$1")
#set( $part1a = $NAME.replaceAll($regex, $replacement1) )
#set( $part1b = $part1a.toLowerCase() )


@RunWith( SpringRunner.class )
@SpringBootTest( classes = Application.class )
public class ${NAME} 
  {
	@Autowired private ${part1a}Repository ${part1b}Repository;
	
	@Autowired ConnectionFactory connectionFactory;
	
	/**
	 * Context loads.
	 */
	@Test
	public void repositoryTest()
		{
		var client = DatabaseClient.create( connectionFactory );
		client.execute( "CREATE TABLE RESERVATION (id INTEGER IDENTITY PRIMARY KEY, name VARCHAR(255))" )
		      .fetch()
		      .all()
		      .log()
				      .as( StepVerifier::create )
				      .expectNextCount( 1 )
				      .verifyComplete();
		
	 
		        var all = this.${part1b}Repository.findAll().log();
		        StepVerifier
		                .create(all)
		                .expectNextCount(1)
		                .verifyComplete();
		
 
		}
		
	}

