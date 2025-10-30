nota = input("introduzca su nota")
match nota:
  case 1 | 2 | 3 | 4 :
nota = int(input("introduzca su nota"))
match nota:
  case 0 | 1 | 2 | 3 | 4 :
       print(nota ," es un Insuficiente")
  case 5:
       print(nota ," es un Suficiente")
  case 6:
       print(nota ," es un Bien")
  case 7 | 8 : 
       print(nota ," es un Notable")
  case 9 | 10:
       print(nota ," es un sobresaliente")
  case _:
       print("ha ocurrido un error (recuerda que no admite decimales)")

       print("a ocurrido un error")
