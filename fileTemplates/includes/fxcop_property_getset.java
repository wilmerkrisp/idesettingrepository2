NAMING

-   ВСЕ правила актуальны только для public членов
        - для private свойств следует использовать суффикс _
        
-   имена свойств начинаются с маленькой буквы, верблюжий стиль

-   в двубуквенных акронимах обе первых буквы маленькие
        - например ioStream

-   для имени свойства использовать существительные, именные группы или прилагательное

-   следует называть свойство в утвердительной форме 
        - например CanSeek вместо CantSeek

-   действительный залог лучше чем страдательный
        - CanSeek вместо IsSeekable
        
-   ?рекомендуется давать свойствам то же название что и их типам
        - например Color color
        - это экономит значимые имена
        
-   не использовать префикс get set для имени свойства, а только для имени метода

-   префикс numberOf для переменных представлющих количество объектов
        - не использовать префикс N Num

-   использовать суффикс No для обозначения переменных представляющих номер сущности
        - примеры: tableNo, employeeNo




CONVENTIONS

-   tf: под свойствами понимаются private  поля выставленные с помощью сеттеров/геттеров
        - все поля должны быть private, никогда не следует выставлять поля как public
        - под полем подразумевается свойство класса

-   простые свойства создавать только для чтения (final и только геттер), если прога не должна менять значение свойств
        - под простыми имеются ввиду немутабельные value-типы (не ссылочные типы)
        - но если в свойстве содержится мутабельный тип, то выставление только геттера не поможет, тк сам тип можно поменять

-   нельзя выставлять для свойства только сеттер
        - нужно для пары также выставить паблик геттер    

-   нужно все равно сохранять значение даже если сетер вызывает исключение
        - те даже если данное свойство не прошло проверку в сетере то все равно его установить, или сохранить значение в другое место

-   нельзя вызывать исключения из гетеров
        - гетеры должны быть простыми операциями и не должны иметь постусловий
        - если он может вызывать исключение то его следует сделать методом
       
-   долгие операции должны быть методом а не свойством
        - например выполняющие доступ к сети или файлам 
        - свойства используются для простого доступа к простым данным с простыми вычислениями

-   следует использовать свойство если логически по смыслу это атрибут типа
     

        

ПАТТЕРН NEW-SET-CALL В МУТАБЕЛЬНЫХ КЛАССАХ

- это такой паттерн в котором класс проектируется с
	- с дефолтным или относительно простым конструктором
	- большим количеством свойств задаваемых через сеттеры
	- и последующему вызову простых методов экземпляра класса без аргументов или малым количеством аргументов

1)  данный паттерн подразумевает 
        - задание большого количества свойств объекта управляющих семантикой вызовов методов, причем можно устанавливать каждое свойство отдельно
        - и небольшое количество параметров в самих методах
        
-   методы должны предоставлять действия и свойства данные для этих действий

2)  недостаток в том что нельзя использовать метод параллельно, сам объект можно использовать только для одного запроса тк параметры задаются свойствами объекта

3)  плюс в том что может быть одна версия метода работающая с разным набором свойств, в зависимости от того какие свойства заданы
        - для юзеров важно что методы простые тк значительно труднее изучить назначение каждого параметра метода

-   следует всем свойствам давать значения по умолчанию
        - тк у юзера должна быть возможность вызывать методы объекта созданного дефолтным конструктором без параметров

4)  с каждой новой возможностью можно лишь добавить новое свойство а метод оставить тем же (внутри он будет учитывать эту новую возможность)
        
-   cледует давать возможность задавать свойства в любом порядке
        - это может привести к проблемам в виде недопустимого состояния объекта при вызове метода
        - выгоды этого паттерна превышают эти недостатки (при использовании в основных сценариях для юзеров главное это удобство и простота использования)
        - проблемы должны быть смягчены исключениями/сообщениями об ошибках в методах

-   следует проверять целостность состояния объекта уже в CALL-методах

-   свойства обеспечивают естественную возможность самодокументирования 

-   компоненты должны главным образом полагаться на свойства и составные части как средства изменения их поведения



ПАТТЕРН NEW-CALL В неМУТАБЕЛЬНЫХ КЛАССАХ

- это такой паттерн в котором класс проектируется с
	- сложными методами которым передается большое количество параметров при вызовах

1)  данный паттерн подразумевает 
        - задание большого количества параметров в методах, причем все параметры следует заполнять сразу все при каждом вызове
        - и небольшое количество свойств объекта

2)  плюс в том что можно вызывать такие методы  паралельно

3)  минус в том что при данном паттерне получается большое количество перегруженных методов

4)  и с каждой новой возможностью вы добавляете все больше перегрузок метода

-   операции преобразования и трансформации лучше делать методами с параметрами

    