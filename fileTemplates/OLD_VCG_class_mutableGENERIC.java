#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

#parse("File Header.java")

/**                             class mutable withGENERIC
* <pre>{@code
*
*
* example 1
*
*              ${NAME}<String> v_obj = new ${NAME}<>();
*              String v_string = v_obj.f_test("str");
*
*
* example 2
*
*               !NO  ${NAME}<String>[]  v_obj = new ${NAME}<>[100];
*               yes  ${NAME}<?>[]       v_obj = new ${NAME}<>[100];
*
*
* example 3 
*
*               boolean v_check = v_obj instanceof ${NAME}<?> ;
*               !no instanceof ${NAME}<String>
* 
*
* example 4
*
*               VC_somesubclass             extends ${NAME}<String>  implements VI_, VI_
*               VCG_somesubclass<g_param>   extends ${NAME}<g_param> implements VI_, VI_  
*
*
* example 5
*
*               inside method create object of g_param type, like NEW g_param(), based on the real input param type
*                   g_param v_output=(g_param) p_input.getClass( ).getDeclaredConstructor( new Class[12] ).newInstance( );
*
* example 6
*
*               inside method create object of g_param[] type, like NEW g_param[12] , based on the real input param type
*                   g_param[] v_arr = (g_param[]) java.lang.reflect.Array.newInstance( p_input.getClass().getComponentType( ), p_input.length );
*
*
*          
*
*          
* }</pre>
*/                                                  
//  extends VCG_<g_param>    implements VIG_<g_param>                              
//  extends VC_              implements VI_, VI_                                     
//  extends VCG_<String>     implements VIG_<String>                                 
//  public _package_ final
public class ${NAME}<g_param /* extends super VCG_<g_param> & VIG_<g_param>*//* extends super VC_ & VI_ *//* extends super VCG_<String> & VIG_<String> */ > 
    {
 
    #parse("fields.java")
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              variables
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         log4j debug massage
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
	*	        log.info    ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
	*	        log.warn    ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
	*	        log.error   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}:  " );
    *
    *
    * example 2
    *
    *
    *
    * }</pre>
    */  
    private static final Logger log = LogManager.getLogger( ${NAME}.class );

    /**                         variable GENERIC
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           this.c_test
    *
    *
    * example 2
    *
    *           - property not overrided, instead use getters/seters
    *
    *
    * }</pre>
    */
    //      public privateFinal protectedPackage _package_ NOFINAL  
    private g_param  c_test;                     
    
    
    
    
    
    
    #parse("constructors.java")
    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              constructors/initializers
    //
    ////////////////////////////////////////////////////////////////////////////////// 
    //<editor-fold descr="initializer default ">
    /**                         initializer default                         
    * <pre>{@code                   
    *
    *
    * exapmle 1
    *
    *           initializer called before constructors
    *
    * example 2
    *
    *
    *
    * }</pre>
    */
    //</editor-fold>   
        {
        //example
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  INITIALIZER: " );
        
        }
        
        
    /**                         constructor default                   
    * <pre>{@code                   
    *
    *
    * exapmle 1
    *
    *           ${NAME}<String> v_obj = new ${NAME}<>();
    *
    * example 2
    *
    *           - constructor is a static method
    *           - constructor is not template method, inside constructor CALL only final,private,super methods
    *
    *
    * }</pre>
    */
    //      public privateFinal protectedPackage _package_ 
    //      throws Exception, VX_myxception   
    public ${NAME} ()                           
        {
        //super();  OR this("")
        //${NAME}<g_param> v_obj = new ${NAME}<>();
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  CONSTRUCTOR: " );
        
        //!NO new g_param() but..
        
        
        }
    
    /**                         constructor with GENERIC parameter                    
    * <pre>{@code                   
    *
    *
    * exapmle 1
    *
    *          ${NAME}<String> v_obj = new ${NAME}<>("test value");
    *
    *
    * example 2
    *
    *           - constructor is a static method
    *           - constructor is not template method, inside constructor CALL only final,private,super methods
    *
    *
    * }</pre>
    */
    //      public privateFinal protectedPackage _package_ 
    //      throws Exception, VX_myxception   
    public ${NAME} (final g_param p_1)                 
        {
        //super(p_1);   OR this(p_1,"")
        //${NAME}<g_param> v_obj = new ${NAME}<>();
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  CONSTRUCTOR: " );
        
        //!NO new g_param() but..
        this.c_test = p_1;
        
        }

    //////////////////////////////////////////////////////////////////////////////////
    //
    //                              methods
    //
    //////////////////////////////////////////////////////////////////////////////////  
    /**                         method test with GENERIC parameter GENERIC result
    * <pre>{@code                   
    *
    *
    * example 1
    *
    *           String v_string = v_obj.f_test("str");
    *
    *
    * example 2
    *
    *           - covariance: this overrided method can return subclass unstead class:
    *                  resultSomeSuperclass f_method()
    *                  resultSomeSubclass   f_overrided_method()
    *  
    *    
    *
    * }</pre>
    */
    //      public privateFinal protectedPackage _package_ final  
    //      throws Exception, VX_myxception   
    //      @Override
    public  g_param    f_test(final g_param p_1)                    
        {
        //throw new VX_exception( "vError" );
        //log.debug( "argument type: " + (( p_1 instanceof VV_ ) ? "VV_" : "no") );
        //${NAME}<g_param> v_obj = new ${NAME}<>();
        //log.debug   ( "${PROJECT_NAME} ${PACKAGE_NAME} ${NAME}  f_test: " +p_1);
        
        //!NO new g_param() but..
        this.c_test=p_1;
        
        return this.c_test;
        } 
    
        
    /**                         method test with argument of GENERIC<anyclass>    
    *                                     <not only T as uppers methods>
    * <pre>{@code
    *
    *
    * example 1
    *
    *              ${NAME}< Long >   v_obj1 = new ${NAME}<  >( 12L );
    *              ${NAME}< String > v_obj2 = new ${NAME}<  >( 12L );
    *              v_.f_test_genericlass(v_obj2);
    *              v_.f_test_genericlass(v_obj1);
    *
    * example 2
    *
    *           - covariance: this overrided method can return subclass unstead class:
    *                  resultSomeSuperclass f_method()
    *                  resultSomeSubclass   f_overrided_method()
    *
    *
    *
    * }</pre>
    */
    //      public privateFinal protectedPackage _package_ final  
    //      throws Exception, VX_myxception 
    //      @Override
    public void fg_test_genericlass(final ${NAME}< ? /* extends super VC_ & VI_ *//* extends super VCG_<g_param> & VIG_<g_param>*//* extends super VCG_<String> & VIG_<String> */ > p_1 )                    
        {
        //throw new VX_exception( "vError" );
        //log.debug   ("$class$ f_method f_test_genericlass: "+p_1);
        //super.fg_test_genericlass(p_1);
        //log.debug( "argument type: " + (( p_1 instanceof ${NAME}<?> ) ? "VV_" : "no") );
        //${NAME}<g_param> v_obj = new ${NAME}<>();
        
        //!NO new g_param() but..
        p_1.f_test( null );
        
        return;
        }
    
        
    
    }
