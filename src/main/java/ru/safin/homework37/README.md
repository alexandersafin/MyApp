#### Описание ИС

Пример описывает упрощенную схему экзаменационной ведомости.

Таблица **student** содержит:
- `id_st` - первичный ключ
- `surname` - фамилия

Таблица **exam_st** содержит:
- `id_ex` - первичный ключ
- `subject` - наименование предмета
- `date_time` - дата экзамена

Таблица **mark_st** содержит:
- `id_ex` - первичный ключ и внешний ключ
- `id_st` - первичный ключ и внешний ключ
- `mark` - оценка