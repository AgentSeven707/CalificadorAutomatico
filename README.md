# CalificadorAutomatico
Diagrama de arquitectura: 
  
  Existen 3 paquetes: 
  
       - RecolectorCriteriosInterfaz: Tiene dos JFrames que recolectan los datos (FormularioGuia y SelectorArchivoTarea). Por medio de FormularioGuia se establecen 
         los criterios para la evaluación de tareas como: el tipo de tarea (resumen, ensayo o preguntas abiertas), extensión (palabras)
         y el tema. 
         
       - CalificacionAnalisis: Cuenta con dos clases Revisar y Calcular. La clase revisar se encarga de abrir el archivo y definir si los criterios establecidos en
         la interfaz fueron cumplidos. La clase calcular se encarga de en base a los criterios obtenidos definir una calificación. 
         
       - RetroalimentacionTarea: Cuenta con dos clases Analisis y Mensaje. La clase Analisis se encarga de con base en una calificación obtenida asigna una opción 
         del 1 al 3 y la clase Mensaje se encarga de recibir esa opción y dar una retroalimentación adecuada. 
         
  Requerimientos para ejecutar el código: 
  
       - Tener los archivos de tarea guardados en el equipo. 
       
       - Tener el proyecto de java guardado en el equipo. 
       
       - Ejecutarlo desde un IDE que pueda compilar proyectos de java.
  
  Instrucciones para ejecutar el programa:
  
       - Ejecutar el archivo FormularioGuia.java.
       
       - Rellenar las opciones que vienen en el JFrame FomularioGuia.
       
       - Añadir el archivo mediante la opción "seleccionar archivo".
       
       - Darle click al botón de calificar. 
