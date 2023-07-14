package array_list.interfaces;

public interface IList<E> extends Iterable<E>{ // E - это generic, то есть параметр, который может быть заменен Типом и объектом

    int size();
    
    default boolean isEmpty(){
        return size() == 0; // если size = 0, то лист пустой
    };
    
    void clear();
    
    default boolean contains (Object o){
        return indexOf(o) >= 0; //  если найденный индекс элемента будет положительным, то объект есть
    };
    
    boolean add(E element);
    
    default boolean remove (Object o) {
        int index = indexOf(o); // нашли индекс элемента
        if (index < 0) {
            return false;
        }
        remove(index); // удаляем элемент
        return true;
    };
    
    boolean add(int index, E element);
    
    E get(int index);
    
    int indexOf(Object o);
    
    int lastIndexOf(Object o);
    
    E remove(int index);
    
    E set(int index, E element);
}
