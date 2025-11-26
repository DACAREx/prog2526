import busqueda_binario
import busqueda_lineal

lista = [2,6,9,1,5,67,9,18,0,4,33,22,99,108,231,54,16,71,27,39,14,56,93]
eleccion = int(input("Introduce el numero del que desee saber su posicion: "))
resultado = busqueda_binario.busqueda_binario(lista,eleccion)
print("El numero",eleccion,"se encuentra en la posicion",resultado)
solucion = busqueda_lineal.busquedaLineal(lista,eleccion)
print("El numero",eleccion,"se encuentra en la posicion",solucion)    

