Проект создан в учебных целях.

В проекте используется функция ArrayUtils.binarySearch(int[] arr, int key) из внешней библиотеки arrays-libs-1.0-SNAPSHOTS.jar. Библиотека создана как отдельный проект и собрана в jar файл.

Функция ArrayUtils.binarySearch(int[] arr, int key) из библиотеки arrays-libs-1.0-SNAPSHOTS.jar переиспользует стандартную функцию из класса java.utils.Ararys для нахождения индекса в массиве.

Цель проекта подключение и использование внешних бибиотек через директорию libs/

Для сборки проекта используется система maven. Для того, чтобы подключить локальную библиотку arrays-libs-1.0-SNAPSHOTS.jar, в maven проект добавлен плагин maven-install-plugin, 
который на этапе инициализации проекта добавляет библиотеку arrays-libs-1.0-SNAPSHOTS.jar в локальный maven репозиторий. 

После добавления в локальный репозиторий бибиотека подключается в секции <dependency>.
