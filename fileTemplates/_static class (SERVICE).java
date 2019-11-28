#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;


#parse("File Header.java")

//<editor-fold desc=".">
/*

- private конструктор уже включен аннотацией @UtilityClass

- сервисные методы делать статик методами на классе с private конструктором а не на интерфейсе тк методы обработки могут содержать состояние и кеши
- интрфейсы использовать только для задания типа


*/
//</editor-fold>

/** <pre>                            
*   service (static class)
*    
* {@code
*               ${NAME}.compute();
*               var s=${NAME}.MY_CONSTANT;
* }
* Preconditions: 	none
* Postconditions:	none
* Side effects:		none
* Tread safety:		Not thread-safe
</pre>
*/            
@UtilityClass
@Slf4j
public final class ${NAME} 
    {  
    
    #parse("loglombok.java")
    
   	 
   	/**                         
    *   some constant
    */ 
    public static final String  MY_CONSTANT = new String("Test string.");

 
   	 
    private static  void    compute_() 
        {  
        return;
        } 
        
    
   	 
    /** <pre>                        
    *   static public method 
    *
    * {@code                   
    *           ${NAME}.compute();   
    * }</pre>
    */ 
    public static  void    compute() 
        {
        return;
        } 
    
 
   
     /**<pre>
        static generic method
     *
     * {@code
     *           ${NAME}.myCompute("stroka");
     *           ${NAME}.myCompute(12);
     * }</pre>
     
    @throws NullPointerException if argument nullable
    */
    public static  < E   /* extends super VC_ & VI_ */ /* extends super VCG_<?> & VIG_<?> */ /* extends super VCG_< E > & VIG_< E > */ /* extends super VCG_<String> & VIG_<String> */ >void myCompute(@NonNull final  E  object )
        {   
        return;
        }
    
    
    
    
    }
