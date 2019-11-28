#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
 



#parse("File Header.java")


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.NoRepositoryBean;

 


#set( $regex = "([A-Z]{1}[a-z]+)(Repository)")
#set( $replacement1 = "$1")
#set( $part1a = $NAME.replaceAll($regex, $replacement1) )
#set( $part1b = $part1a.toLowerCase() )

@NoRepositoryBean
public interface ${NAME}  extends ReactiveCrudRepository<${part1a},${ID}>
  {
    
  }
