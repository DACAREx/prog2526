# Cadenas para el ejercicio
a = "Banana"
b = "banana"
c = "a"
d = "A"
e = "10"
f = "9"
g = "hola"
h = "hola "
i = "manzana"
j = "man"

# 1. ¿Son idénticas? (Sensible a mayúsculas)
print(f"a == b: {a == b}")  # False, por la diferencia de mayúsculas/minúsculas

# 2. ¿Quién va después en el diccionario? (Basado en valor Unicode)
print(f"c > d: {c > d}")  # False, las mayúsculas van primeras en el orden alfanumerico

# 3. Comparación como texto, no como número
print(f"e < f: {e < f}")  # False, "10" es mayor que "9" 

# 4. ¿Son diferentes? (El espacio cuenta)
print(f"g != h: {g != h}")  # True, porque el espacio cuenta como un carácter extra

# 5. ¿Es prefijo?
print(f"i > j: {i > j}")  # True, porque "manzana" tiene más caracteres que "man"

a = "Banana"
b = "banana"

# Hacemos ambas cadenas minúsculas para que la comparación no sea sensible
resultado_modificado = a.lower() == b.lower()

print(f"Resultado modificado: {resultado_modificado}")  # True
