# ScrudBeans MDD


Este proyecto contiene un microservicio creado con springboot y la tecnologia MDD scrudBeans.

El proyecto fue construido basandose en la siguiente modelo:

![modelo]: etc/img/modelo.png "Modelo microservicio de conferencia"

Posteriormente las clases fueron creadas utilizando las notaciones necesarias, observer el siguiente ejemplo con la clase Conference:

![clase-conference] etc/img/definicion_entidad_conference.png "Definicion clase conferencia"


Una vez creadas todas las entidades, se ejecuto el comando build, lo que provoca la creacion de una carpeta llamada generated-sources/annotations en la carpeta target, la cual contiene todos los componentes necesarios para ofrecer una arquitectura de microservicios, respetando la jerarquia de paquetes de springboot.

[generated-sources/annotations] etc/img/generated_sources.png "Paquetes y archivos generados"

Una vez generados los componentes necesarios es posible poner a prueba la API, sin embargo es preferible pasar los archivos generados a la carpeta principal de proyecto src/main/java, para que estos no sean eliminados al  ejecutar el comando clean. 


## REFLEXION

El manejo de tecnologias de desarrollo orientado por modelo resulta considerablemente util para acelerar el proceso de implementacion, haciendo que los desarrollares no deban preocuparse por la estructura del microservicio y se ocupen principalmente en el desarrollo de reglas del negocio, si bien esta es una gran ventaja es necesario tener encuenta la recurrencia con la que estas tecnologias reciben actualizaciones, pues en el caso de ScrudBeans fue necesario utilizar versiones anteriores del SpringBoot y java para lograr utilizar la herramienta, lo que supone una amaneza para la calidad del sistema, pues si se utiliza este tipo de tecnologias se compromete la modificabilidad, dado que todo cambio en la aplicacion deberá ser implementado con sumo cuidado procurando que las modificaciones no generen problemas de compatibilidad con la herramienta de MDD. En conclusion, scrudBeans ahorran tiempo a corto plazo, pero puede llegar a generar complicaciones a mediado y largo plazo, por lo tanto, para construir un sistema basado en MDD se debe seleccionar una tecnologia que conste con actualizaciones constantes que garanticen la compatibilidad con las ultimas de versiones de los frameworks y lenguajes de programacion.


## Importante:

**Prerequisites**: JDK 1.8 or JDK 12 



## Autora

Ashlee Vanessa Campaz <ashleecampaz@unicauca.edu.co>
