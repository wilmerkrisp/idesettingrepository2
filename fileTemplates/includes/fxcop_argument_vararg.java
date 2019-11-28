NAMING

-   название аргумента должно быть во множественном числе


CONVENTIONS

(1) если юзеры передают массивы с небольшим количеством элементов то их лучше оформлять vararg
        - а если юзеры будут передавать много элементов то vararg тоже подойдет
        
(2) следует заменить более 3-х однотипных параметра на vararg     
        - например (object1,object2,object3,object4) на (... objects)
        - все параметры имеют один и тот же тип
        - если параметры отличаются только числовым суффиксом
        - если у метода еще нет перегруженной версии принимающей на вход массив
        
(3) метод с vararg, наоборот можно перегрузить методами с разными количествами параметров 
        - для того чтобы обеспечить более высокую скорость
        - например добавить к методу    of(E... elements)
                                        of(E e1)
                                        of(E e1, E e2)
                                        ...
                                        of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10)

-   если юзеры почти всегда на вход передают массив то vararg не рекомендуется
 
-   следует проверять vararg аргумент !=null и вызывать эксепшн
 
РАСШИРЯЕМОСТЬ 
    
-   рекомендуется параметры типа массив переносить в конец, чтобы оставлять возможность в будущем сделать из низ vararg
    
-   методы с vararg могут прегружаться, методом уже без того-же vararg
        - например, method(String param1,String ...objects)
                    method(String param1,String[]  objects, String param2)
    