### _Homework 02_
#### _task 01_
Написать программу, которая считает стоимость бензина (на вход программе передается кол-во литров, на выходе печатается стоимость).\
`Update:` Переделать задания со второго урока так, что бы взаимодействие с пользователем было через стандартный поток ввода (System.in).
#### _task 02_
Написать программу, которая считает зарплату «на руки» (на вход программе передается величина зарплаты, на выходе печатается зарплата за вычетом 13% (НДФЛ).\
`Update:` Переделать задания со второго урока так, что бы взаимодействие с пользователем было через стандартный поток ввода (System.in).
#### _task 03_
Написать программу, которая конвертирует секунды в часы.\
`Update:` Переделать задания со второго урока так, что бы взаимодействие с пользователем было через стандартный поток ввода (System.in).

### _Homework 03_
Создать консольное Java-приложение «Горячо-Холодно».
+ Вначале программа «загадывает» случайное число от 1 до 100;
+ Пользователь вводит с консоли число;
+ Программа говорит пользователю «горячо», если он приблизился к «загаданному» числу и «холодно», и позволяет ввести число еще раз, если введенное число дальше от загаданного, чем предыдущее;
+ Для первого ввода пользователя считаем предыдущим введенным числом 0;
+ Предусмотреть возможность выхода из игры до отгадывания числа.

### _Homework 04_
#### _task 01_
Написать программу для поиска минимального из двух чисел.
#### _task 02_
Написать программу, которая описывает введенное число. Отрицательное оно число или положительное (или нулевое), чётное или нечётное.
#### _task 03_
Написать программу для вывода на экран таблицы умножения
#### _task 04_
Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
### _Homework 06_
Используя полученные знания об объектно-ориентированном программировании смоделировать какую-нибудь предметную область. Например: банк, университет, библиотека, склад, магазин, пруд и т.д.

_Ограничения:_
+ Минимум 3 класса;
+ Наличие нескольких полей и методов;
+ Использование модификаторов доступа;
+ Использование принципов ООП.

### _Homework 07_
Реализовать программу «Вендинговый автомат», которая позволит:
+ Посмотреть меню напитков;
+ Внести деньги на внутренний счет;
+ Выбрать номер напитка и получить его, если на счету достаточно средств;

_Программа должна обрабатывать следующие ситуации:_
+ Пользователь не внес деньги;
+ Пользователь выбрал более дорогой напиток, чем внесено денег;
+ Пользователь выбрал несуществующий номер напитка;

Для хранения напитков предлагается использовать массив с enum. У напитка должна быть цена и название.

`Update:` Добавить в программу "Вендинговый автомат" журналирование событий, при этом стоит указать различные уровни логирования, как информационного уровня, так и предупреждения и ошибки. Настроить сбор логов в файл. Фреймворк логирования - на ваш выбор.

### _Homework 08_
#### _task 01_
Реализовать класс Calculator, который будет содержать статические методы для операций вычитания, сложения, умножения, деления и взятия процента от числа. Класс должен работать как с целыми числами, так и с дробями.
#### _task 02_
Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов. Написать метод для получения информации о количестве.
#### _task 03_
Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк). Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).

### _Homework 09_
+ Написать абстрактный класс `Animal` с абстрактным методом `getName`. Сделать несколько классов животных, наследников `Animal`. Метод `getName` должен выводит название каждого животного.
+ Написать интерфейсы `Fly`, `Run` и `Swim` чтобы в каждом было по одному методу. Добавить классам животных из предыдущего задания имплементацию этих интерфейсов. Некоторые животные могут реализовать больше одного интерфейса (утка может и плавать, и летать и бегать).
+ Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать» (в каждом сделать 1-2 метода). Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах.

### _Homework 11_
Напишите программу которая получает на вход некую строку, после она вызывает метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой» и выводит результат в консоль!

### _Homework 13_
Написать программу "Воспитанный ребенок".

Программа должна имитировать поведение воспитанного ребенка, которого мама кормит вкусной или невкусной едой. Если еда не нравится, ребенок ее не ест: выбрасывается исключительная ситуация, которая обрабатывается «мамой». Воспитанный ребенок, даже если еда не естся, в любом случае скажет «спасибо» и поцелует маму.

