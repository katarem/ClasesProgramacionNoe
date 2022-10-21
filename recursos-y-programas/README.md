# Recursos y Programas

En esta carpeta tendrás recursos y el instalador de los programas que irás necesitando a lo largo del curso.



## Instalador.ps1

Este es un simple script de **PowerShell** que instalará **Chocolatey**, un software de instalación de paquetes simple para instalar programas desde la terminal de manera sencilla, también instalará:

* **Visual Studio Code** -> Este será nuestro entorno de trabajo

* **Maven** -> Este será nuestro gestor de proyectos

* **Temurin JDK 19** -> Este es el JDK (_Java Development Kit_) el cuál necesitamos para poder arrancar cualquier tipo de archivo derivado de Java, y para el desarrollo con el lenguaje.

* **MarkText** -> Es un editor de archivos .md (_MarkDown_) como **este**.

* **Git** -> Es un sistema de gestión de versiones, y el más extendido por el planeta. Lo usaremos para subir proyectos a GitHub y tener constancia de los cambios que se van realizando en las distintas versiones.

* **GitHub Desktop** -> Es una interfaz gráfica que permitirá sinconizar nuestros proyectos como repositorios en **GitHub** a través de **Git**

# Cómo instalar
Diríjete al icono de Windows, click derecho y click a **Windows Powershell (Administrador)**. Una vez tengamos la **Terminal de Powershell** abierta, haremos:

```powershell
Set-ExecutionPolicy Bypass -Scope Process -Force; iex ((New-Object System.Net.WebClient).DownloadString('https://raw.githubusercontent.com/katarem/ClasesProgramacionNoe/master/recursos-y-programas/instalador.ps1'))
```



