## State transition diagrams - Диаграммы перехода состояний
методика тестирования ПО, когда изменения условий ввода вызывают изменения состояния в тестируемом приложении

a software testing technique where changes in input conditions cause state changes in the application under test

**Two types of visual representation of technology(Два вида визуального представления техники):**

- State-Transition Diagram(Диаграмма перехода состояний)

- State-Transition Table(Таблица перехода состояний)

**Components of a state transition diagram(Составляющие диаграммы перехода состояний)**

States(Состояния) - possible conditions for the existence of the system at the moment(возможные условия существования системы в данный момент)

Transitions(Переходы) - possible changes to the object leading to a change in state(возможные изменения объекта, приводящие к изменению состояния)

Events(События) - external events that can occur and cause a change in state(внешние события, которые могут произойти и вызывают изменение состояния)

[Презентация](https://docs.google.com/presentation/d/1ruKU-zimvqJ0eUabbj4C9a-7kzfOqyK-/edit?usp=sharing&ouid=116447005932578256378&rtpof=true&sd=true)

[State transition diagrams example](https://drive.google.com/file/d/1-6XlXvaFAo5zojAXmGaQg7JVikVeW06N/view?usp=sharing)

[State transition table](https://docs.google.com/spreadsheets/d/1HnlPmeypworRdG2sUO8pZqx38pYehArK9GBJqe8eZi8/edit?usp=sharing)

## Logger

**Log** - список событий. **Logger** - объект, с помощью которого можно вести отчетность

[Презентация](https://docs.google.com/presentation/d/1kptX1Ce1NBux34JP7e9kOr_38TzyKEAGN1rUPcqn77M/edit?usp=sharing)

[Logger classic documentation](https://logback.qos.ch/manual/index.html)

[TestNG](https://docs.google.com/presentation/d/1MaYUXf4wIXKPgdOq1cG9s8yl4pYZvg4B/edit?usp=sharing&ouid=116447005932578256378&rtpof=true&sd=true)

[TestNG documentation](https://testng.org/doc/documentation-main.html)

_gradle -Pbrowser=firefox clean qa -Psuite1_

_gradle -Pbrowser=firefox clean qa -Psuite2_

