anno = int(input("Introduce un year "))
if (anno % 4 == 0 and anno % 100 != 0) or anno % 400 == 0:
   print(anno , "es bisiesto")

else:
    print(anno , "no es bisiesto")
