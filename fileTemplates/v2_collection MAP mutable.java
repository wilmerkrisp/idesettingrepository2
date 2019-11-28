#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#parse("headerCollection.java")


#parse("File Header.java")
 

/**                             
*   class
    my mutable map "EntryMap"
*
     
    Make class simple without generic:
    1) reformat code
    6) replace all ${VALUE} with Type2     (click MATCH CASE)
    
 
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

example 1a
		Map.Entry<String,String> v_e1 = Map.entry("01k","01v");
		Map.Entry<String,String> v_e2 = Map.entry("02k","02v");
		My2Map< String, String > m1 = new My2Map<String,String> (v_e1,v_e2);
		m1.put( "03k","03v" );
		My2Map< String, String > m2 = new My2Map<String,String> ("k1","v1","k2","v2");
		m2.put( "03k","03v" );
		

		for( Map.Entry< String, String > i : m2.entrySet() )
			{
			log_.debug   ("Main main for: "+i);
			}


* example 2

     ${NAME} v_obj = new ${NAME}(Map.entry("1",1),Map.entry("2",2));
    
* example 3
    
    ${NAME} v_obj = new ${NAME}(someMap);
    
* example 4    
     ${NAME} v_obj =  ${NAME}.of(Map.entry("1",1),Map.entry("2",2));
    
* example 5    
     ${NAME} v_obj =  ${NAME}.of(someMap);
     
example 5

    ${NAME} v_obj = new ${NAME}("key1","value1");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9");
    ${NAME} v_obj = new ${NAME}("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9","key10","value10");
    

example 7

    ${NAME} v_obj = ${NAME}.of();
    ${NAME} v_obj = ${NAME}.of("key","value");
    ${NAME} v_obj = ${NAME}.of(("key1","value1","key2","value2");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9");
    ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9","key10","value10");
    
    
     
*
*
* }</pre>
*/                                                            
public final class ${NAME}  
    extends HashMap< ${KEY},${VALUE} >
    implements Serializable
	{
	
	
	
    #parse("constantsForMap.java")


    #parse("log.java")

	 private static final ${VALUE} DEFAULT_VALUE_ = ${defaultValue};     
	 private ${VALUE}  defaultValue_()         {         return DEFAULT_VALUE_;         }
  
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
	 * constructor with OBJECT(map)
	 * Analogically to usual collections
	 * <p>
	 * (!) DEEP copying of IMMUTABLE-property-objects in constructor
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = new ${NAME}(someMap);
	 *
	 *
	 * }</pre>
	 */
	public ${NAME}(@NotNull Map< ? extends ${KEY}, ? extends ${VALUE} > map )
		{
		super(  map );
		
		logForNullProperties_();
        logForValidProperties_();
        logForConsistencyProperties_();			
		}
	
	
	 
	private ${NAME}(@NotNull Iterator< Entry< ? extends ${KEY}, ? extends ${VALUE} > > iterator )
		{
		this();
		
		Entry< ? extends ${KEY}, ? extends ${VALUE} > e;
		while( iterator.hasNext() )
			{
			e = iterator.next();
			super.put( e.getKey() ,
			           e.getValue() );
			}
		logForNullProperties_();
        logForValidProperties_();
        logForConsistencyProperties_();			
		}
	
	 
	
	/**
	 * fabric with ALL PARAMS (vararg of entries)
	 * Analogically to List.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj =  ${NAME}.of(Map.entry("1",1),Map.entry("2",2));
	 *
	 *
	 * }</pre>
	 */
	public static   ${NAME} ofEntries(@NotNull Entry< ? extends ${KEY}, ? extends ${VALUE} >... entries )
		{
		return new ${NAME}( (Map) Map.ofEntries( entries ) );
		}
	
	
	
	/**
	 * fabric with OBJECT(map)
	 * Analogically to usual collections
	 * <p>
	 * (!) SHALLOW copying of IMMUTABLE-property-objects in constructor
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj =  ${NAME}.copyOf(someMap);
	 *
	 *
	 * }</pre>
	 */
	public static   ${NAME} copyOf(@NotNull Map< ? extends ${KEY}, ? extends ${VALUE} > map )
		{ 
		return new ${NAME}( map );
		}
	
	
	
	/**
	 * fabric with OBJECTdeep(map)
	 * <p>
	 * <p>
	 * (!) DEEP copying of IMMUTABLE-property-objects in constructor
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           TwoImmutableStringList v_obj =  TwoImmutableStringList.deepCopyOf(someMap);
	 *
	 *
	 * }</pre>
	 */
	public static <  E extends Map< ? extends ${KEY}, ? extends ${VALUE} > & Serializable > ${NAME} deepCopyOf(@NotNull E map )
		{
		return copyOf( (E) SerializationUtils.clone( map ) );
		}
	
	
	 
	
	
	/**
	 * fabric with paramter 0
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of();
	 *
	 *
	 * }</pre>
	 */
	public static   ${NAME} of()
		{
		return new ${NAME}();
		}
	
	
	
	/**
	 * fabric with paramter 1
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of("key","value");
	 *
	 *
	 * }</pre>
	 */
	public static   ${NAME} of(@NotNull ${KEY} k1 ,
	                                                         @NotNull   ${VALUE} v1 )
		{
		return new ${NAME}( Map.of( k1 ,
		                                   v1 ) );
		}
	
	
	
	/**
	 * fabric with paramter 2
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2");
	 *
	 *
	 * }</pre>
	 */
	public static   ${NAME} of(@NotNull ${KEY} k1 ,
	                                                         @NotNull   ${VALUE} v1 ,
	                                                         @NotNull   ${KEY} k2 ,
	                                                         @NotNull   ${VALUE} v2 )
		{
		return new ${NAME}( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ) );
		}
	
	
	
	/**
	 * fabric with paramter 3
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *          ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3");
	 *
	 *
	 * }</pre>
	 */
	public static  ${NAME} of(@NotNull ${KEY} k1 ,
	                                                         @NotNull   ${VALUE} v1 ,
	                                                         @NotNull   ${KEY} k2 ,
	                                                         @NotNull   ${VALUE} v2 ,
	                                                         @NotNull   ${KEY} k3 ,
	                                                         @NotNull   ${VALUE} v3 )
		{
		return new ${NAME}( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ) );
		}
	
	
	
	/**
	 * fabric with paramter 4
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4");
	 *
	 *
	 * }</pre>
	 */
	public static   ${NAME} of(@NotNull ${KEY} k1 ,
	                                                         @NotNull   ${VALUE} v1 ,
	                                                         @NotNull   ${KEY} k2 ,
	                                                         @NotNull   ${VALUE} v2 ,
	                                                         @NotNull   ${KEY} k3 ,
	                                                         @NotNull   ${VALUE} v3 ,
	                                                         @NotNull   ${KEY} k4 ,
	                                                         @NotNull   ${VALUE} v4 )
		{	 
		return new ${NAME}( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ,
		                                   k4 ,
		                                   v4 ) );
		}
	
	
	
	/**
	 * fabric with paramter 5
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *          ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5");
	 *
	 *
	 * }</pre>
	 */
	public static   ${NAME} of(@NotNull ${KEY} k1 ,
	                                                        @NotNull    ${VALUE} v1 ,
	                                                        @NotNull    ${KEY} k2 ,
	                                                        @NotNull    ${VALUE} v2 ,
	                                                        @NotNull    ${KEY} k3 ,
	                                                        @NotNull    ${VALUE} v3 ,
	                                                        @NotNull    ${KEY} k4 ,
	                                                        @NotNull    ${VALUE} v4 ,
	                                                        @NotNull    ${KEY} k5 ,
	                                                        @NotNull    ${VALUE} v5 )
		{ 
		return new ${NAME}( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ,
		                                   k4 ,
		                                   v4 ,
		                                   k5 ,
		                                   v5 ) );
		}
	
	
	
	/**
	 * fabric with paramter 6
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6");
	 *
	 *
	 * }</pre>
	 */
	public static   ${NAME} of(@NotNull ${KEY} k1 ,
	                                                         @NotNull   ${VALUE} v1 ,
	                                                         @NotNull   ${KEY} k2 ,
	                                                         @NotNull   ${VALUE} v2 ,
	                                                         @NotNull   ${KEY} k3 ,
	                                                         @NotNull   ${VALUE} v3 ,
	                                                         @NotNull   ${KEY} k4 ,
	                                                         @NotNull   ${VALUE} v4 ,
	                                                         @NotNull   ${KEY} k5 ,
	                                                         @NotNull   ${VALUE} v5 ,
	                                                         @NotNull   ${KEY} k6 ,
	                                                         @NotNull   ${VALUE} v6 )
		{
		return new ${NAME}( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ,
		                                   k4 ,
		                                   v4 ,
		                                   k5 ,
		                                   v5 ,
		                                   k6 ,
		                                   v6 ) );
		}
	
	
	
	/**
	 * fabric with paramter 7
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *          ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7");
	 *
	 *
	 * }</pre>
	 */
	public static   ${NAME} of(@NotNull ${KEY} k1 ,
	                                                         @NotNull   ${VALUE} v1 ,
	                                                         @NotNull   ${KEY} k2 ,
	                                                         @NotNull   ${VALUE} v2 ,
	                                                         @NotNull   ${KEY} k3 ,
	                                                         @NotNull   ${VALUE} v3 ,
	                                                          @NotNull  ${KEY} k4 ,
	                                                         @NotNull   ${VALUE} v4 ,
	                                                         @NotNull   ${KEY} k5 ,
	                                                         @NotNull   ${VALUE} v5 ,
	                                                         @NotNull   ${KEY} k6 ,
	                                                         @NotNull   ${VALUE} v6 ,
	                                                         @NotNull   ${KEY} k7 ,
	                                                         @NotNull   ${VALUE} v7 )
		{
		return new ${NAME}( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ,
		                                   k4 ,
		                                   v4 ,
		                                   k5 ,
		                                   v5 ,
		                                   k6 ,
		                                   v6 ,
		                                   k7 ,
		                                   v7 ) );
		}
	
	
	
	/**
	 * fabric with paramter 8
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8");
	 *
	 *
	 * }</pre>
	 */
	public static   ${NAME} of(@NotNull ${KEY} k1 ,
	                                                         @NotNull   ${VALUE} v1 ,
	                                                         @NotNull   ${KEY} k2 ,
	                                                         @NotNull   ${VALUE} v2 ,
	                                                         @NotNull   ${KEY} k3 ,
	                                                         @NotNull   ${VALUE} v3 ,
	                                                         @NotNull   ${KEY} k4 ,
	                                                         @NotNull   ${VALUE} v4 ,
	                                                         @NotNull   ${KEY} k5 ,
	                                                         @NotNull   ${VALUE} v5 ,
	                                                         @NotNull   ${KEY} k6 ,
	                                                         @NotNull   ${VALUE} v6 ,
	                                                         @NotNull   ${KEY} k7 ,
	                                                         @NotNull   ${VALUE} v7 ,
	                                                         @NotNull   ${KEY} k8 ,
	                                                         @NotNull   ${VALUE} v8 )
		{
		return new ${NAME}( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ,
		                                   k4 ,
		                                   v4 ,
		                                   k5 ,
		                                   v5 ,
		                                   k6 ,
		                                   v6 ,
		                                   k7 ,
		                                   v7 ,
		                                   k8 ,
		                                   v8 ) );
		}
	
	
	
	/**
	 * fabric with paramter 9
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9");
	 *
	 *
	 * }</pre>
	 */
	public static   ${NAME} of(@NotNull ${KEY} k1 ,
	                                                        @NotNull    ${VALUE} v1 ,
	                                                        @NotNull    ${KEY} k2 ,
	                                                        @NotNull    ${VALUE} v2 ,
	                                                        @NotNull    ${KEY} k3 ,
	                                                        @NotNull    ${VALUE} v3 ,
	                                                        @NotNull    ${KEY} k4 ,
	                                                        @NotNull    ${VALUE} v4 ,
	                                                        @NotNull    ${KEY} k5 ,
	                                                        @NotNull    ${VALUE} v5 ,
	                                                         @NotNull   ${KEY} k6 ,
	                                                        @NotNull    ${VALUE} v6 ,
	                                                        @NotNull    ${KEY} k7 ,
	                                                        @NotNull    ${VALUE} v7 ,
	                                                        @NotNull    ${KEY} k8 ,
	                                                        @NotNull    ${VALUE} v8 ,
	                                                        @NotNull    ${KEY} k9 ,
	                                                        @NotNull    ${VALUE} v9 )
		{ 
		return new ${NAME}( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ,
		                                   k4 ,
		                                   v4 ,
		                                   k5 ,
		                                   v5 ,
		                                   k6 ,
		                                   v6 ,
		                                   k7 ,
		                                   v7 ,
		                                   k8 ,
		                                   v8 ,
		                                   k9 ,
		                                   v9 ) );
		}
	
	
	
	/**
	 * fabric with paramter 10
	 * Analogically to Map.of
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           ${NAME} v_obj = ${NAME}.of("key1","value1","key2","value2","key3","value3","key4","value4","key5","value5","key6","value6","key7","value7","key8","value8","key9","value9","key10","value10");
	 *
	 *
	 * }</pre>
	 */
	public static   ${NAME} of(@NotNull ${KEY} k1 ,
	                                                        @NotNull    ${VALUE} v1 ,
	                                                        @NotNull    ${KEY} k2 ,
	                                                        @NotNull    ${VALUE} v2 ,
	                                                        @NotNull    ${KEY} k3 ,
	                                                        @NotNull    ${VALUE} v3 ,
	                                                        @NotNull    ${KEY} k4 ,
	                                                        @NotNull    ${VALUE} v4 ,
	                                                        @NotNull    ${KEY} k5 ,
	                                                        @NotNull    ${VALUE} v5 ,
	                                                         @NotNull   ${KEY} k6 ,
	                                                         @NotNull   ${VALUE} v6 ,
	                                                        @NotNull    ${KEY} k7 ,
	                                                         @NotNull   ${VALUE} v7 ,
	                                                         @NotNull   ${KEY} k8 ,
	                                                         @NotNull   ${VALUE} v8 ,
	                                                         @NotNull   ${KEY} k9 ,
	                                                         @NotNull   ${VALUE} v9 ,
	                                                         @NotNull   ${KEY} k10 ,
	                                                         @NotNull   ${VALUE} v10 )
		{
		return new ${NAME}( Map.of( k1 ,
		                                   v1 ,
		                                   k2 ,
		                                   v2 ,
		                                   k3 ,
		                                   v3 ,
		                                   k4 ,
		                                   v4 ,
		                                   k5 ,
		                                   v5 ,
		                                   k6 ,
		                                   v6 ,
		                                   k7 ,
		                                   v7 ,
		                                   k8 ,
		                                   v8 ,
		                                   k9 ,
		                                   v9 ,
		                                   k10 ,
		                                   v10 ) );
		}
	
 
	
	
	/**
	 * fabric with parameter = Iterable type
	 * <p>
	 * <p>
	 * (!) SHALLOW copying of IMMUTABLE-property-objects in constructor
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           TwoImmutableStringList v_obj =  TwoImmutableStringList.copyOf(someCollection);
	 *
	 *
	 * }</pre>
	 */
	public static   ${NAME} copyOf(@NotNull Iterable< Entry< ? extends ${KEY}, ? extends ${VALUE} > > iterable )
		{
		return iterable instanceof Collection ? copyOf( (Collection) iterable ) : copyOf( iterable.iterator() );
		}
	
	
	
	/**
	 * fabric with parameter = Iterable type
	 * <p>
	 * <p>
	 * (!) DEEP copying of IMMUTABLE-property-objects in constructor
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           TwoImmutableStringList v_obj =  TwoImmutableStringList.deepCopyOf(someCollection);
	 *
	 *
	 * }</pre>
	 */
	public static <  E extends Iterable< Entry< ? extends ${KEY}, ? extends ${VALUE} > > & Serializable > ${NAME}  deepCopyOf(@NotNull E iterable )
		{
		return copyOf( (E) SerializationUtils.clone( iterable ) );
		}
	

	
	
	/**
	 * fabric with parameter = Iterator type
	 * <p>
	 * <p>
	 * (!) SHALLOW copying of IMMUTABLE-property-objects in constructor
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           TwoImmutableStringList v_obj =  TwoImmutableStringList.copyOf(someCollection.iterator());
	 *
	 *
	 * }</pre>
	 */
	public static   ${NAME} copyOf(@NotNull Iterator< Entry< ? extends ${KEY}, ? extends ${VALUE} > > iterator )
		{
		return new ${NAME}( iterator );
		}
	
	
	
	/**
	 * fabric with parameter = Iterator type
	 * <p>
	 * <p>
	 * (!) DEEP copying of IMMUTABLE-property-objects in constructor
	 *
	 * <pre>{@code
	 *
	 * exapmle 1
	 *
	 *           TwoImmutableStringList v_obj =  TwoImmutableStringList.deepCopyOf(someCollection.iterator());
	 *
	 *
	 * }</pre>
	 */
	public static <   E extends Iterator< Entry< ? extends ${KEY}, ? extends ${VALUE} > > & Serializable > ${NAME}  deepCopyOf(@NotNull E iterator )
		{
		return copyOf( (E) SerializationUtils.clone( iterator ) );
		}
	
	
	
    
    
    




    	
        
    #parse("implementation.java")

 





    #parse("checkmutableequals.java")


    #parse("checkLogAssertMap.java")
	
	
	
	 
    
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
