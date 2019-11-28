#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end


#parse("File Header.java")

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Singular;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import lombok.NonNull;

import io.vavr.Tuple;
import io.vavr.Tuple#if (${T9} != "")9
                #elseif (${T8} != "")8 
                #elseif (${T7} != "")7 
                #elseif (${T6} != "")6 
                #elseif (${T5} != "")5 
                #elseif (${T4} != "")4 
                #elseif (${T3} != "")3 
                #elseif (${T2} != "")2 
                #elseif (${T1} != "")1#end;
import io.vavr.match.annotation.Patterns;       
import io.vavr.match.annotation.Unapply;


import java.util.Comparator;
import com.google.common.collect.ComparisonChain;

import java.util.List;
import life.expert.common.function.TupleUtils;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;

import io.vavr.Tuple;
import io.vavr.match.annotation.Patterns;
import io.vavr.match.annotation.Unapply;

import com.google.common.collect.ComparisonChain;
import static reactor.core.publisher.Mono.*;
import static life.expert.common.reactivestreams.Preconditions.*; //reactive check



 /*
*  todo If it is a precondition-object then
*  1) modify class-javadoc comment (see below)
	- This is object-precondition represents point with two positive &gt;=0 coordinates inside
	- in order not to do the same checks all the time,
	- Thus, if such an object is transferred to the input, then we know that it always contains the correct data.
*  2) remove  ref to localized resource
*  3) delete comment from monoOf
*  4) remove method monoOfPreconditions
*  5) remove method compute
*
* */
 
//<editor-fold desc=".">
 /*
    @Value означает
        @ToString 
        @EqualsAndHashCode 
        @AllArgsConstructor
        @FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE) 
        @Getter
        
        
 
     d) IDE autogenerated Guava ComparisonChain, в сгенерированном методе compareTo необходимо заменить:
    		                      .compare( this.item2s ,
		                                that.item2s ,
		                                Ordering.< String > natural().lexicographical() )
		                                
		                                
		                                
		                                
  a) чтобы нельзя было отнаследовать и затереть данные подкласса ВЫБРАН ВАРИАНТ Б)
		вариант а) сделать класс final
		вариант  б) закрыть ВСЕ конструкторы и получать объекты только фабрикой
 
      b) You can use mutable variant of the class (companien class) for batch operations
 
 
 	 c) копирующие фабрики: для немутабельных классов нет смысла поддерживать копирование объектов, поскольку копии будут фактически неотличимы от оригинала.
	   - для немутабельных классов статические методы генерации копии имеют смысл, если получают на вход  параметр более общего интерфейса и мутабельный аргумент (см как в коллекциях Java)
	   - они называются conversion constructors / conversion factories 
 
    
    e) нет конструкторов, только статик фабрика и builder
    
f) дефолтные значения свойств можно выставить
	@Builder.Default private final long created = System.currentTimeMillis();

g) как сделать withName метод (если поместить на весь класс - то будет сгенерено для всех методов класса )
	@Wither private final String name; 

h) отдельный под-билдер для свойства-коллекции, имплементация будет Guava's ImmutableList 
	@Singular  List<Line> ones; // на конце должно быть S, иначе не сможет сделать форму единственного числа
	@Singular("axis") List<Line> axes  // можно задать явно форму существительного в единственном числе

i) если нужно закешировать свойство то пометить его аннотацией
	@Getter( lazy=true)

j) для игнорирования свойства, назвать его с $ 
,и задать ему явно @NonFinal  тк ранее была применена аннотация @FieldDefaults
	 @NonFinal String $ item1
	 
	 
 */
//</editor-fold>

