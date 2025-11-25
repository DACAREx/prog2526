puntuaciones = [75, 88, 92, 88, 70, 92, 92]
alumnos = len(puntuaciones)
x = puntuaciones.count(92)
y = puntuaciones.index(70)
for i in puntuaciones:
    if i == 100:
        z = True
    else:
        z = False
print("Tarea 1 (len): Determina cuántos alumnos realizaron el examen.")
print(alumnos)
print("Tarea 2 (.count): ¿Cuántos alumnos obtuvieron la puntuación 92?")
print(x)
print("Tarea 3 (.index): ¿En qué posición (índice) se encuentra la primera puntuación de 70?")
print(y)
print("Tarea 4 (in): Verifica si la puntuación 100 está presente en la lista (devuelve True o False).")
print(z)
