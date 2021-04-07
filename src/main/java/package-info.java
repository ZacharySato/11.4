/*
 * Singleton:   применён - в Controller, вряд ли очень необходим, но и возможность создавать другие экземпляры тоже не нужна.
 * Factory:     применён - в EyesColor (статическая фабрика, получается),
 *              чтобы вынести логику добавления и подбора в один изолированный класс с ограниченным набором значений.
 *              Абстрактная - HairOption, можно множить характеристики, не выходя за пределы пакета, например,
 *              добавить текстуру (кудрявые, волнистые, прямые) и т.д.
 * Builder:     применён - Person, большой конструктор, как минимум один необязательный параметр.
 * Adapter:     применён - FioUniform, при гипотетическом усложеннии структуры Fio, например вторым отчеством, или произвольным
 *              составом, пришлось бы переделывать toString() в Person.
 * Bridge:      применён - в Hair характекристики вместо наследования собираем частями, так компактнее, особенно в перспективе, если
 *              понадобится что-нибудь добавить.
 * Facade:      не применен - исключительно из логики названия InputProcessor не должен содеражать подробностей сборки Person,
 *              и можно применить фасад, но проще и легче проект не станет, не самое необходимое изменение.
 * DTO:         применён - Fio, чтобы передавать и обрабатывать отдельную конткретную сущность, и, заодно, чтобы унифицировать генераторы.
 * Шаблон:      применён - короткий шаблонный метод есть у Generator, из двух шагов, но значительно облегчает код.
 */