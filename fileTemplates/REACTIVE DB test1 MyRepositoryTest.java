#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
 



#parse("File Header.java")


import io.r2dbc.spi.ConnectionFactory;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest;
import org.springframework.data.annotation.Id;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import static life.expert.common.async.LogUtils.*;        //logAtInfo


#set( $regex = "([A-Z]{1}[a-z]+)(RepositoryTest)")
#set( $replacement1 = "$1")
#set( $part1a = $NAME.replaceAll($regex, $replacement1) )
#set( $part1b = $part1a.toLowerCase() )



@RunWith( SpringRunner.class )
//@SpringBootTest
@DataR2dbcTest
//@ComponentScan( { "life.expert.algo.research.app", "life.expert.algo.research.repository"  } )
//@EnableR2dbcRepositories(basePackages={ "life.expert.algo.research.app", "life.expert.algo.research.domain.repository"}, repositoryBaseClass = MergeableSimpleR2dbcRepository.class )
//@TestPropertySource( properties = { "spring.r2dbc.schema=classpath:schema.sql", "spring.r2dbc.initialization-mode=always"})

// todo 1 ПОМЕСТИ ЭТОТ ТЕСТ В ТОТ ЖЕ ПАКЕТ ЧТО И @ApplicationCOntext только в тестовой иерархии
// todo 2 в тестовой иерархии не долнобыть своего application.properties
public class ${NAME} 
  {
	@Autowired private ${part1a}Repository ${part1b}Repository;
	
	@Autowired ConnectionFactory connectionFactory;
 

        @Data
		@AllArgsConstructor
		@Table
		public static class Reservation
			{
			@Id public Long id;

			public String name;
			}
		/**
		 * Context loads.
		 */
		@Test
		public void connectionFactoryTest()
			{
			print( "tst_________________1__________________" );

			var client = DatabaseClient.create( connectionFactory );
			client.execute( "CREATE TABLE RESERVATION (id IDENTITY NOT NULL PRIMARY KEY, name VARCHAR(255))" )
			      .fetch()
			      .all()
			      //.doOnEach( x -> System.out.println( "++++++++++ " + x ) )
			      .log()
			      .as( StepVerifier::create )
			      .verifyComplete();

			client.insert()
			      .into( Reservation.class )
			      .using( new Reservation( null , "NEW RESERVATION" ) )
			      .then()
			      .as( StepVerifier::create )
			      .verifyComplete();

			client.select()
			      .from( Reservation.class )
			      .fetch()
			      .all()
			      //.doOnEach( x -> System.out.println( "++++++++++ " + x ) )
			      .as( StepVerifier::create )
			      .expectNext( new Reservation( 1L , "NEW RESERVATION" ) )
			      .verifyComplete();
			}


@Test
        public void saveObjectTest()
            {
            Canvas before_and_after = new Default${part1a}( "myid" , name );
		
            Flux.just( before_and_after )
                .flatMap( r -> this.canvasRepository.save( r ) )
                .log()
                .as( StepVerifier::create )
                .expectNextCount( 1 )
                .verifyComplete();
            
            this.canvasRepository.findById( "myid" )
                                 .doOnEach( x -> System.out.println( "++ITOGO++++ " + x ) )
                                 .as( StepVerifier::create )
                                 .expectNext( before_and_after )
                                 .verifyComplete();
            }


		@Test
		public void repositoryTest()
			{
			this.${part1b}Repository.findAll()
			                       .flatMap( r -> this.${part1b}Repository.deleteById( r.getId() ) )
			                       .as( StepVerifier::create )
			                       .expectNextCount( 0 )
			                       .verifyComplete();

			Flux.just( "first" , "second" , "third" )
			    .map( name -> new Default${part1a}( name , name ) )
			    .flatMap( r -> this.${part1b}Repository.save( r ) )
			    .as( StepVerifier::create )
			    .expectNextCount( 3 )
			    .verifyComplete();

			this.${part1b}Repository.findAll()
			                       .as( StepVerifier::create )
			                       .expectNextCount( 3 )
			                       .verifyComplete();

			//${part1b}Repository.findByName( "first" )
			//                  .as( StepVerifier::create )
			//                  .expectNextCount( 1 )
			//                  .verifyComplete();
			}


        
        
		

	}


