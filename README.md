# GUAP_Java_M721

Syllabus

18.02 – Вводное занятие
Сетевые технологии OSI сетевая модель IP, TCP, HTTP (2v), REST, SOAP
Операционные системы: Linux/MS Windows
Технологии программирования: UML? IDEF0, ERD, Архитектуры, Паттерны OOP и функционального
RDBM – Нормализация (ERD->Class)
Языки программирования (Python – объектно-ориентированное программирование???)
С/С++ (объектно-ориентированное программирование) – наследование???
Java - ???

02.03 9:30-12:40 – Сетевые технологии и Java
Предварительная подготовка к курсу
•	Сетевые технологии OSI сетевая модель IP, TCP, HTTP (2v), REST, SOAP
•	Почитать эти слова с помощью www.google.com -> Wikipedia
•	Поставить на компьютере Postman (https://www.postman.com)
•	Поставить на компьютере JDK (https://adoptopenjdk.net/releases.html )
•	Поставить на компьютере IntelliJ Idea (https://www.jetbrains.com/edu-products/download/download-thanks.html?platform=windows)
•	Поставить на компьютер Docker (https://www.docker.com )
o	Почитать что за штука Docker
•	Поставить dbeaver-community
•	Поставить git scm
•		https://git-scm.com/download/win 
•	Поставить gradle (могут возникнуть проблемы)
•		https://gradle.org/install/ 
•	Hint: https://www.computerhope.com/issues/ch000549.htm <- что такое переменные среды и как подправить Path (ОС находит программы для запуска)
•	Прочитать про SpringBoot - https://spring.io 

Что сделано:
1)	Создан новый проект
2)	Подключен gradle и git
3)	Создан контроллер и репозиторий (interface)
4)	Создан телеграмм бот (BotFather)

09.03 9:30-11:00 – REST и Java (Лекция 1)

План на лекцию:
1)	Создать api для управления каталогом товаров
2)	Создать api для управления ценами

16.03 9:30-12:40 – REST и Java (Лекция 2)

План на лекцию:
1)	Mapping данных -> POJO (Mapstuct) – «Сахар»
2)	Создать api для управления каталогом товаров
a.	GET одного item
b.	GET all + search parameters + pagination
c.	POST <- CREATE item
d.	PUT <- UPDATE item
e.	DELETE <- change status
3)	Создать api для управления ценами
a.	GET одного item
b.	GET all + search parameters + pagination
c.	POST <- CREATE item
d.	PUT <- UPDATE item
e.	DELETE <- change status
4)	Exception handling (400, 404, 401?)
5)	Validation

23.03 9:30-11:00 – UI подходы (Лекция 1)

План на лекцию:
1)	Unit тесты и интеграционные тесты
2)	Создание UI для работы с каталогом и ценами

30.03 9:30-12:40 – UI подходы (Лекция 2)

План на лекцию:
1)	Создание UI для работы с каталогом и ценами

06.04 9:30-11:00 – Сторонние сервисы на примере Телеграмм (Лекция 1)

План на лекцию:
1)	Подключения обновлений телеграмм бота к сервису
2)	Build tool + Docker image

Индивидуальное задание:
1)	Создать REST сервис
2)	Подключить RDBM, Swagger
3)	Сделать интеграционные и Unit тесты
