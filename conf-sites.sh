# ! /bin/bash
# author: ivan villagra
# descripcion: 
#creo una variable que contenga la ruta de los ficheros

#compruebo que existe el fichero 000-default.conf
ruta= "/var/sh"
if test -e $ruta/000-default.conf
	then
	#copiar el fichero con el nombre minombre.conf
	cp 000-default.conf ivan.conf
	#copiar el fichero con el nombre aficion.conf
	mv 000-default.conf aficion.conf
else
	#mensaje de error
	echo "No se ha podido realizar la accion"
fi
#define un array con los nombres de los ficheros
arrayFicheros=($ruta/ivan.conf	$ruta/aficion.conf)
#bucle
for (x-1; x<$arrayFicheros; x++)
do 
	sed -e '/cadena/ !d' $ruta/aficion.conf
	sed -e '/cadena/ !d' $ruta/ivan.conf
done
echo $(arrayFicheros[@])