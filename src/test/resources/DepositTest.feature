#language: ru
Функционал: Открытие вклада

  Сценарий: Вклад в рублях
  Когда выбран калькулятор вкладов
  Тогда заголовок страницы вклада равен "Рассчитайте доходность по вкладу"

    Когда заполняются поля:
      |Валюта|Рубли|
      |Сумма вклада|2000000|
      |Срок в месяцах|6|
      |Ежемесячное пополнение|30000|
    И Отмечается чекбокс "Ежемесячная капитализация"
    И Отмечается чекбокс "Частичное снятие"

    Тогда значения полей равны:
      |Ставка|6.25%|
      |Начислено|65 132,87|
      |Пополнения к концу срока|150 000|
      |К снятию к концу срока|2 215 132,87|

  Сценарий: Вклад в долларах
    Когда выбран калькулятор вкладов
    Тогда заголовок страницы вклада равен "Рассчитайте доходность по вкладу"

    Когда заполняются поля:
      |Валюта|Доллары США|
      |Сумма вклада|50000|
      |Срок в месяцах|9|
      |Ежемесячное пополнение|1000|
    И Отмечается чекбокс "Ежемесячная капитализация"
    Тогда значения полей равны:
      |Ставка|0.75%|
      |Начислено|301,42|
      |Пополнения к концу срока|8 000|
      |К снятию к концу срока|58 301,42|
