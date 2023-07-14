**Relevance**
Today, a programmer without Git is like a cowboy without a horse.
Very often, before the interview, they ask you to send a link to your Git, this is part of the portfolio.

**Story:**
Git was created by Linus Torvalds, known as the main ideologist of the Linux OS.
Git was needed to bring together teams of programmers working on the same project.
Today, Git is used by both teams and individual programmers.
Git - translated from English means "scoundrel", this is Linus's joke in honor of himself:
I'm an egotistical bastard, so I name all my projects after myself. First Linux, now git.

**The essence of technology:**
- **programmer** develops **on his local computer** (off line), all folders (directories) of the project and
  the files are placed in a folder whose contents are monitored by git - THIS **LOCAL REPOSITORY**;

- to save the results of the work, **REMOTE REPOSITORY** (on line) is used, where it is sent
  a copy of the folder with all its contents when the programmer:
    1. commits COMMIT (changes in local repository) and
    2. does PUSH (sending to a remote repository);

___________________________________________________________

- KEY ALGORITHM (know how):
  git can keep track of all the changes that happen in the LOCAL REPOSITORY
  since the last successful synchronization with the REMOTE REPOSITORY:
    - folder names, their location
    - file name
    - changes in files (changes from 1 character)
    - the appearance of new folders and files in them
    - etc.
___________________________________________________________

- **version control system** is a **history of COMMIT and PUSH made**, you can return
  to any point in the past when a COMMIT and PUSH was made.

________________________________________________________

### SUMMARY:
**Git version control system**
* Allows for **individual development** with version control for each programmer.
* Allows you to isolate development within the team for each developer,
  if each team member works with their own file(s).
* Allows for **group development**, provided that all team members understand what
  how Git works.
* Distributed version control system Git - the principle is the same, but the services are different:
    - GitHub github.com ,
    - GitLab gitlab.com ,
    - Bitbucket,
    - ...

### IMPORTANT TO UNDERSTAND
* main (master) - the developer's repository on the computer, that is, ** you **
* a remote repository is a copy (cast) from a local one, made at some point in time

**Question:** is it possible to change the remote repository and transfer (get) these changes
on your computer in a local repository?
**Answer:** yes, it is possible, the pull command "pulls" changes from the remote to the local repository

This is what **allows multiple programmers to work together**, BUT
possible conflicts (risks).

__________________________

### Situation 1
1. Developer A made changes to the file BUT did not commit or push.
2. Developer B made changes to the same file, but made a commit and did a push.
3. Developer A now tries to commit and push.
   Result: Git does not allow a push, but instead requires developer A to first pull.
   A conflict occurs, Git shows the difference in the files and allows you to resolve the conflict.
____________________________

### Workshop
1. Registration on the website https://github.com/
2. Create your own cloud repository
3. Clone the cloud repository on your computer
4. Transferring your working folders and files to your LOCAL repository folder on your computer
4. Modifying the code in the repository (lectures and DZ) using the IntellyJ IDEA IDE
5. Perform commit and push from IDE IntelliJ IDEA, check status of REMOTE repository
6. Providing a link to your repository when doing a remote sensing
7. Updating the local repository using the pull command
8. Conflicts when working with the repository


_________________________
# Накопленные знания за прошедшие 2 недели:

модификаторы доступа для класса, поля, метода: 
public, privat 
final, protected
default - который работает, когда модификатор отсутствует

static и когда этого слова нет - применяется для методов  

Классы - обертки (wrapper classes) 

JUnit тесты - !!! 

Запуск приложения с параметрами (String[] arg)



# Git 
**Актуальность**
Сегодня программист без Git, как ковбой без лошади.
Очень часто перед собеседованием просят прислать ссылку на ваш Git, это часть портфолио.