+ Создать перечисление «Еда» с несколькими вариантами еды: морковь, яблоко, каша и т.д;
+ Создать класс «ребенок» с методом «кушать», принимающий на вход некоторую еду. В методе происходит сравнение поступившей еды с вкусовыми предпочтениями и в случае если они не совпадают, выбрасывается исключение. «Одобренная» ребенком еда съедается: возвращается сообщение «съел … за обе щеки».
+ Вне зависимости съел ребенок еду или выплюнул, ребенок благодарит маму, печатая в консоль «спасибо, мама»;
+ Создать главный класс и метод `main` - это будет «Мама». «Мама» дает ребенку «еду» и обрабатывает исключения ребенка.

### _Homework 15_
#### _task 01_
Написать программу, которая будет создавать, переименовывать, копировать и удалять файл.
#### _task 02_
Написать рекурсивный обход всех файлов и подкаталогов внутри заданного каталога.\
`Дополнительное задание (необязательно)`: программа должна следить за глубиной рекурсии, сдвигая название файла/каталога на соответствующее количество пробелов.

### _Homework 17_
Есть набор объектов типа "Книга". Каждая книга имеет название, автора, год издания. Можно больше, по желанию.

Программа должна уметь:
+ Добавлять книгу в библиотеку;
+ Показывать список книг в библиотеке;
+ Восстанавливать содержимое библиотеки после перезапуска;
+ Показывать соответствующее сообщение в случае ошибок;

`Важно!`
+ Потоки обязательно должны закрываться;
+ Отсутствие файла на диске - не ошибка, а частный случай пустой библиотеки.

### _Homework 18_
Написать программу, которая копирует файл с одной кодировкой в файл с другой.

### _Homework 19_
Дан текстовый файл определенной структуры, в котором содержится информация о покупках.
Формат файла:
+ Название товара
+ Количество
+ Цена

Необходимо написать программу, которая выведет на экран чек, сформированный из этого файла. В чеке должна быть информация: `название товара:  цена Х кол-во = стоимость`. В конце отчета вывести итоговую стоимость.

### _Homework 20_
Есть набор бесплатных сервисов в интернете, предоставляющих данные в формате JSON:

https://github.com/toddmotto/public-apis/blob/master/README.md

Выбрать любой сервис, какой больше нравится, и написать программу, которая с ним взаимодействует.

+ Класс сериализуемого объекта может содержать не все поля, а только 2-3 ключевых. Например, для погоды достаточно показать диапазон температур.
+ Минимальное количество запросов к сервису - 1. Не обязательно реализовывать весь функционал, предоставляемый сервисом. Достаточного одного любого запроса.

### _Homework 21_
#### _task 01_
Дан двумерный массив. Задача – написать метод

```public void toLeft() {}```

+ Пройти с 1-ой до последней строки;
+ Пройти с 1-го до предпоследнего элемента;
+ В текущую ячейку поместить значение следующей;
+ Последнему элементу присвоить 0;

#### _task 02_
Задача: Имеется массив, нужно переставить элементы массива в обратном порядке.\
Задачу не зачитывать если использованы утильные методы класса `Arrays`. Решением также не являются манупуляции с выводом массива. Необходимо действительно перемещать элементы.\
Вывести массив в консоль до и после вызова метода по реверсу массива.

### _Homework 22_
Написать класс `PersonSuperComparator`, который имплементит `Comparator`, но умеет сравнивать по двум параметрам, возраст и имя. Класс `Person` теперь содержит два поля `int age` и `String name`

### _Homework 23_
Реализовать класс корзины интернет магазина по следующему интерфейсу:
```
interface Basket {
    void addProduct(String product, int quantity);
    void removeProduct(String product);
    void updateProductQuantity(String product, int quantity);
    void clear();
    List<String> getProducts();
    int getProductQuantity(String product);
}
```

### _Homework 24_
Написать метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.

```public Set<String> removeEvenLength(Set<String> set)```

Например, для множества ```["foo", "buzz", "bar", "fork", "bart", "spoon", "!", "dude"]``` метод вернет ```["foo", "bar", "spoon", "!"]```

