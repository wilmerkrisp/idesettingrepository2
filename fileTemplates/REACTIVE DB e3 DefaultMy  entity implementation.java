#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;



#parse("File Header.java")

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


//<editor-fold desc=".">
/*

@Data означает
    @ToString, 
    @EqualsAndHashCode,
    @Getter
    @Setter 
    @RequiredArgsConstructor



возможные аннотации для R2DBC
    @Id: Applied at the field level to mark the primary used for identity purpose.
    @Table: Applied at the class level to indicate this class is a candidate for mapping to the database. You can specify the name of the table where the database will be stored.
    @Transient: By default all private fields are mapped to the row, this annotation excludes the field where it is applied from being stored in the database
    @PersistenceConstructor: Marks a given constructor - even a package protected one - to use when instantiating the object from the database. Constructor arguments are mapped by name to the key values in the retrieved row.
    @Column: Applied at the field level and described the name of the column as it will be represented in the row thus allowing the name to be different than the fieldname of the class.




#if(${forInheriatance}=="")
  - класс сделан final тк класс изначально не предназначался для наследования
 #else
 - этот тип предназанчен для наследования
 
 Конструкторы класса не должны вызывать переопределяемые методы, непосредственно или опосредованно.
    Нарушение этого правила может привестик аварийному завершению программы.
    Тк Конструктор суперкласса выполняется прежде конструктора подкласса,
 
 в джавадоке (в тегах @implSpec  @implNote ) нужно раскрыть детали реализации методов и указать какие из переопределяемых методов он использует сам
    тк наследование нарушает инкапсуляцию
    например, чтобы юзер знал что некоторый добавленный в overrided методы функционал  может сработать два раза (в случае когда AddAll вызывает Add)
 #end
 
 
 i) если нужно закешировать свойство то пометить его аннотацией
  @Getter( lazy=true)

j) для игнорирования свойства, назвать его с $
   String $ item2
   
*/
//</editor-fold>
  
  
/**<pre>
  * simple mutable class: ${ID} ${T2} ${T3} ${T4} ${T5} ${T6} ${T7} ${T8} ${T9}
 *
 *      - pattern new-set-call
  #if(${forInheriatance}=="") - not for inheritance #else - FOR inheritance #end
  
 *
 *  {@code
 *    //pattern new-set-call
 *    ${NAME} o = new ${NAME}();
      o.setItem2("a");
      o.compute();  
 *    }
 
* Preconditions: 	none
* Postconditions:	none
* Side effects:		none
* Tread safety:		Not thread-safe
 </pre>
 *
 
 */
 
 


