#if(${uncomment1}==1)
//<editor-fold desc="clone object">
/*   

!!ПОЖАЛУЙСТА ПЕРЕПИШИТЕ ЭТОТ МЕТОД НА ГЛУБОКОЕ КОПИРОВАНИЕ
!!ДЛЯ ТИПОВ-ГЕНЕРИКОВ ПОЖАЛУЙСТА ПЕРЕПИШИТЕ ЭТОТ МЕТОД ДЛЯ ГЕНЕРИКОВ

ПЕРЕОПРЕДЕЛЕНИЕ МЕТОДА CLONE

-   следует просто переопределить метод clone но не писать implements Cloneable
        - тк по этому маркерному интерфейсу юзеры не поймут глубокая это копия или поверхностная
                    
-   следует явно написать в JavaDoc что это глубокая или поверхностная копия    
    
-   типы копирования
        1)  глубокое копирование, копирует объект и рекурсивно те все объекты в графе
        2)  поверхностное копирование, копирует только часть графа 
        
*/
//</editor-fold>
#end

/**
 * method copy deep
 *
 *
 * <pre>{@code
 *
 *
 * example 1
 *
 *           ${NAME} v_obj1 = new ${NAME}("param");
 *           ${NAME} v_obj2 = v_obj1.clone();
 *
 *
 *
 * }</pre>
 */
public final ${NAME} clone()
    {
    return new ${NAME}( this );
    }    
    