/**<pre>
  * simple immutable class: ${T1} ${T2} ${T3} ${T4} ${T5} ${T6} ${T7} ${T8} ${T9}
 *
 *  - pattern new-call
 *  - the class not for inheritance

 *	- only the monoOf.. factory methods is allowed, because it allows you to lazily create objects only with a real subscription
 *	- 'of' - factory method is prohibited because it is intended only for easy creation of objects in tests, please use pure functional methods monoOf.., without raise exceptions.

 - in order not to do the same checks all the time, they are placed in special objects-preconditions. 
 	Thus, if such an object is transferred to the input, then we know that it always contains the correct data. 
 	Nevertheless, for convenience, methods accepting simple parameters are available, then they internally use the same precondition objects for verification

 *
 *  {@code
    //pattern new-call
 * 	  var  o = ${NAME}.of("Test");
 * 	  var o = ${NAME}.<String, String>builder().item1("f").build();
      var b=o.compute();
  }
  
 * Preconditions: in outer precondition-objects or inside (see explanation above)
 * Postconditions: none
 * Side effects: none
 * Tread safety:  Immutable
 
  </pre>
 *
 

 
 */
 
  

@Value
@AllArgsConstructor( access = AccessLevel.PRIVATE )
@Patterns /*pattern matching in vavr*/
@Slf4j
public final class ${NAME} 	implements Comparable< ${NAME}  > 
	{
	
    #parse("loglombok.java")





#if (${T1} != "")


    #if ($T1.startsWith("List") || $T1.startsWith("Set") || $T1.startsWith("Map") ) 
	/**
	 * item1s
	 
	 -- SETTER --
	 @param item1s
	  	item1s
	 @return item1s
	 
	 -- GETTER --
	  @return item1s
	  the item1s
	 */ 
	  @Singular
	    private final ${T1} item1s;
	#else
	/**
	 * item1
	 
	 -- SETTER --
	 @param item1
	  	item1
	 @return item1
	 
	 -- GETTER --
	  @return item1
	  the item1
	 */ 
	    private final ${T1} item1;
	#end
#end

#if (${T2} != "")

    #if ($T2.startsWith("List") || $T2.startsWith("Set") || $T2.startsWith("Map") ) 
	/**
	 * item2s
	 
	 -- SETTER --
	 @param item2s
	  	item2s
	 @return item2s
	 
	 -- GETTER --
	 @return item2s
	  the item2s
	 */
	  @Singular
	    private final ${T2} item2s;
	#else
	/**
	 * item2
	 
	 -- SETTER --
	 @param item2
	  	item2
	 @return item2
	 
	 -- GETTER --
	 @return item2
	  the item2
	 */ 
	    private final ${T2} item2;
	#end
#end

#if (${T3} != "")

    #if ($T3.startsWith("List") || $T3.startsWith("Set") || $T3.startsWith("Map") )  
	/**
	 * item3s
	 
	 -- SETTER --
	 @param item3s
	  	item3s
	 @return item3s
	 
	 -- GETTER --
	  @return item3s
	  the item3s
	 */
	  @Singular
	    private final ${T3} item3s;
	#else
	/**
	 * item3
	 
	 -- SETTER --
	 @param item3
	  	item3
	 @return item3
	 
	 -- GETTER --
	 @return item3
	  the item3
	 */
	    private final ${T3} item3;
	#end
#end

#if (${T4} != "")

    #if ($T4.startsWith("List") || $T4.startsWith("Set") || $T4.startsWith("Map") )  
	/**
	 * item4s
	 
	 -- SETTER --
	 @param item4s
	  	item4s
	 @return item4s
	 
	 -- GETTER --
	 @return item4s
	  the item4s
	 */
	  @Singular
	    private final ${T4} item4s;
	#else
	/**
	 * item4
	 
	 -- SETTER --
	 @param item4
	  	item4
	 @return item4
	 
	 -- GETTER --
	 @return item4
	  the item4
	 */
	    private final ${T4} item4;
	#end
#end

#if (${T5} != "")

    #if ($T5.startsWith("List") || $T5.startsWith("Set") || $T5.startsWith("Map") )  
	/**
	 * item5s
	 
	 -- SETTER --
	 @param item5s
	  	item5s
	 @return item5s
	 
	 -- GETTER --
	 @return item5s
	  the item5s
	 */
	  @Singular
	    private final ${T5} item5s;
	#else
	/**
	 * item5
	 
	 -- SETTER --
	 @param item5
	  	item5
	 @return item5
	 
	 -- GETTER --
	 @return item5
	  the item5
	 */
	    private final ${T5} item5;
	#end
#end

#if (${T6} != "")

    #if ($T6.startsWith("List") || $T6.startsWith("Set") || $T6.startsWith("Map") )  
	/**
	 * item6s
	 
	 -- SETTER --
	 @param item6s
	  	item6
	 @return item6s
	 
	 -- GETTER --
	 @return item6s
	  the item6s
	 */
	  @Singular
	    private final ${T6} item6s;
	#else
	/**
	 * item6
	 
	 -- SETTER --
	 @param item6
	  	item6
	 @return item6
	 
	 -- GETTER --
	 @return item6
	  the item6
	 */
	    private final ${T6} item6;
	#end
#end

#if (${T7} != "")

    #if ($T7.startsWith("List") || $T7.startsWith("Set") || $T7.startsWith("Map") ) 
	/**
	 * item7s
	 
	 -- SETTER --
	 @param item7s
	  	item7s
	 @return item7s
	 
	 -- GETTER --
	 @return item7s
	  the item7s
	 */
	  @Singular
	    private final ${T7} item7s;
	#else
	/**
	 * item7
	 
	 -- SETTER --
	 @param item7
	  	item7
	 @return item7
	 
	 -- GETTER --
	  @return item7
	  the item7
	 */
	    private final ${T7} item7;
	#end
#end

#if (${T8} != "")

    #if ($T8.startsWith("List") || $T8.startsWith("Set") || $T8.startsWith("Map") )  
	/**
	 * item8s
	 
	 -- SETTER --
	 @param item8s
	  	item8s
	 @return item8s
	 
	 -- GETTER --
	 @return item8s
	  the item8s
	 */
	  @Singular
	    private final ${T8} item8s;
	#else
	/**
	 * item8
	 
	 -- SETTER --
	 @param item8
	  	item8
	 @return item8
	 
	 -- GETTER --
	  @return item8
	  the item8
	 */
	    private final ${T8} item8;
	#end
#end

#if (${T9} != "")

    #if ($T9.startsWith("List") || $T9.startsWith("Set") || $T9.startsWith("Map") )
	/**
	 * item9s
	 
	 -- SETTER --
	 @param item9s
	  	item9s
	 @return item9s
	 
	 -- GETTER --
	  @return item9s
	  the item9s
	 */
	  @Singular
	    private final ${T9} item9s;
	#else
	/**
	 * item9
	 
	 -- SETTER --
	 @param item9
	  	item9
	 @return item9
	 
	 -- GETTER --
	 @return item9
	  the item9
	 */
	    private final ${T9} item9;
	#end
#end
 
 
 
 
	/*
	Other factories use this method to create an object.
	He himself calls the private constructor to create the object.
	* */
	private static Mono<${NAME}> monoOf_(  
			#if (${T1} != "")  final ${T1} item1 #end
            #if (${T2} != ""), final ${T2} item2 #end
            #if (${T3} != ""), final ${T3} item3 #end
            #if (${T4} != ""), final ${T4} item4 #end
            #if (${T5} != ""), final ${T5} item5 #end
            #if (${T6} != ""), final ${T6} item6 #end
            #if (${T7} != ""), final ${T7} item7 #end
            #if (${T8} != ""), final ${T8} item8 #end
            #if (${T9} != ""), final ${T9} item9 #end )
		{
		return fromSupplier( () -> new ${NAME}( 
				#if (${T1} != "") item1 #end
                #if (${T2} != ""),item2 #end
                #if (${T3} != ""),item3 #end
                #if (${T4} != ""),item4 #end
                #if (${T5} != ""),item5 #end
                #if (${T6} != ""),item6 #end
                #if (${T7} != ""),item7 #end
                #if (${T8} != ""),item8 #end
                #if (${T9} != ""),item9 #end  ) );
		}



	//<editor-fold desc="constructors with full complect parameters">
	
	/**
	 * Create ${NAME} from simple arguments
	 * Only the monoOf.. factory methods is allowed, because it allows you to lazily create objects only with a real subscription

	 			 - in order not to do the same checks all the time, they are placed in special objects-preconditions. 
 				Thus, if such an object is transferred to the input, then we know that it always contains the correct data. 
 				Nevertheless, for convenience, methods accepting simple parameters are available, then they internally use the same precondition objects for verification


	 *
	 * @return the Mono with lazyli created object
	 *
	 * @implNote to create objects, this method calls the private factory monoOf_
	 			 to verify objects, this method uses precondition-objects
	 */
	public static Mono<${NAME}> monoOf(
		            #if (${T1} != "")  final ${T1} item1 #end
                    #if (${T2} != ""), final ${T2} item2 #end
                    #if (${T3} != ""), final ${T3} item3 #end
                    #if (${T4} != ""), final ${T4} item4 #end
                    #if (${T5} != ""), final ${T5} item5 #end
                    #if (${T6} != ""), final ${T6} item6 #end
                    #if (${T7} != ""), final ${T7} item7 #end
                    #if (${T8} != ""), final ${T8} item8 #end
                    #if (${T9} != ""), final ${T9} item9 #end )
		{

		if(  
            #if (${T1} != "") item1==null #end
            #if (${T2} != "")||item2==null #end
            #if (${T3} != "")||item3==null #end
            #if (${T4} != "")||item4==null #end
            #if (${T5} != "")||item5==null #end
            #if (${T6} != "")||item6==null #end
            #if (${T7} != "")||item7==null #end
            #if (${T8} != "")||item8==null #end
            #if (${T9} != "")||item9==null #end
		 )
			return illegalArgumentMonoError( "Input arguments must not be null." );
		else
			return monoOf_(
					#if (${T1} != "") item1 #end
                    #if (${T2} != ""),item2 #end
                    #if (${T3} != ""),item3 #end
                    #if (${T4} != ""),item4 #end
                    #if (${T5} != ""),item5 #end
                    #if (${T6} != ""),item6 #end
                    #if (${T7} != ""),item7 #end
                    #if (${T8} != ""),item8 #end
                    #if (${T9} != ""),item9 #end );


		// todo replace to real precondition-objects
		return SolidString.monoOf( item1 )
		          .then( SolidString.monoOf( item2 ) )
		          .then( monoOf_( 
						#if (${T1} != "") item1 #end
                        #if (${T2} != ""),item2 #end
                        #if (${T3} != ""),item3 #end
                        #if (${T4} != ""),item4 #end
                        #if (${T5} != ""),item5 #end
                        #if (${T6} != ""),item6 #end
                        #if (${T7} != ""),item7 #end
                        #if (${T8} != ""),item8 #end
                        #if (${T9} != ""),item9 #end
		           		) );

		}


	/**
	 * Fabric method for creating objects wrapped into Try.
	 * 
	 * For example, if this class is a precondition object and you need to check it and then pass it to the input of another object of the subject domain
	 * This method is supposed to be used when you need to get an error immediately (not lazily),
	 * for example, if the message is immediately returned to the user UI and not wait
	 * when, for example at night, lazy processing occurs and a user error is detected
	 *
	 * @return the Try with Success or Failure inside
	 */
	public static Try<${NAME}> tryOf( 
            #if (${T1} != "")  final ${T1} item1 #end
            #if (${T2} != ""), final ${T2} item2 #end
            #if (${T3} != ""), final ${T3} item3 #end
            #if (${T4} != ""), final ${T4} item4 #end
            #if (${T5} != ""), final ${T5} item5 #end
            #if (${T6} != ""), final ${T6} item6 #end
            #if (${T7} != ""), final ${T7} item7 #end
            #if (${T8} != ""), final ${T8} item8 #end
            #if (${T9} != ""), final ${T9} item9 #end )
		{
		return tryFromMono( monoOf( 
		    #if (${T1} != "") item1 #end
            #if (${T2} != ""),item2 #end
            #if (${T3} != ""),item3 #end
            #if (${T4} != ""),item4 #end
            #if (${T5} != ""),item5 #end
            #if (${T6} != ""),item6 #end
            #if (${T7} != ""),item7 #end
            #if (${T8} != ""),item8 #end
            #if (${T9} != ""),item9 #end
		 ) );
		}



 	/**
	 * <pre>
	 * Classic fabric method for creating  ${NAME}.
	 * This factory method is prohibited because it is intended only for easy creation of objects in tests
	 *
	 
	 * @throws IllegalArgumentException if the input arguments do not satisfy the preconditions
	 * @deprecated please use pure functional methods monoOf.., without raise exceptions. </pre>
	 */
	@Deprecated
	public static ${NAME} of( 
            #if (${T1} != "")  final ${T1} item1 #end
            #if (${T2} != ""), final ${T2} item2 #end
            #if (${T3} != ""), final ${T3} item3 #end
            #if (${T4} != ""), final ${T4} item4 #end
            #if (${T5} != ""), final ${T5} item5 #end
            #if (${T6} != ""), final ${T6} item6 #end
            #if (${T7} != ""), final ${T7} item7 #end
            #if (${T8} != ""), final ${T8} item8 #end
            #if (${T9} != ""), final ${T9} item9 #end )
		{
		return monoOf( 
                #if (${T1} != "") item1 #end
                #if (${T2} != ""),item2 #end
                #if (${T3} != ""),item3 #end
                #if (${T4} != ""),item4 #end
                #if (${T5} != ""),item5 #end
                #if (${T6} != ""),item6 #end
                #if (${T7} != ""),item7 #end
                #if (${T8} != ""),item8 #end
                #if (${T9} != ""),item9 #end ).block();
		}
		





//</editor-fold>

//<editor-fold desc="using and outstanding preconditions">




	/**
	 * Create ${NAME} from precondition-objects
	 * Only the monoOf.. factory methods is allowed, because it allows you to lazily create objects only with a real subscription
	 *
	 			 - in order not to do the same checks all the time, they are placed in special objects-preconditions. 
 				Thus, if such an object is transferred to the input, then we know that it always contains the correct data. 
 				Nevertheless, for convenience, methods accepting simple parameters are available, then they internally use the same precondition objects for verification


	 *
	 * @return the Mono with lazyli created object
	 *
	 * @implNote to create objects, this method calls the private factory monoOf_
	 			 to verify objects, this method uses precondition-objects
	 */
	public static Mono<${NAME}> monoOfPreconditions ( SolidString precondition1 ,
	                                      			  SolidString precondition2 )
		{
##		if( precondition1 == null || precondition2 == null )
##			return illegalArgumentMonoError( "Input precondition-objects must not be null." );
##		else 
##			return zip( precondition1 , precondition2 ).flatMap( t -> monoOf_( t.getT1().getString() , t.getT2().getString() ));
		// todo replace to real precondition-objects
		return  monoOf_( precondition1.getString() , precondition2.getString() );	
		}
		
	
	
	
	

		

//</editor-fold>


	
//<editor-fold desc="object to tuple conversions">

	/** Create Tuple from ${NAME}  
	 * The method is necessary for pattern matching in vavr
	 * The method helps with conversion operations ${NAME}-&gt;Tuple 
	 
	  <pre>{@code
	 String rez = Match( m ).of( Case( ${NAME}( $( "vova" ) , $() ) ,
                                  ( x , y ) -> "man " + x + y ) ,
                            Case( $() ,
                                  "defaultt" ) );
        }</pre>

	    - you need add static import to method with pattern matching
	    #if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")import static ${PACKAGE_NAME}.${NAME}Patterns.*;#end
	*/
    @Unapply
	public static Tuple#if (${T9} != "")9
                #elseif (${T8} != "")8 
                #elseif (${T7} != "")7 
                #elseif (${T6} != "")6 
                #elseif (${T5} != "")5 
                #elseif (${T4} != "")4 
                #elseif (${T3} != "")3 
                #elseif (${T2} != "")2 
                #elseif (${T1} != "")1#end
        <
        #if (${T1} != "")   ${T1} #end
        #if (${T2} != "") , ${T2} #end
        #if (${T3} != "") , ${T3} #end
        #if (${T4} != "") , ${T4} #end
        #if (${T5} != "") , ${T5} #end
        #if (${T6} != "") , ${T6} #end
        #if (${T7} != "") , ${T7} #end
        #if (${T8} != "") , ${T8} #end
        #if (${T9} != "") , ${T9} #end
        >	
	    ${NAME}( ${NAME} object )
		{
		return Tuple.of(
                #if (${T1} != "")  object.getItem1()#end
                #if (${T2} != ""), object.getItem2()#end
                #if (${T3} != ""), object.getItem3()#end
                #if (${T4} != ""), object.getItem4()#end
                #if (${T5} != ""), object.getItem5()#end
                #if (${T6} != ""), object.getItem6()#end
                #if (${T7} != ""), object.getItem7()#end
                #if (${T8} != ""), object.getItem8()#end
                #if (${T9} != ""), object.getItem9()#end
		 		);
		 		
		}

	/**
	 * Create ${NAME} from Mono (with Tuple inside)
	 * The method helps chaining flows together
	 *
	 * @param tuple
	 * 	the tuple
	 *
	 * @return the Mono with lazyly created object
	 */
	public static Mono<${NAME}> monoOfMono(
				Mono<Tuple#if (${T9} != "")9
                #elseif (${T8} != "")8 
                #elseif (${T7} != "")7 
                #elseif (${T6} != "")6 
                #elseif (${T5} != "")5 
                #elseif (${T4} != "")4 
                #elseif (${T3} != "")3 
                #elseif (${T2} != "")2 
                #elseif (${T1} != "")1#end
			        <
			        #if (${T1} != "")   ${T1} #end
                    #if (${T2} != "") , ${T2} #end
                    #if (${T3} != "") , ${T3} #end
                    #if (${T4} != "") , ${T4} #end
                    #if (${T5} != "") , ${T5} #end
                    #if (${T6} != "") , ${T6} #end
                    #if (${T7} != "") , ${T7} #end
                    #if (${T8} != "") , ${T8} #end
                    #if (${T9} != "") , ${T9} #end
                                        >>	 tuple )
		{
		if( tuple == null )
			return illegalArgumentMonoError( "Input Mono must not be null." );
		else
			return tuple.flatMap( ${NAME}::monoOfTuple );
		}

	/**
	 * Create Mono (with ${NAME} inside) from Tuple
	 * The method helps with conversion operations Tuple-&gt;${NAME}
	 *
	 *
	 * @return the Mono with lazyli created object
	 */
	public static Mono<${NAME}> monoOfTuple( 
				Tuple#if (${T9} != "")9
                #elseif (${T8} != "")8 
                #elseif (${T7} != "")7 
                #elseif (${T6} != "")6 
                #elseif (${T5} != "")5 
                #elseif (${T4} != "")4 
                #elseif (${T3} != "")3 
                #elseif (${T2} != "")2 
                #elseif (${T1} != "")1#end
			        <
			        #if (${T1} != "")   ${T1} #end
                    #if (${T2} != "") , ${T2} #end
                    #if (${T3} != "") , ${T3} #end
                    #if (${T4} != "") , ${T4} #end
                    #if (${T5} != "") , ${T5} #end
                    #if (${T6} != "") , ${T6} #end
                    #if (${T7} != "") , ${T7} #end
                    #if (${T8} != "") , ${T8} #end
                    #if (${T9} != "") , ${T9} #end
			        >	 tuple )
		{
		if( tuple == null )
			return illegalArgumentMonoError( "Input tuple must not be null." );
		else
			return TupleUtils.function( ${NAME}::monoOf )
			                 .apply( tuple );
		}

	/**
	 * Standard shallow copy factory
	 *
	 * @param other
	 * 	the other object 
	 *
	 * @return the Mono with lazyli created object
	 *
	 * @implNote to create objects, this method calls the private factory monoOf_
	 */
	public static Mono<${NAME}> copyOf( final ${NAME} other )
		{
		return monoOf_( 
				#if (${T1} != "")  other.getItem1()#end
                #if (${T2} != ""), other.getItem2()#end
                #if (${T3} != ""), other.getItem3()#end
                #if (${T4} != ""), other.getItem4()#end
                #if (${T5} != ""), other.getItem5()#end
                #if (${T6} != ""), other.getItem6()#end
                #if (${T7} != ""), other.getItem7()#end
                #if (${T8} != ""), other.getItem8()#end
                #if (${T9} != ""), other.getItem9()#end
		  );
		}




//</editor-fold>


//<editor-fold desc="builder pattern">

// todo Please delete methods: monoOf, of, tryOf, monoOfPreconditions,copyOf,monoOfTuple,monoOfMono  OR delete the builder

     /**
	 * <pre>
	 * Classic builder patterns for creating  ${NAME}.
       </pre>
	 */
	public static Builder builder()
		{
		return new ${NAME}.Builder();
		}
		

public static final class Builder
		{
		
        #if (${T1} != "")
            private  ${T1} item1;
        #end
        
        #if (${T2} != "")
             private  ${T2} item2;
        #end
        
        #if (${T3} != "")
             private  ${T3} item3;
        #end
        
        #if (${T4} != "")
             private  ${T4} item4;
        #end
        
        #if (${T5} != "")
             private  ${T5} item5;
        #end
        
        #if (${T6} != "")
             private  ${T6} item6;
        #end
        
        #if (${T7} != "")
             private  ${T7} item7;
        #end
        
        #if (${T8} != "")
             private  ${T8} item8;
        #end
        
        #if (${T9} != "")
             private  ${T9} item9;
        #end
		
		
		Builder()
			{
			}
		
		/**
		If the number of parameters is more than 3, it is more convenient to use a Builder that allows you to group parameters and use a name for such a group of parameters. 
		This method represents such a group of parameters and accepts the same set of simple parameters as the precondition.
		*/
		public Builder precondition1( String item1 )
			{
			this.item1 = item1;
			return this;
			}
		
		/**
		If the number of parameters is more than 3, it is more convenient to use a Builder that allows you to group parameters and use a name for such a group of parameters. 
		This method represents such a group of parameters and accepts the same set of simple parameters as the precondition.
		*/		
		public Builder precondition2( String item2 )
			{
			this.item2 = item2;
			return this;
			}
			
			
         /**
         * Create ${NAME} from precondition-objects
         *
         * - in order not to do the same checks all the time, they are placed in special objects-preconditions.
         * Thus, if such an object is transferred to the input, then we know that it always contains the correct data.
          */
		public Builder precondition1( SolidString precondition1 )
			{
			this.item1 =  precondition1.getString();
			return this;
			}
		
        /**
         * Create ${NAME} from precondition-objects
         *
         * - in order not to do the same checks all the time, they are placed in special objects-preconditions.
         * Thus, if such an object is transferred to the input, then we know that it always contains the correct data.
          */		
		public Builder precondition2( SolidString precondition2 )
			{
			this.item2 =  precondition2.getString();
			return this;
			}
		
			
        #if (${T1} != "")
        public Builder item1( ${T1} item1 )
			{
			this.item1 = item1;
			return this;
			}
        #end
        #if (${T2} != "")
        public Builder item2( ${T2} item2 )
			{
			this.item2 = item2;
			return this;
			}
        #end
        #if (${T3} != "")
        public Builder item3( ${T3} item3 )
			{
			this.item3 = item3;
			return this;
			}
        #end
        #if (${T4} != "")
        public Builder item4( ${T4} item4 )
			{
			this.item4 = item4;
			return this;
			}
        #end
        #if (${T5} != "")
        public Builder item5( ${T5} item5 )
			{
			this.item5 = item5;
			return this;
			}
        #end
        #if (${T6} != "")
        public Builder item6( ${T6} item6 )
			{
			this.item6 = item6;
			return this;
			}
        #end
        #if (${T7} != "")
        public Builder item7( ${T7} item7 )
			{
			this.item7 = item7;
			return this;
			}
        #end
        #if (${T8} != "")
        public Builder item8( ${T8} item8 )
			{
			this.item8 = item8;
			return this;
			}
        #end
        #if (${T9} != "")
        public Builder item9( ${T9} item9 )
			{
			this.item9 = item9;
			return this;
			}
        #end





		
			/**
             * Create ${NAME} from simple arguments
             * Only the monoOf.. factory methods is allowed, because it allows you to lazily create objects only with a real subscription
        
                         - in order not to do the same checks all the time, they are placed in special objects-preconditions. 
                        Thus, if such an object is transferred to the input, then we know that it always contains the correct data. 
                        Nevertheless, for convenience, methods accepting simple parameters are available, then they internally use the same precondition objects for verification
        
        
             *
             * @return the Mono with lazyli created object
             *
             * @implNote to create objects, this method calls the private factory monoOf_
                         to verify objects, this method uses precondition-objects
	        */
		public final Mono<${NAME}> buildMono()
			{
			// todo replace to real precondition-objects
			return SolidString.monoOf( this.item1 )
		          .then( SolidString.monoOf( this.item2 ) )
		          .then( monoOf_( 
						#if (${T1} != "") item1 #end
                        #if (${T2} != ""),item2 #end
                        #if (${T3} != ""),item3 #end
                        #if (${T4} != ""),item4 #end
                        #if (${T5} != ""),item5 #end
                        #if (${T6} != ""),item6 #end
                        #if (${T7} != ""),item7 #end
                        #if (${T8} != ""),item8 #end
                        #if (${T9} != ""),item9 #end
		           		) );
			}
			
	    /**
         * <pre>
         * Classic builder pattern for creating  ${NAME}.
         * This factory method is prohibited because it is intended only for easy creation of objects in tests
         *
         
         * @throws IllegalArgumentException if the input arguments do not satisfy the preconditions
         * @deprecated please use pure functional methods monoOf.., without raise exceptions. 
         </pre>
         */
        @Deprecated
		public final ${NAME} build()
			{
			return buildMono().block();
			}
			
			
		/**
         * Builder pattern method for creating objects wrapped into Try.
         * 
         * For example, if this class is a precondition object and you need to check it and then pass it to the input of another object of the subject domain
         * This method is supposed to be used when you need to get an error immediately (not lazily),
         * for example, if the message is immediately returned to the user UI and not wait
         * when, for example at night, lazy processing occurs and a user error is detected
         *
         * @return the Try with Success or Failure inside
         */
        public final Try<${NAME}> buildTry()
                        {
                        return tryFromMono( buildMono() );
                        }
			
			
			
			
		}
		


//</editor-fold>
	
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//  add your own methods                              
	//////////////////////////////////////////////////////////////////////////////////
	
    //<editor-fold desc=".">
	/*
	 *
	 * - в немутабельных классах используется функциональный подход:
	 * - операции немутабельного класса могут возвращать новый немутабельный объект
	 * например врзвращать немутабельный объект того же класса
	 *
	 *
	 *
	 *
	 * 2) количество параметров должно быть не более 4-х, иначе:
	 * - разбить метод на несколько (как например в NEW-SET-CALL для каждого параметра отдельный сетер)
	 * - вынести группу параметров в value-класс (nested static) (helper class)
	 * - все параметры зашить в паттерн билдер, где параметры можно присваивать по-очереди (так что билдер применим и на мутабельном объекте)
	 *
	 *
	 *
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
	 *  три варианта проверки входного аргумента
	 *  1) @NonNull   от LOMBOK
	 *  2) notBlank(string) notEmpty(collection)
	 *  3) optional
	 *
	 *
	 * }</pre> ПОМНИ СГЕНЕРИТЬ JAVADOC MAC8+fixDocComment И УБРАТЬ ЭТОТ ТЕКСТ
	* */
	//</editor-fold>
	
	/**
	 * method f_method
	 * 
	 * <pre>{@code
	 *           TestMutGen v_obj = new TestMutGen("Test");
	 *           TestMutGen v_obj = new TestMutGen();
	 *            }</pre>
	
	 *
	 * @throws IllegalArgumentException
	 * 	if argument empty  or null
	 */
	public Optional<String> compute( final String string )
		{
		if( string == null || string.isBlank()   )
			{
			logAtWarning( "string param must not ne null or empty" );
			return Optional.empty();
			}
		
		log( "compute({})",string );
		
		return Optional.ofNullable( string );
		// todo postcondition check of output result
		}
		
		
	 
		
		
		
		
		
	}
