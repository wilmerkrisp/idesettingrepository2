NAMING

-   ВСЕ правила актуальны только для public членов
        - для private методов следует использовать суффикс _
        
-   имена методов начинаются с маленькой буквы, верблюжий стиль

-   методы именуются глагольными фразами
        - первое слово можно сделать глаголом в активной форме
        - таким образом методы отличаются от названий типов - существительных

-   названия методов и свойств должно быть длинным, описательным и подробным
        - тк сейчас такие идентификаторы все равно набираются автозавершениемм ввода
        - именовать в соответствии с решаемой задачей, а не деталями реализации

-   стандартные префиксы имен методов:
        - compute означает что операция долго вычисляется и кешируется
        - find означает что это простой метод поиска с минимальным количеством вычислений
        - initialize означает что устанавливается объект/концепция

-   имя метода не должно включать имя типа
        - тк это избыточно и тип и так виден
        - например line.getLength()  а не line.getLineLength();

-   булевы свойства и функции должны иметь смысл в качестве английской фразы
        - например if(collection.Contains(item) лучше чем if(collection.IsContained(item))  
        - например if(expression.Matches(text) лучше чем if(expression.Match(text)

-   симметричные методы следует называть симметрично
        - get/set
        - add/remove
        - create/destroy 
        - start/stop
        - insert/delete
        - increment/decrement 
        - old/new 
        - begin/end 
        - first/last 
        - up/down 
        - min/max
        - next/previous 
        - old/new 
        - open/close 
        - show/hide 
        - suspend/resume 



CONVENTIONS

-   если метод только обеспечивает доступ к значению то вместо него должно быть свойство

-   операцию возвращающую внутреннее состояние лучше делать методом а не свойством
    
-   операция возвращающая каждый раз другой результат даже при неизменных параметрах  лучше делать методом а не свойством  
        - Например Guid.NewGuid() , DateTime.Now() 


    