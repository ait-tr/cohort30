# Technology for version control of developed software Git

**Relevance**
Today, a programmer without Git is like a cowboy without a horse.
Very often, before an interview, they ask you to send a link to your Git, this is part of your portfolio.

**Story:**
Git was created by Linus Torvalds, known as the main ideologist of the Linux OS.
Git was needed to unite the efforts of teams of programmers working on the same project.
Today, Git is used by both teams and individual programmers.
Git means "git" in English and is a joke by Linus in honor of himself:
I'm an egotistical bastard, so I name all my projects after myself. First Linux, now git.

**Essence of technology:**
- **programmer** conducts development **on his local computer** (off line), all folders (directories) of the project and
  the files are placed in a folder whose contents are monitored by git - THIS IS A **LOCAL REPOSITORY**;

- to save the results of the work, **REMOTE REPOSITORY** (online) is used, where it is sent
  a copy of the folder with all its contents when the programmer:
    1. commits a COMMIT (changes to the local repository) and
    2. does PUSH (sending to a remote repository);

______________________________________________________________

- KEY ALGORITHM (know how) Git:
  git can track all changes that occur in the LOCAL REPOSITORY
  since the last successful synchronization with the REMOTE REPOSITORY:
    - names of folders, their location
    - file names
    - changes in files (changes from 1 character)
    - the appearance of new folders and files in them
    - etc.
______________________________________________________________

- **version control system** is **history of COMMIT and PUSH made**, you can go back
  to any point in the past when the COMMIT and PUSH were made.

__________________________________________________________

### SUMMARY:
**Git Version Control System**
* Allows **individual development** with version control for each programmer.
* Allows you to isolate development within a team for each developer,
  if each team member works with his own file(s).
* Allows for **group development**, provided that all team members understand that
  how Git works.
* Distributed version control system Git - the principle is the same, but the services are different:
    - GitHub github.com,
    - GitLab gitlab.com,
    - Bitbucket
    - ...

### IMPORTANT TO UNDERSTAND
* main (master) - the repository on the developer’s computer, that is, **yours**
* a remote repository is a copy (snapshot) from a local one, made at some point in time

**Question:** Is it possible to change a remote repository and transfer (receive) these changes
on your computer in a local repository?
**Answer:** yes, this is possible, the pull command “pulls” changes from a remote repository to a local repository

This is exactly what **allows several programmers to work together**, BUT
conflicts (risks) are possible.


## GIT - version control system

- **Git** is a helper program (tool) for any developer
- **GitHub** - online platform (project hosting)
- **GitHub Pages** - GitHub service (static file hosting)

## Stages of work

1. **Preparatory stage**
    - (Windows only) install GIT on your computer https://git-scm.com/downloads
    - setting up Git on your computer:
        - `git config --global -l` see current settings
        - `git config --global user.name "Ivanov Ivan"` name settings
        - `git config --global user.email "my_email@example.org"` email settings
    - having an account on GitHub
    - upload the public key to GitHub
        - view the public key (if there is an error, then you need to generate it)
            - `cat ~/.ssh/id_ed25519.pub`
            - `cat ~/.ssh/id_rsa.pub`
        - `ssh-keygen -t ed25519 -C 'email@example.org'` generate a key pair (EXECUTE ONLY AT THE BEGINNING OF YOUR CAREER)
        - copy the public key to GitHub
        - `ssh -T git@github.com` check that the key is uploaded to GitHub

## Checking the current Git version

```bash
git -v
```

## Types of software interfaces

1. `GUI` (Graphical User Interface) - graphical user interface
2. `CLI` (Command Line Interface) - command line interface

### Basic methods of authorization on the Internet

1. By password
2. By `RSA/SSH` keys (text files)
    - used in professional environment
    - allows authorization without a password (transparent)
    - implies the presence of a pair of keys
        - public - can be shared with everyone
        - private - kept secret

### Generate `RSA/SSH` pair

**Performed alone at the “beginning of career”**

**Before execution, make sure that the key is not yet there (!)**

1. Check that there are no keys
    1. `cat ~/.ssh/id_rsa.pub`
    2. `cat ~/.ssh/id_ed25519.pub`
2. Key pair generation
    1. `ssh-keygen -t ed25519 -C 'email@example.org'`

## Basic (basic) procedure for working with GIT

1. `git init` create an empty repo (done once, for a new project)
2. `**git add .**` put all project files under control
    1. `git add src` - example select significant addition
3. `**git commit -m 'description of changes'**` commit (save)
4. Create a new repo on GitHub (one project - one repo)
5. `git remote add origin <link>` perform LOCAL ↔ REMOTE binding (done once for a new project)
6. **`git push -u origin main`** upload to GitHub
    1. `git push` (short for next commits)

