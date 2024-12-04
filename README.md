# **Gestión de Eventos, Horarios y Farmacias - Aplicación Android**

Este proyecto es una aplicación móvil desarrollada en **Java** con **Android Studio** que permite al usuario gestionar eventos y horarios de manera sencilla, además de estar preparada para incluir funcionalidades relacionadas con farmacias. Es ideal para quienes necesitan organizar su tiempo y actividades personales.

---

## **¿Qué hace el programa?**

### **1. Gestión de Eventos**
La aplicación permite al usuario:
- **Agregar eventos personales**, indicando:
  - Nombre del evento.
  - Descripción breve.
  - Fecha del evento.
  - Precio del evento.
- **Visualizar los eventos en una lista** interactiva.
- Validar los datos antes de guardar, asegurándose de que no queden campos vacíos.

El objetivo es proporcionar una herramienta rápida para recordar eventos importantes y sus detalles.

---

### **2. Gestión de Horarios**
La funcionalidad de horarios permite al usuario:
- **Registrar asignaturas o actividades**, incluyendo:
  - Nombre de la asignatura.
  - Día de la semana.
  - Hora de inicio.
- **Listar las asignaturas** registradas en una lista interactiva.
- **Editar campos** rápidamente para nuevas actividades.

Esta funcionalidad está diseñada para facilitar la organización del horario semanal.

---

### **3. Funcionalidad de Farmacias (en desarrollo)**
Aunque la funcionalidad de farmacias aún no está implementada, está diseñada para:
- Mostrar una lista de farmacias cercanas.
- Proporcionar información básica, como ubicación y horarios.
- Integrarse con Google Maps para ofrecer indicaciones.

---

### **4. Navegación Intuitiva**
Desde la pantalla principal (MainActivity), el usuario puede acceder a cualquiera de las funcionalidades disponibles:
- **Horarios:** Navega a la sección de horarios.
- **Eventos:** Navega a la sección de eventos.
- **Farmacias:** Navega a la sección futura de farmacias.

Cada pantalla está diseñada con una interfaz simple y botones accesibles.

---

## **¿Cómo funciona la aplicación?**

1. **Pantalla principal:**
   - Al abrir la aplicación, el usuario encuentra tres botones que lo dirigen a las distintas funcionalidades.
   - La navegación es clara y sencilla.

2. **Gestión de Eventos:**
   - El usuario puede agregar eventos desde un botón específico.
   - Se abre un diálogo que solicita los detalles del evento.
   - Los eventos se agregan dinámicamente a una lista que se muestra en pantalla.

3. **Gestión de Horarios:**
   - El usuario ingresa asignaturas con su día y hora.
   - Los horarios se agregan a una lista en tiempo real.
   - Se permite gestionar horarios de forma rápida y eficiente.

4. **Gestión de Farmacias:**
   - La funcionalidad está diseñada pero aún no implementada completamente.

---

## **¿Por qué es útil esta aplicación?**

- **Organización personal:** Permite a los usuarios gestionar actividades importantes como eventos y horarios en un solo lugar.
- **Fácil de usar:** La interfaz es intuitiva, con opciones claras y rápidas.
- **Extensibilidad:** Está preparada para futuras mejoras, como persistencia de datos y funcionalidades más avanzadas.

---

## **Características principales**

1. **Validación de datos:** La aplicación asegura que todos los campos estén completos antes de guardar un evento o un horario.
2. **Listas dinámicas:** Los datos ingresados se muestran en listas interactivas que pueden actualizarse en tiempo real.
3. **Diseño modular:** Cada funcionalidad está separada en actividades individuales para facilitar el mantenimiento y la escalabilidad del código.

---

## **Próximos desarrollos**

1. **Persistencia de datos:**
   - Implementar SQLite o Firebase para almacenar eventos y horarios de manera permanente.
2. **Funcionalidad de farmacias:**
   - Integrar mapas y bases de datos de farmacias cercanas.
3. **Mejora de UI/UX:**
   - Introducir animaciones y mejoras visuales con Material Design.
4. **Internacionalización:**
   - Preparar la aplicación para admitir múltiples idiomas.

---

## **Conclusión**

Este programa es una solución sencilla pero poderosa para gestionar el tiempo y las actividades personales. Con su diseño modular y extensible, ofrece una base sólida para futuros desarrollos y personalizaciones.

Si tienes dudas o sugerencias, no dudes en contribuir o abrir un issue en el repositorio. ¡Gracias por usar nuestra aplicación!

---
