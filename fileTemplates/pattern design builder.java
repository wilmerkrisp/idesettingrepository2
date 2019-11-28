

public interface DrawingFactory
	{
	LineBuilder newLineBuilder();
    }


@Component
public class DefaultDrawingFactory
	implements DrawingFactory
	{
	@Override
	public LineBuilder newLineBuilder()
		{
		return Line.builder();
		}
    }




/**
 * for using with abstract factory
 */
public interface LineBuilder
	{
	public LineBuilder startPoint( final int x0 ,
	                               final int y0 );
	
	public LineBuilder endPoint( final int x1 ,
	                             final int y1 );
	
	public LineBuilder filler( char character );
	
	public Mono< Figure> buildMono();
	
	public Try<Figure> buildTry();
	}







@Value
@AllArgsConstructor( access = AccessLevel.PRIVATE )
@Patterns 
@Slf4j
public final class Line
	implements Figure,
	           Comparable<Line>
	{
    ...
    ....
    ...
    public static LineBuilder builder()
        {
        return new Builder();
        }
    
    
    
    public static final class Builder
        implements LineBuilder
        {
        ...
        ....
        ...
        @Override
        public final Mono<Figure> buildMono()
            {
            return PositivePoint.monoOf( x0 , y0 )
                                .then( PositivePoint.monoOf( x1 , y1 ) )
                                .then( monoOf_( x0 , y0 , x1 , y1 , character ) )
                                .cast( Figure.class );
            }
        
        @Deprecated
        public final Figure build()
            {
            return buildMono().block();
            }
        
    
        @Override
        public final Try<Figure> buildTry()
            {
            return tryFromMono( buildMono() );
            }
            
        }
