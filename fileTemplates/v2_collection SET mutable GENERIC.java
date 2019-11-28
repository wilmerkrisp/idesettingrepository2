#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#parse("headerCollection.java")


#parse("File Header.java")

 

/**                             
*   class
    my mutable set
*
  
    Make class simple without generic:
    1) reformat code
    2) replace all < TKey > with "" ,besides replaceAll( UnaryOperator< TKey > operator )
    3) replace all <> with ""       (click MATCH CASE)
    4) uncomment < Type1 >
    5) replace all TKey with Type1


*   @author     wilmer
*   @version    1.0
*   @since      1.0 wilmer draft

    #parse("inheritanceComposition.java")

* <pre>{@code
*
* example 1
*
*   ${NAME} v_obj = new ${NAME}();
*   v_obj.oneCompute();

* example 2

    ${NAME} v2 = new ${NAME}("one","two","th3");
    
* example 3
    
    ${NAME} v2 = new ${NAME}(coll);
    
* example 4    
    ${NAME} v2 =  ${NAME}.of("one","two","th3");
    
* example 5    
    ${NAME} v2 =  ${NAME}.of(coll);
*
*
* }</pre>
*/                                                            
public final class ${NAME} < TKey >
    extends HashSet < TKey > /* <Type1> */
    implements Serializable
	{
	
	#parse("constantsForList.java")
	
    #parse("log.java")
 
        
    private TKey  defaultElement_()         {         return null;         }

    #parse("checkmutableconstructor.java")
    
    
	/**                         
	*   constructor default
	*      
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}();
    *
    *
    * }</pre>
    */ 
	public ${NAME}()
		{
	 
		super();
		}
	
	
	/**                         
	*   constructor with capacity
	*   Analogically to usual collections  
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}(12);
    *
    *
    * }</pre>
    */ 
	public ${NAME}( int initialCapacity )
		{
		super( initialCapacity );
		}
	
    
    	/**                         
	*   constructor with capacity and loadfactor
	*   Analogically to usual set  
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}(12,11);
    *
    *
    * }</pre>
    */ 
	public ${NAME}( int initialCapacity,float loadFactor )
		{
		super( initialCapacity, loadFactor );
		}
	
    /**                         
	*   constructor with capacity and loadfactor and dummy
	*   Analogically to usual set  
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}(12,11);
    *
    *
    * }</pre>
    */ 
	public ${NAME}( int initialCapacity,float loadFactor,boolean dummy )
		{
		super( initialCapacity, loadFactor );
		}
    
    
    
    	/**                         
	*   constructor with OBJECT(collection)
	*   Analogically to usual collections  
	*           
	    (!) SHALLOW COPYING OF OBJECT IN CONSTRUCTOR
	              
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj = new ${NAME}(someCollection);
    *
    *
    * }</pre>
    */ 
	public    ${NAME}(@NotNull Collection< ? extends TKey > collection )
		{
		super(   collection );
		
		logForNullProperties_();
        logForValidProperties_();
        logForConsistencyProperties_();			
		}
	
 
	
	private ${NAME}(@NotNull Iterator< ? extends TKey > iterator )
		{
		this();
		
		while( iterator.hasNext() )
			{
			super.add( iterator.next() );
			}
		logForNullProperties_();
        logForValidProperties_();
        logForConsistencyProperties_();				
		}	

  

	/**                         
	*   fabric with ALL PARAMS (vararg)
	*   Analogically to List.of    
	*                      
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.of("one","two","th3");
    *
    *
    * }</pre>
    */ 
	public static < TKey > ${NAME}< TKey > of(@NotNull TKey... elements )
		{
		return new ${NAME}<>( (Collection) Set.of( elements ) );
		}
		
		
	/**                         
	*   fabric with OBJECT(collection)
	*   Analogically to usual collections  
	*       
	    (!) SHALLOW copying of MUTABLE-property-objects in constructor
	                  
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.copyOf(someCollection);
    *
    *
    * }</pre>
    */ 
    public static  <TKey, E extends Collection< ? extends TKey >  >  ${NAME}<TKey> copyOf(@NotNull E collection )
		{ 
		return new ${NAME}<> ( collection );
		}
		
				

	/**                         
	*   fabric with OBJECTdeep(collection)
  
	*           
	    (!) DEEP copying of IMMUTABLE-property-objects in constructor
	              
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.deepCopyOf(someCollection);
    *
    *
    * }</pre>
    */ 	
	public static < TKey, E extends Collection< ? extends TKey > & Serializable > ${NAME}<TKey> deepCopyOf(@NotNull E collection )
		{
		return copyOf( (E) SerializationUtils.clone( collection ) );
		}
	


	
 
	/**                         
	*   fabric with parameter = Iterable type
  
	*           
	    (!) SHALLOW copying of IMMUTABLE-property-objects in constructor
	              
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.copyOf(someCollection);
    *
    *
    * }</pre>
    */ 	
	public static <TKey> ${NAME}<TKey> copyOf(@NotNull Iterable< ? extends TKey > iterable )
		{
		return iterable instanceof Collection ? copyOf( (Collection) iterable ) : copyOf( iterable.iterator() );
		}
	
	
	/**                         
	*   fabric with parameter = Iterable type
  
	*           
	    (!) DEEP copying of IMMUTABLE-property-objects in constructor
	              
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.deepCopyOf(someCollection);
    *
    *
    * }</pre>
    */ 	
	public static <TKey, E extends Iterable< ? extends TKey > & Serializable > ${NAME}<TKey> deepCopyOf(@NotNull E iterable )
		{
		return copyOf( (E) SerializationUtils.clone( iterable ) );
		}
	
 
	
	
	/**                         
	*   fabric with parameter = Iterator type
  
	*           
	    (!) SHALLOW copying of IMMUTABLE-property-objects in constructor
	              
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.copyOf(someCollection.iterator());
    *
    *
    * }</pre>
    */ 	
	public static  <TKey> ${NAME}<TKey> copyOf(@NotNull Iterator< ? extends TKey > iterator )
		{ 
		return new ${NAME}<>( iterator );
		}
	
	
	/**                         
	*   fabric with parameter = Iterator type
  
	*           
	    (!) DEEP copying of IMMUTABLE-property-objects in constructor
	              
    * <pre>{@code                   
    *
    * exapmle 1
    *
    *           ${NAME} v_obj =  ${NAME}.deepCopyOf(someCollection.iterator());
    *
    *
    * }</pre>
    */ 		
	public static < TKey, E extends Iterator< ? extends TKey > & Serializable > ${NAME}<TKey> deepCopyOf(@NotNull E iterator )
		{
		return copyOf( (E) SerializationUtils.clone( iterator ) );
		}
		
			
	
	
    #parse("implementation.java")




    #parse("checkmutableequals.java")



    #parse("checkLogAssertCollectionGeneric.java")

	
	 
	/**
	 * method f_method
	 *
	 *
	 * !CHANGE_ME_DESCRIPTION!
	 *
	 * <pre>{@code
	 *
	 *
	 * example 1
	 *            - генерирую runtime ошибки программирования
	 *            - генерирую runtime ошибки выполнения метода, если метод не вернет то что должен
	 *
	 *
	 * example 2
	 *
	 *           v_obj.f_method("test");
	 *
	 * example 3
	 *
	 *           - covariance: this overrided method can return subclass unstead class:
	 *                  resultSomeSuperclass f_method()
	 *                  resultSomeSubclass   f_overrided_method()
	 *
	 *
	 * }</pre> ПОМНИ СГЕНЕРИТЬ JAVADOC MAC8+fixDocComment И УБРАТЬ ЭТОТ ТЕКСТ
	 */
	public void compute(@NotNull final String p_1 )
		{
        #parse("checkmutable.java")


        #parse("methodcompute.java")
        

        Objects.requireNonNull( p_1 );
        
        setDefaultValuesForUnsettedProperties_();
        assertForNullProperties_(this);
        assertForValidProperties_(this);
		assertForConsistencyProperties_(this);
        
		return;
		}
		
		
	}
