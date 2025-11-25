inventario = ["Manzanas", "Platanos", "Naranjas", "Peras"]
inventario.append("Uvas")
inventario.append("Kiwis")
melones = ["Melones"]
inventario.extend(melones)
inventario.insert(2,"Platanos Frecos")
producto_vendido = []
inventario.pop(7)
producto_vendido.append("Melones")
inventario.pop(4)
reporte_urgente = []
reporte_urgente.append(inventario[0:4])
for i in range(len(reporte_urgente)):
    for e in range(len(reporte_urgente[i])):
        print("Indice", e, ":", reporte_urgente[i][e])
