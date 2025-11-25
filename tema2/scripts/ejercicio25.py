palabra1 = "radar"
reves1 = (palabra1[::-1])
if palabra1 == reves1:
    print(palabra1, reves1)
    print("es un palindromo")

print("============================================")

correo = " juan.perez@dominio.com "
print(correo.strip())
print(correo.upper())
print(correo.split("@"))

print("============================================")

clase = "titulo"
contenido = "Mi Encabezado"
print(f"<h1 class={clase}>{contenido}</h1>")
