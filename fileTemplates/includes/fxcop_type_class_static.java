NAMING


CONVENTIONS

-   используются для хранения методов расширения или функций для которых нет полностью объектной обертки
        - нельзя использовать как разнородный набор дополнений, должна быть четкая концепция расположенных в нем методов

-   рекомендуется использовать только как вспомогательные классы для объектно-ориентированного ядра инфраструктуры
    
-   все свойства и методы должны быть статическими
        - не должно быть членов

-   нельзя создавать объекты такого класса, может быть только один экземпляр-класса
        - сделать private дефолтный конструктор
        - не должно быть других public или protected конструкторов    
    
-   статик свойства и методы нельзя наследовать 
        - нужно пометить явно такой класс final
        - также методы могу пометить как final

JAVA

-   в джава чисто статическими могут быть только nested static классы        