**История:**
Git создан Линусом Торвальдсом известным, как главный идеолог ОС Linux.
Git был нужен для объединения усилий команд программистов, работающих в рамках одного проекта.
Сегодня Git используется как командами, так и индивидуальными программистами.
Git - в переводе с английского означает "мерзавец", это шутка Линуса в честь самого себя:
I'm an egotistical bastard, so I name all my projects after myself. First Linux, now git.

**Суть технологии:**
- **программист** ведет разработку **на своем локальном компьютере** (off line), все папки (директории) проекта и
  файлы помещаются в папку, содержание которой отслеживает git - ЭТО **ЛОКАЛЬНЫЙ РЕПОЗИТОРИЙ**;

- для сохранения результатов работы используется **УДАЛЕННЫЙ РЕПОЗИТОРИЙ** (on line), куда отправляется
  копия папки со всем ее содержимым когда программист:
    1. фиксирует COMMIT (изменения в локальном репозитории) и
    2. делает PUSH (отправку в удаленный репозиторий);

_________________________________________________________

- КЛЮЧЕВОЙ АЛГОРИТМ (know how):
  git умеет отслеживать все изменения, которые происходят в ЛОКАЛЬНОМ РЕПОЗИТОРИИ
  с момента последней успешной синхронизации с УДАЛЕННЫМ РЕПОЗИТОРИЕМ:
    - названия папок, их расположение
    - название файлов
    - изменения в файлах (измения от 1 символа)
    - появление новых папок и файлов в них
    - и т.д.
_________________________________________________________

- **система контроля версий** - это **история сделанных COMMIT и PUSH**, можно возвращаться
  на любую точку в прошлом, когда был сделан COMMIT и PUSH.

__________________________________________________________

### РЕЗЮМЕ:
**Система контроля версий Git**
* Позволяет вести **индивидуальную разработку** с контролем версий для каждого программиста.
* Позволяет изолировать разработку внутри команды для каждого разработчика,
  если каждый член команды работает со своим пакетом, файлом(ми).
* Позволяет вести **групповую разработку**, при условии понимания всех членов команды того,
  как работает Git.
* Распределенная система контроля версий Git - принцип один, но сервисы разные:
    - GitHub github.com ,
    - GitLab gitlab.com ,
    - Bitbucket ,
    - ...

### ВАЖНО ПОНИМАТЬ
* главный (мастер) - репозиторий у разработчика на компьютере, то есть **у вас**
* удаленный репозиторий - это копия (слепок) с локального, сделанный в какой-то момент времени

**Вопрос:** можно ли изменить удаленный репозиторий и перенести (получить) эти изменения
на своем компьютере в локальном репозитоии?
**Ответ:** да, это можно, команда pull "тянет" изменения из удаленного в локальный репозиторий

Именно это и **позволяет вести совместную работу нескольким программистам**, НО
возможны конфликты (риски).
__________________________

### Ситуация 1
1. Разрботчик А внес изменения в файле, НО не сделал коммит и не сделал push.
2. Разработчик В внес изменения в этот же файл, но сделал коммит и сделал push.
3. Теперь разработчик А пытается сделать коммит и push.
   Результат: Git не дает сделать push, а требует, чтобы разработчик А сначала сделал pull.
   Возникает конфликт, Git показывает разницу в файлах и позволяет устранить конфликт.
____________________________

### Практикум
1. Регистрация на сайте https://github.com/
2. Создание своего облачного репозитория
3. Клонирование облачного репозитория на свой компьютер
4. Перенос своих рабочих папок и файлов в папку своего ЛОКАЛЬНОГО репозитория на компьютере
4. Модификация кода в репозитории (лекции и ДЗ) с помощью IDE IntellyJ IDEA
5. Выполнение commit и push из IDE IntellyJ IDEA, проверка состояния УДАЛЕННОГО репозитория
6. Предоставление ссылки на свой репозиторий при выполнении ДЗ
7. Актуализация локального репозитория с помощью команды pull
8. Конфликты при работе с репозиторием
