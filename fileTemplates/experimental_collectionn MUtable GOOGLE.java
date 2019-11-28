#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end


#parse("headerCollection.java")

#parse("File Header.java")


 

public final class ${NAME}
	extends Forwarding${CollectionType}< ${KEY} >
	{
	#parse("log.java")
	
	
	private final ${CollectionType}< ${KEY} > delegate; // backing list
	@Override
	protected ${CollectionType}< ${KEY} > delegate()
		{
		return delegate;
		}

	private ${NAME}()
		{
		super();
		
		#parse("throwdontuse")
		}
		
 
	public ${NAME}(@NotNull  ${CollectionType}< ${KEY} > backingList )
		{
		checkNotNull( backingList,"You must set backing list." );
		this.delegate = backingList;
		}
	
	
	public static ${NAME} of(@NotNull  ${CollectionType}< ${KEY} > backingMutableCollection )
        {
        return new  ${NAME}(backingMutableCollection);
        }
	
	
	public static ${NAME} deepCopyOf(@NotNull  ${CollectionType}< ${KEY} > backingMutableCollection )
		{

		return  new ${NAME}( deepCopyOfObject(backingMutableCollection,${CollectionType}.class) );

		}
	
	

	
	
	
	
	@Override
	public String toString()
		{
		return "${NAME} (" + delegate.size() + " ${KEY}s)";
		}
	
	private void checkConsistency_()
	    {
	    //notBlank();
	  	}
	private void isConsistent_()
	    {
	    //return !this.isBlank();
	    return true;
	  	}
	  	
	 
	public Optional<String> compute(@NotNull final String string )
		{
        //checkNotNull( string,"Argument should not be null." );
        if (string==null|| string.isBlank() ||!isConsistent()_ )
            return Optional.empty();
 		
		
        #parse("checkmutable.java")


        #parse("methodcompute.java")
        
        
        
        
        
		return Optional.ofNullable(string);
		}
	
		
		
	}

 