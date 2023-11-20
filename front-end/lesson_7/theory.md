## The HTML DOM (Document Object Model) 
_(на русском языке см. ниже)_

- Презентация: [ссылка](https://github.com/ait-tr/cohort24/blob/main/front_end/lesson_07/js-dom.pdf)

### The HTML DOM is an Object Model for HTML. It defines:

- HTML elements as objects
- Properties for all HTML elements
- Methods for all HTML elements
- Events for all HTML elements


### The HTML DOM is an API (Programming Interface) for JavaScript:

- JavaScript can add/change/remove HTML elements
- JavaScript can add/change/remove HTML attributes
- JavaScript can add/change/remove CSS styles
- JavaScript can react to HTML events
- JavaScript can add/change/remove HTML events

When a web page is loaded, the browser creates a Document Object Model of the page.

The HTML DOM model is constructed as a tree of Objects:

<img width="500" src="https://www.w3schools.com/whatis/img_htmltree.gif">

### Finding HTML Elements
When you want to access HTML elements with JavaScript, you have to find the elements first.

There are a couple of ways to do this:

- Finding HTML elements by id
- Finding HTML elements by tag name
- Finding HTML elements by class name
- Finding HTML elements by CSS selectors
- Finding HTML elements by HTML object collections

### Finding HTML Element by Id
The easiest way to find an HTML element in the DOM, is by using the element id.

This example finds the element with id="intro":
```
var myElement = document.getElementById("intro");
```

If the element is found, the method will return the element as an object (in myElement).

If the element is not found, myElement will contain null.


## HTML DOM (объектная модель документа)

- Презентация: [ссылка](https://github.com/ait-tr/cohort24/blob/main/front_end/lesson_07/js-dom.pdf)

### HTML DOM — это объектная модель HTML. Он определяет:

- HTML-элементы как объекты
- Свойства для всех элементов HTML.
- Методы для всех элементов HTML.
- События для всех элементов HTML


### HTML DOM — это API (интерфейс программирования) для JavaScript:

- JavaScript может добавлять/изменять/удалять элементы HTML.
- JavaScript может добавлять/изменять/удалять атрибуты HTML.
- JavaScript может добавлять/изменять/удалять стили CSS.
- JavaScript может реагировать на события HTML.
- JavaScript может добавлять/изменять/удалять события HTML.

Когда веб-страница загружается, браузер создает объектную модель документа страницы.

Модель HTML DOM построена как дерево объектов:

<img width="500" src="https://www.w3schools.com/whatis/img_htmltree.gif">

### Поиск HTML-элементов
Если вы хотите получить доступ к HTML-элементам с помощью JavaScript, вам нужно сначала найти эти элементы.

Есть несколько способов сделать это:

- Поиск HTML-элементов по идентификатору
- Поиск HTML-элементов по имени тега.
- Поиск HTML-элементов по имени класса.
- Поиск элементов HTML с помощью селекторов CSS.
- Поиск элементов HTML по коллекциям объектов HTML.

### Поиск HTML-элемента по идентификатору
Самый простой способ найти элемент HTML в DOM — использовать идентификатор элемента.

В этом примере выполняется поиск элемента с id="intro":
```
var myElement = document.getElementById("intro");
```