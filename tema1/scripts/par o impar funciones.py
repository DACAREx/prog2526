def par_impar(num):
    if num % 2 == 0:
        resultado = print(f"El número {num} es par")
    else:
        resultado = print(f"El número {num} es impar")
        
num = int(input("Introduce un numero para saber si es par o impar "))
par_impar(num)
