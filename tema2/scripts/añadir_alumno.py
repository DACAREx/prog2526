lista=["David","Lucia","Rosa","Pablo","Ivan"]
nombre=input("Introduzca el nombre de un nuevo alumno ")
lista.append(nombre)
print("La lista sin el ultimo alumno es",lista[0:-1])
print("La lista final es",lista)
