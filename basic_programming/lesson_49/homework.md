**Задача 1.**
Работа с MyLinkedList  
В классе MyLinkedList реализовать методы:

```MyLinkedList reverseLinkedList()``` - который возвращает MyLinkedList с таким е содержимым, но в обратном порядке;  
было: __A->B->C->D->E->F__  
стало: __F->E->D->C->B->A__ 

```MyLinkedList reverseLinkedList(int startIndex);``` - переворачивает элементы после конкретного индекса до конца  
было: __A->B-><u>C->D->E->F</u>__  reverseLinkedList(2)  
стало: __A->B-><u>F->E->D->C</u>__

```MyLinkedList reverseLinkedList(int startIndex, int endIndex);``` - переворачивает элементы после конкретного индекса, до конкретного индекса не включая последний индекс  
было: __A->B-><u>C->D</u>->E->F__   -> ```reverseLinkedList(2, 4) ```  
стало: __A->B-><u>D->C</u>->E->F__   

