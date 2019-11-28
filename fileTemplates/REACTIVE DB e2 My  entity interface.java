#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

 


#parse("File Header.java")

 

/** <pre>                            
*   interface simple
*   !CHANGE_ME_DESCRIPTION!
*

*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft


#parse("iclassforinheritance.java") 


* {@code
*
*
* example 1  
*  
*              VC_somesubclass                  implements ${NAME}
*              VI_somesubinterface              extends    ${NAME}    
*              VCG_somesubclass< T >        implements ${NAME}
*              VIG_somesubinterface< T >    extends    ${NAME}
*
*          
*
* }</pre>
*/                                                                                                   
public interface ${NAME}  extends Entity<${ID}>
    {   
     
    //any methods
   
    
    }
