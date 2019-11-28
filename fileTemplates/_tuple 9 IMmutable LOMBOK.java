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
 *      - pattern new-call
 *      - not for inheritance
 *
 * {@code
    //pattern new-call
 * 	  var  o = ${NAME}.of("Test");
 * 	  var o = ${NAME}.<String, String>builder().item1("f").build();
      var b=o.compute();
  }
  
* Preconditions: 	none
* Postconditions:	none
* Side effects:		none
* Tread safety:		Immutable
  
  </pre>
 *
 
  Every constructor/fabric can raise the exceptions:
 throws NullPointerException if argument nullable
 throws IllegalArgumentException if argument empty 
 
 */
 
  

@Value
@AllArgsConstructor(staticName = "of")
@Builder(toBuilder = true)
@Slf4j
@Patterns /*pattern matching in vavr*/
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
	 */@NonNull
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
	 */@NonNull
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
	 @NonNull
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
	 */@NonNull
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
	 @NonNull
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
	 @NonNull
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
	 @NonNull
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
	 @NonNull
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
	 @NonNull
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
	 @NonNull
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
	 */@NonNull
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
	 @NonNull
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
	 @NonNull
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
	 @NonNull
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
	 @NonNull
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
	 @NonNull
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
	 @NonNull
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
	 @NonNull
	    private final ${T9} item9;
	#end
#end
 


	/*
	pattern matching in vavr
	
	    - you need add static import to method with pattern matching
	    #if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")import static ${PACKAGE_NAME}.${NAME}Patterns.*;#end
	*/
    @Unapply
	static Tuple#if (${T9} != "")9
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
		}
		
		
	 
		
		
		
		
		
	}
