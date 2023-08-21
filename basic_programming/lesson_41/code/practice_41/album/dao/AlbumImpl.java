package practice_41.album.dao;

import practice_41.album.dao.Album;
import practice_41.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album {

    static Comparator<Photo> comparator = (p1, p2) -> {
        int res = p1.getDate().compareTo(p2.getDate()); // сортировка по дате
        return res !=0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId()); // сортировка по photoId
    };

    // поля
    private Photo[] photos; // это массив объектов типа Photo

    private int size; // это переменная, отвечает за общее кол-во элементов массива

    // конструктор
    public AlbumImpl(int capacity){
        photos = new Photo[capacity];
    }

    @Override
    public boolean addPhoto(Photo photo) {
        // нельзя добавить null, нельзя если photo.length == capacity, нельзя добавить то же самое photo (проверка на два id)
        // Нужно иметь отсортированный массив, так как BinarySearch работает только с такими массивами.
        // Метод BinarySearch находит и возвращает index искомого элемента, если находит.
        // Если элемент массива не найден, то BinarySearch вернет отрицательное число, где бы должен был стоять искомый элемент
        // со знаком "минус" и на 1 меньше.
        // Нам нужно применить binarySearch (получим индекс в массиве), чтобы найти место, куда вставить фото.
        // Тогда можно выполнить addPhoto.
        if(photo == null || photos.length == size || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {
            return false;
        }
        int index = Arrays.binarySearch(photos, 0, size, photo, comparator); // находим индекс с помощью BinarySearch
        // массив оказывается после binarySearch отсортированным
        index = index >= 0 ? index : -index - 1; // индекс требует обработки
        System.arraycopy(photos, index, photos, index + 1, size - index); // копируем эл-ты массива от index на 1 место вправо
        photos[index] = photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId) {
                System.arraycopy(photos, i + 1, photos, i, size - 1 - i);
                photos[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(photoId, albumId); // нашли photo по двум id
        if (photo == null) {
            return false;
        }
        photo.setUrl(url);
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        Photo pattern = new Photo(albumId, photoId, null, null, null); // создаем объект, с которым сравниваем photo из массива
        for (int i = 0; i < size; i++) {
            if(pattern.equals(photos[i])) {
                return photos[i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        return findByPredicate (p -> p.getAlbumId() == albumId );
    }

    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        // создадим фото с индексом максимально ранней фотографии и фото с максимально большим индексом
        // сравнивая с этими фото будем искать индексы фото from и to
        // для поиска опять будем использовать BinarySearch
        Photo pattern = new Photo(0, Integer.MIN_VALUE, null, null, dateFrom.atStartOfDay());
        int from = - Arrays.binarySearch(photos, 0, size, pattern, comparator) - 1; // находим индекс
        pattern = new Photo(0, Integer.MAX_VALUE, null, null, LocalDateTime.of(dateTo, LocalTime.MAX)); // находим правый край
        int to = - Arrays.binarySearch(photos, from, size, pattern, comparator) - 1;
        return Arrays.copyOfRange(photos, from, to); // создаем массив с нужными нам фото
    }

    @Override
    public int size() {
        return size;
    }

    private Photo[] findByPredicate(Predicate<Photo> predicate){
        Photo[] res = new Photo[size];
        int j = 0; // счетчик найденных по условию
        for (int i = 0; i < size; i++) {
            if(predicate.test(photos[i])) {
                res[j++] = photos[i];
            }
        }
        return Arrays.copyOf(res, j); // копируем только ту часть, где нет null
    }

}
