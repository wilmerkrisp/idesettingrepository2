#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
 



#parse("File Header.java")





public abstract class ${name}<T, ID>  /**please name it Forwarding____   */
	implements ${BASE_INTERFACE}<T,ID>
	{
	/**
	 * Constructor for use by subclasses.
	 */
	protected ${name}() {}
	
	/**
	 * Returns the backing delegate instance that methods are forwarded to. Abstract subclasses
	 * generally override this method with an abstract method that has a more specific return type.
	 * Concrete subclasses override this method to supply the
	 * instance being decorated.
	 */
	protected abstract ${BASE_INTERFACE}<T,ID> delegate();
	
	/**
	 * Returns the string representation generated by the delegate's {@code toString} method.
	 */
	@Override
	public String toString()
		{
		return delegate().toString();
		}
	
	@Override
	public <S extends T> Mono<S> save( final S s )
		{
		return delegate().save( s );
		}
	
	
	}
