a = [1,2,3,4]
for i in range (5):
    print(a[i])

#El error:
#Traceback (most recent call last):
#  File "/home/alumno/programacion/tema2/ejercicio 3.py", line 3, in <module>
#    print(a[i])
#IndexError: list index out of range

#Se debe a que el array tiene 4 numeros pero le pedimos que nos de 5 y al
#no tenerlos salta este error (list index out of range)
