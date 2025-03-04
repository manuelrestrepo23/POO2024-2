import tkinter as tk
from tkinter import messagebox

ARCHIVO = "datos.txt"

def crear():
    id = identrada.get().strip()
    nombre = nombreentrada.get().strip()
    edad = edadentrada.get().strip()

    if not id or not nombre or not edad:
        messagebox.showerror("Error", "Debes rellenar todos los campos.")
        return

    with open(ARCHIVO, "a") as file:
        file.write(f"{id},{nombre},{edad}\n")

    messagebox.showinfo("Felicitaciones", "Empleado guardado.")
    clear_fields()

def leer():
    text_area.delete("2.0", tk.END)
    try:
        with open(ARCHIVO, "r") as file:
            records = file.readlines()
        for record in records:
            text_area.insert(tk.END, record)
    except FileNotFoundError:
        messagebox.showerror("Error", "No se pudo encontrar informacion.")

def actualizar():
    id = identrada.get().strip()
    nombre = nombreentrada.get().strip()
    edad = edadentrada.get().strip()

    if not id or not nombre or not edad:
        messagebox.showerror("Error", "Debes rellenar todos los campos.")
        return

    try:
        with open(ARCHIVO, "r") as file:
            records = file.readlines()

        actualizados = []
        found = False
        for record in records:
            parts = record.strip().split(",")
            if parts[0] == id:
                actualizados.append(f"{id},{nombre},{edad}\n")
                found = True
            else:
                actualizados.append(record)

        if not found:
            messagebox.showerror("Error", "No se encontro el Id.")
            return

        with open(ARCHIVO, "w") as file:
            file.writelines(actualizados)

        messagebox.showinfo("Felicitaciones", "Se actualizo correctamente el empleado.")
        clear_fields()

    except FileNotFoundError:
        messagebox.showerror("Error", "No se pudo encontrar informacion.")

def borrar():
    id = identrada.get().strip()

    if not id:
        messagebox.showerror("Error", "Debes ingresar un Id.")
        return

    try:
        with open(ARCHIVO, "r") as file:
            records = file.readlines()

        actualizados = [record for record in records if not record.startswith(id + ",")]

        if len(actualizados) == len(records):
            messagebox.showerror("Error", "No se encontro el Id.")
            return

        with open(ARCHIVO, "w") as file:
            file.writelines(actualizados)

        messagebox.showinfo("Felicitaciones", "Se han eliminado los datos correctamente.")
        clear_fields()

    except FileNotFoundError:
        messagebox.showerror("Error", "No se pudo encontrar informacion.")

def limpiar():
    identrada.delete(0, tk.END)
    nombreentrada.delete(0, tk.END)
    edadentrada.delete(0, tk.END)

def mostrar_mensaje_cursor(event, text):
    cursor.config(text=text)
    cursor.place(x=event.x_root - root.winfo_rootx() + 10, y=event.y_root - root.winfo_rooty() + 10)

def esconder_mensaje_cursor(event):
    cursor.place_forget()

root = tk.Tk()
root.title("Informacion")

tk.Label(root, text="ID:").grid(row=0, column=0)
identrada = tk.Entry(root)
identrada.grid(row=0, column=1)

tk.Label(root, text="Nombre:").grid(row=1, column=0)
nombreentrada = tk.Entry(root)
nombreentrada.grid(row=1, column=1)

tk.Label(root, text="Edad:").grid(row=2, column=0)
edadentrada = tk.Entry(root)
edadentrada.grid(row=2, column=1)

tk.Button(root, text="Crear", command=crear).grid(row=3, column=0)
tk.Button(root, text="Leer", command=leer).grid(row=3, column=1)

actualizar_btn = tk.Button(root, text="Actualizar", command=actualizar)
actualizar_btn.grid(row=4, column=0)
tk.Button(root, text="Eliminar", command=borrar).grid(row=4, column=1)

cursor = tk.Label(root, text="", bg="red", fg="black", relief="solid", borderwidth=3, font=("Arial", 12))
cursor.place_forget()

actualizar_btn.bind("<Enter>", lambda event: mostrar_mensaje_cursor(event, "Para actualizar, ingresar Id \n Luego ingrese datos y da click en actualizar"))
actualizar_btn.bind("<Leave>", esconder_mensaje_cursor)


text_area = tk.Text(root, height=20, width=50)
text_area.grid(row=5, columnspan=3)

root.mainloop()