**Repository (Git)** - file database for the project development history (`.git/`) - repository

## `.gitignore` file

```bash
# exclude all mp4 files
*.mp4
```

----------------------------------------------------------------------

# Технология контроля версий разрабатываемого ПО Git

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

- для сохранения результатов работы используется **УДАЛЕННЫЙ РЕПОЗИТОРИЙ** (online), куда отправляется
  копия папки со всем ее содержимым когда программист:
    1. фиксирует COMMIT (изменения в локальном репозитории) и
    2. делает PUSH (отправку в удаленный репозиторий);

_________________________________________________________

- КЛЮЧЕВОЙ АЛГОРИТМ (know how) Git:
  git умеет отслеживать все изменения, которые происходят в ЛОКАЛЬНОМ РЕПОЗИТОРИИ
  с момента последней успешной синхронизации с УДАЛЕННЫМ РЕПОЗИТОРИЕМ:
    - названия папок, их расположение
    - название файлов
    - изменения в файлах (изменения от 1 символа)
    - появление новых папок и файлов в них
    - и т.д.
_________________________________________________________

- **система контроля версий** - это **история сделанных COMMIT и PUSH**, можно возвращаться
  на любую точку в прошлом, когда был сделан COMMIT и PUSH.

__________________________________________________________

### РЕЗЮМЕ:
**Система контроля версий Git**
* Позволяет вести **индивидуальную разработку** с контролем версий для каждого прграммиста.
* Позволяет изолировать разработку внутри команды для каждого разработчика,
  если каждый член команды работает со своим файлом(ми).
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
возможны конфликтты (риски).


## GIT - система контроля версий

- **Git** - вспомогательная программа (инструмент) любого разработчика
- **GitHub** - интернет-площадка (хостинг проектов)
- **GitHub Pages** - сервис GitHub (хостинг статических файлов)

## Этапы работы

1. **Подготовительный этап**
  - (только для Windows) установка GIT на компьютер https://git-scm.com/downloads
  - настройка Git на компьютере:
    - `git config --global -l` посмотреть текущие настройки
    - `git config --global user.name "Ivanov Ivan"` настройка имени
    - `git config --global user.email "my_email@example.org"` настройка email
  - наличие аккаунта на GitHub
  - выгрузить публичный ключ на GitHub
    - просмотр публичного ключа (если ошибка, то надо сгенерировать)
      - `cat ~/.ssh/id_ed25519.pub`
      - `cat ~/.ssh/id_rsa.pub`
    - `ssh-keygen -t ed25519 -C 'email@example.org'` сгенирировать пару ключей (ВЫПОЛНИТЬ ТОЛЬКО В НАЧАЛЕ КАРЬЕРЫ)
    - скопировать публичный ключ на GitHub
    - `ssh -T git@github.com` проверить, что ключ выгружен на GitHub

## Проверка текущей версии Git

```bash
git -v
```

## Виды программных интерфейсов

1. `GUI` (Graphical User Interface) - графический интерфейс пользователя
2. `CLI` (Command Line Interface) - интерфейс командной строки

### Основные способы авторизации в Интернет

1. По паролю
2. По `RSA/SSH`-ключам (текстовые файлы)
  - используют в профе. среде
  - позволяет выполнять авторизацию без пароля (прозрачно)
  - подразумевает наличие пары ключей
    - публичный (public) - можно делиться со всеми
    - приватный (private) - храним в секрете

### Генерация пары `RSA/SSH`

**Выполняется один в “начале карьере”**

**Перед выполнением убедись, что ключа еще нет (!)**

1. Проверить, что ключей нет
  1. `cat ~/.ssh/id_rsa.pub`
  2. `cat ~/.ssh/id_ed25519.pub`
2. Генерация пары ключей
  1. `ssh-keygen -t ed25519 -C 'email@example.org'`

## Базовый (основной) порядок работы с GIT

1. `git init` создать пустой репо (выполняется один раз, для нового проекта)
2. `**git add .**` поставить все файлы проекта на контроль
  1. `git add src` - пример избирательного добавления
3. `**git commit -m 'описание изменений'**`  выполнить коммит (сохранение)
4. Создание нового репо на GitHub (один проект - один репо)
5. `git remote add origin <ссылка>` выполнить привязку LOCAL ↔ REMOTE (делается один раз для нового проекта)
6. **`git push -u origin main`** выгрузить на GitHub
  1. `git push` (короткий вариант для следующих коммитов)

**Репозиторий (Git)** - файловая база данных для истории разработки проекта (`.git/`) - хранилище

## Файл `.gitignore`

```bash
# исключить все mp4-файлы
*.mp4
```