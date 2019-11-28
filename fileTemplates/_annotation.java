#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import java.lang.annotation.*;
 

#parse("File Header.java")



/**  <pre>                           
*   annotation  
*   !CHANGE_ME_DESCRIPTION! 


*
* {@code
*
*
* example 1
*               
*               @${NAME} (one="stroka1",two="stroka2")
*               @${NAME}                        //marker annotation, withowt arrguments   
*               @${NAME} ("stroka3")             //monomial annotation, 1 argument value
*
*
*
* example 2
*               
*               hashCode ( ) , equals ( ) , toString ( ) ,  annotationType ( )
*
*
* example 4     
*          
*        validate all annotations inside class
*        for( Method v_m : this.getClass( ).getDeclaredMethods( ) )
*			for( Annotation v_a : v_m.getAnnotations( ) )
*				log_.debug( "VV_class f_method: "+v_m+" annotation: " + v_a.toString() );
*
*
*   

 
*
*
*
*
*
* }</pre>

*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft
*/
@Inherited /*all subclasses inherit this annotation*/
@Target( { ElementType.ANNOTATION_TYPE, ElementType .CONSTRUCTOR, ElementType .FIELD, ElementType .LOCAL_VARIABLE, ElementType .METHOD, ElementType .PACKAGE, ElementType .PARAMETER, ElementType .TYPE, ElementType .TYPE_PARAMETER, ElementType .TYPE_USE})
@Retention( RetentionPolicy.RUNTIME /*SOURCE CLASS RUNTIME*/)
@interface ${NAME}
	{
	
    /**<pre>
    *   parameter 1
    *   !CHANGE_ME_DESCRIPTION!
    *
    * {@code                   
    *
    *
    * example 1
    *
    *           @${NAME} (one="stroka1")
    *  
    *
    *
    * }</pre>
    */  
	String one() default "stroka";
	
	/**<pre>
	*   parameter 2
	*   !CHANGE_ME_DESCRIPTION!
	* 
    * {@code                   
    *
    *
    * example 1
    *
    *          @${NAME} (one="stroka1",two="stroka2")
    *
    *     
    *
    * }</pre>
    */  
	String two() default "stroka2";
	
	
	/**<pre>
	*   parameter 3 (for monomial annotation, 1 argument value)
	*   !CHANGE_ME_DESCRIPTION!
	*
    * {@code                   
    *
    *
    * example 1
    *
    *           @${NAME} ("stroka3")  //monomial annotation, 1 argument value
    * 
    *
    * }</pre>
    */  
	String value() default "stroka3";

	}