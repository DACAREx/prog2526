tareas_dia = ["Revisar Email", "Llamar al cliente", "comprar café", "Actualizar reporte", "Planificar reunión"]
informe_ordenado = sorted(tareas_dia, key=str.lower)
tareas_dia.sort(key=len)
print("Lista ordenada por longitud:",tareas_dia)
print("Lista ordenada por orden alfabetico:",informe_ordenado)