@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Table
public #if(${forInheriatance}=="") final #end class ${NAME}
  {
  
    #parse("loglombok.java")





#if (${ID} != "")
    /** id
   *
   -- SETTER --
   @param id
   id
   *
   -- GETTER --
   @return the id
   * */
  @Id
  private ${ID} id;
#end


#if (${T2} != "")
    /** item2
   *
  -- SETTER --
    @param item2
    item2
   *
   -- GETTER --
   @return the item2
   * */
  private ${T2} item2;
#end


#if (${T3} != "")
    /** item3
   *
   -- SETTER --
    @param  item3
    item3
   *
   -- GETTER --
   @return  the item3
   * */
  private ${T3} item3;
#end


#if (${T4} != "")
    /** item4
   *
   -- SETTER --
    @param  item4
    item4
   *
   -- GETTER --
   @return  the item4
   * */
  private ${T4} item4;
#end


#if (${T5} != "")
    /** item5
   *
   -- SETTER --
   @param   item5
   item5
   *
   -- GETTER --
   @return  the item5
   * */
  private ${T5} item5;
#end


#if (${T6} != "")
    /** item6
   *
   -- SETTER --
   @param   item6
   item6
   *
   -- GETTER --
   @return  the item6
   * */
  private ${T6} item6;
#end


#if (${T7} != "")
    /** item7
   *
   -- SETTER --
    @param  item7
    item7
   *
   -- GETTER --
   @return  the item7
   * */
  private ${T7} item7;
#end


#if (${T8} != "")
    /** item8
   *
   -- SETTER --
   @param   item8
   item8
   *
   -- GETTER --
   @return  the item8
   * */
  private ${T8} item8;
#end


#if (${T9} != "")
    /** item9
   *
   -- SETTER --
   @param   item9
   item9
   *
   -- GETTER --
   @return  the item9
   * */
  private ${T9} item9;
#end
 
 

  
  //////////////////////////////////////////////////////////////////////////////////
  //  add your own methods
  //////////////////////////////////////////////////////////////////////////////////   
/*
      *  1) no method args, because all inside props
 *
 *  2) количество параметров должно быть не более 4-х, иначе:
 *    - разбить метод на несколько (как например в NEW-SET-CALL для каждого параметра отдельный сетер)
 *    - вынести группу параметров в value-класс (nested static) (helper class)
 *    - все параметры зашить в паттерн билдер, где параметры можно присваивать по-очереди (так что билдер применим и на мутабельном объекте)
 *
   
   */

    
    
   #if(${forInheriatance}=="")
    
   /**
   * Check consistency.
   
   *  @implSpec Method depends on isConsistent()
   *
   *  @throws IllegalStateException
   *      if some object's property null or empty
   */
  public final void checkConsistency()
    {
    if(!isConsistent())
      throw new IllegalStateException();
    }
  
  
  
  /**
   * Check consistency.
   *
   * @return false  if some object's property null or empty
   */
  public final boolean isConsistent()
    {
        #if (${ID} != "") if( getId()==null ) return false;  #end
    #if (${T2} != "") if( getItem2()==null ) return false;  #end
    #if (${T3} != "") if( getItem3()==null ) return false;   #end
    #if (${T4} != "") if( getItem4()==null ) return false;   #end
    #if (${T5} != "") if( getItem5()==null ) return false;   #end
    #if (${T6} != "") if( getItem6()==null ) return false;   #end
    #if (${T7} != "") if( getItem7()==null ) return false;   #end
    #if (${T8} != "") if( getItem8()==null ) return false;   #end
    #if (${T9} != "") if( getItem9()==null ) return false;   #end
        return true;
    }
        
        
  
  /**
   * Compute optional.
   *
   
       * <pre>{@code
   *           var o=compute("string");
   *  }</pre>
   
   * @param string
   *  the string
   *
   * @return empty value if input argument empty (or if one collection's element is empty)
   *
   * @throws IllegalStateException
   *  if some object's property null or empty
   */
    public final Optional<String> compute(final String string )
            {
          if( string == null || string.isBlank() || !isConsistent() )
                {
                logAtWarning_( "string param must not ne null or empty" );
                return Optional.empty();
                }
                
        log_( "compute({})",string );
    
        return Optional.ofNullable( string );
            }
    
    #else
        
        
     
     
      
        /**
         * Check consistency.
         
         *  @implSpec Method - is a wrapper for inner checkConsistency_())
         *
         *  @throws IllegalStateException
         *      if some object's property null or empty
         */
      public void checkConsistency()
            {
            checkConsistency_();
            }
         
         /**
         * Check consistency.
         
         *  @implSpec Method - is a wrapper for inner isConsistent_())
         *
         * @return false  if some object's property null or empty
         */  
      public boolean isConsistent()
            {
            return isConsistent_();
            }            
            
              

  private  void checkConsistency_()
    {
    if(!isConsistent_())
      throw new IllegalStateException();
    }
  
  

  private  boolean isConsistent_()
    {
    #if (${ID} != "") if( getId()==null ) return false;  #end
    #if (${T2} != "") if( getItem2()==null ) return false;  #end
    #if (${T3} != "") if( getItem3()==null ) return false;   #end
    #if (${T4} != "") if( getItem4()==null ) return false;   #end
    #if (${T5} != "") if( getItem5()==null ) return false;   #end
    #if (${T6} != "") if( getItem6()==null ) return false;   #end
    #if (${T7} != "") if( getItem7()==null ) return false;   #end
    #if (${T8} != "") if( getItem8()==null ) return false;   #end
    #if (${T9} != "") if( getItem9()==null ) return false;   #end
        return true;
    } 
            
            
        
        /**
        *   Compute optional.
    
    
         * <pre>{@code
   *           var o=compute("string");
   *  }</pre>
        
        * @param string
      *   the string
  
   
        * @implSpec !CHANGE_ME_DESCRIPTION!: The method does'not call other public methods.
        * @implNote в джавадоке нужно раскрыть детали реализации методов
                    и указать какие из переопределяемых методов он использует сам
                    
                    здесь используется ПАТТЕРН PIRIVATE/FINAL HELPER МЕТОДОВ ВЫЗЫВАЮЩИХСЯ ИЗ МЕТОДОВ (КОТОРЫЕ БУДУТ ПЕРЕОПРЕДЕЛЯТЬСЯ)
                        - используются в классах спроектированных для наследования, чтобы детали реализации не утекли в подклассы
                        - в классе для наследовния используйте helper method'ы
                            - для каждого открытого метода создайте закрытый аналог(helper method)
                            - внутри каждого открытого метода должны быть только вызовы зарытых аналогов
                            - helper method'ы должны вызывать только друг друга, а не открытые методы чтобы избежать вызова отнаследованного класса
        
        
        @return empty value    if input argument empty 
                        if one collection's element is empty
                        if object's state inconsistent
        */
    
        public Optional<String> compute(final String string )
            {
            if( string == null || string.isBlank() || !isConsistent() )
                {
                logAtWarning( "string param must not ne null or empty" );
                return Optional.empty();
                }
            
            log( "compute({})",string );
    
            return compute(string);
            // todo postcondition check of output result
            }
    
       private Optional<String> compute_(final String string )
            {
            //assert !(string==null || string.isBlank()):"Please put not blank string";
         
            return Optional.ofNullable( string );;
            }
      
            
      
    #end
    
    
    
    
    
  }
