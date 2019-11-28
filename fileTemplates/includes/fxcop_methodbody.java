NAMING

-   временные переменные можно называть в одну букву
        - имена для чисел и итераторов: i,j,k,m,n
        - временные переменные имеют область видимости в несколько строк кода

-   локальные переменные можно именовать с префиксами
        - например v_


CONVENTIONS

-   рекомендуется несколько return в коде метода

-   нельзя возвращать null, верните вместо этого пустую коллекцию    

-   рекомендуется подумать про допустимость повторных вызовов метода
        - напрмиер,поставить в начале метода проверку на то что метод уже вызывался 


RETURN OPTIONAL


RETURN COLLECTION

-   предпочитайте использовать немутабельные версии в возвращаемых значениях

-   рекомендуется создавать свои коллекции, наследуемые от базовых

-   нельзя возвращать null, верните вместо этого пустую коллекцию
        - тк пользователи будут ожидать объекта

-   предпочитайте использовать Map если если у элементов хранимых в коллекции есть уникальные ключи

-   коллекции, зависящие от внешних объектов, рекомендуется возвращать в виде копии
        - например файлы на диске представляют собой внешний объект
        - коллекцию, которая оперативно онлайн отслеживала бы изменения файлов на диске трудно или невозможно реализовать

   