### _Homework 25_
#### _task 01_
```public boolean isUnique(Map<String, String> map)```

Написать метод, который возвращает true, если в мапе нет двух и более одинаковых value, и false в противном случае.\
Для пустой мапы метод возвращает true.\
Например, для метода ```{Вася=Иванов, Петр=Петров, Виктор=Сидоров, Сергей=Савельев, Вадим=Викторов}``` метод вернет _true_, а для ```{Вася=Иванов, Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров}``` метод вернет _false_.
#### _task 02_
Реализовать класс корзины интернет магазина по следующему интерфейсу, используя реализацию мапы:
```
interface Basket {
    void addProduct(String product, int quantity);
    void removeProduct(String product);
    void updateProductQuantity(String product, int quantity);
    void clear();
    List<String> getProducts();
    int getProductQuantity(String product);
}
```

### _Homework 27_
Ряд Фибоначчи - это числовой ряд, в котором следующее число является суммой двух предыдущих чисел.
Например:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 и т. д.

Есть два способа напечатать серии Фибоначчи.
+ Используя итерацию
+ Использование рекурсии

Ваша задача реализовать оба способа.

### _Homework 29_
Создать хешмап для класса Person (поля - возраст , фамилия,  пол) - переопределить `equals()`, `hashСode()`, `toString()` для объектов класса `Person`.\
Добавить в мапу элементы так, что внутри мапы с разными ключами окажутся одинаковые `Person`.
```
public static Map<String, Person> createMap() {
  Map<String, Person> book = new HashMap<>();
  Person person1 = new Person(29,"Петрова","жен");
  Person person2 = new Person(34, "Сидорова", "жен");
  Person person3 = new Person(34, "Тихонова", "жен");
  Person person4 = new Person(35, "Петров", "муж");
  book.put("Key1", person1);
  book.put("Key2", person1);
  book.put("Key3", person2);
  book.put("Key4", person3);
  book.put("Key5", person4);
  book.put("Key6", person4);
  return book;
}
```
Реализовать метод `removeTheDuplicates` по поиску дубликатов в исходной мапе, затем при нахождении дубликата удалить его из исходной мапы используя метод

```removeItemFromMapByValue(Map<String, Person> map, Person value)```
``` 
public static void removeTheDuplicates(Map<String, Person> map) {
}
```
```
public static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
  Map<String, Person> copy = new HashMap<>(map);
  for (Map.Entry<String, Person> pair: copy.entrySet())
  {
    if (pair.getValue().equals(value))
      map.remove(pair.getKey());
  }
}
```
Вывести содержимое мапы в консоль.

### _Homework 30_
Напишите программу для поиска первого неповторяющегося символа в строке. Например, первый неповторяющийся символ в «total» равен «o», а первый неповторяющийся символ в «teter» равен «r».

### _Homework 31_
Палиндром - это слово, фраза, число или другая последовательность символов или элементов, которая читает то же самое вперед или назад.

Например: 12121 - палиндром, так как он читает то же самое вперед или назад. мадам тоже палиндром.

Требуется написать 2 реализации проверки строки на палиндром:

+ Перемещение с обоих концов строки одновременно
+ Используя стандартные функции строки

### _Homework 32_
Программа для подсчета листовых узлов в двоичном дереве в Java.

### _Homework 33_
Вывести максимально встречающийся символ в строке.

Пример:

_This is test message_

Character: s has occurred maximum times in String: 5

### _Homework 37_
Выбрать информационную систему: публикация объявлений, заказ такси, планирование тренировок или любую другую.

Разработать модель (схему) данных для выбранной информационной системы. Достаточно 2-3 отношений.

Проверить и привести отношения как минимум к 3-й нормальной форме.

Результат можно предоставить в любом удобном виде. Например в виде UML-диаграммы.

### _Homework 39_
Используя модель данных для информационной системы из дз 37, написать ddl-скрипты, описывающие создание таблиц.

Обязательно должны присутствовать:

+ первичные ключи или ограничения уникальности;
+ проверочные ограничения;
+ значения полей по-умолчанию;
+ внешние ключи.