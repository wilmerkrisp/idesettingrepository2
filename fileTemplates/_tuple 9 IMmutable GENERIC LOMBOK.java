#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end




import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Singular;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import lombok.NonNull;

import java.util.Comparator;
import com.google.common.collect.ComparisonChain;

import java.util.List;

#parse("File Header.java")
 
 
//<editor-fold desc=".">
 /*
     @Value означает
        @ToString 
        @EqualsAndHashCode 
        @AllArgsConstructor
        @FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE) 
        @Getter
        
        
        
     d) IDE autogenerated Guava ComparisonChain, в сгенерированном методе compareTo необходимо заменить:
		                      .compare((Comparable<?>) this.item1 ,
		                               (Comparable<?>) that.item1 
		                                                                
		                                
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
  * generic immutable class: ${T1} ${T2} ${T3} ${T4} ${T5} ${T6} ${T7} ${T8} ${T9}
 *
 *      - pattern new-call
 *      - not for inheritance
 *
 * {@code
    //pattern new-call
 * 	  var  o = ${NAME}.of("Test");
 * 	  var o = ${NAME}.builder().item1("f").build();
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
public final class ${NAME} <
    #if (${T1} != "")   T1 #end
    #if (${T2} != "") , T2 #end
    #if (${T3} != "") , T3 #end
    #if (${T4} != "") , T4 #end
    #if (${T5} != "") , T5 #end
    #if (${T6} != "") , T6 #end
    #if (${T7} != "") , T7 #end
    #if (${T8} != "") , T8 #end
    #if (${T9} != "") , T9 #end
>	
implements Comparable< ${NAME}  > 
	{
	
    #parse("loglombok.java")



#if (${T1} != "")
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
	@NonNull	
    private final T1 item1;
#end

#if (${T2} != "")
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
	@NonNull	
	private final T2 item2;
#end

#if (${T3} != "")
	/**
	 * item3
	 *
	  -- SETTER --
	 @param item3
	  	item3
	 @return item3
	 
	-- GETTER --
	 @return item3
	the item3
	 */
	@NonNull	
	 private final T3 item3;
#end

#if (${T4} != "")
	/**
	 * item4
	 *
	  -- SETTER --
	 @param item4
	  	item4
	 @return item4
	 
	 -- GETTER --
	 @return item4
	  the item4
	 */
	@NonNull	
	private final T4 item4;
#end

#if (${T5} != "")
	/**
	 * item5
	 *
	  -- SETTER --
	 @param item5
	  	item5
	 @return item5
	 
	 -- GETTER --
	 @return item5
	  the item5
	 */
	@NonNull	
	private final T5 item5;
#end

#if (${T6} != "")
	/**
	 * item6
	 *
	  -- SETTER --
	 @param item6
	  	item6
	 @return item6
	 
	 -- GETTER --
	  @return item6
	  the item6
	 */
	@NonNull	
	private final T6 item6;
#end

#if (${T7} != "")
	/**
	 * item7
	 *
	  -- SETTER --
	 @param item7
	  	item7
	 @return item7
	 
	-- GETTER --
	@return item7
	the item7
	 */
	@NonNull	
	private final T7 item7;
#end

#if (${T8} != "")
	/**
	 * item8
	 *
	  -- SETTER --
	 @param item8
	  	item8
	 @return item8
	 
	 -- GETTER --
	 @return item8
	  the item8
	 */
	@NonNull	
	    private final T8 item8;
#end

#if (${T9} != "")
	/**
	 * item9
	 *
	  -- SETTER --
	 @param item9
	  	item9
	 @return item9
	 
	-- GETTER --
	@return item9
	 the item9
	 */
	@NonNull	
	    private final T9 item9;

#end
 



	
	 
	
	
    

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