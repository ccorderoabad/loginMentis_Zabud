# INTRODUCCIÓN ZABUD 
Se realiza escenario de prueba para acceder a las pagina de Mentis, donde se coloca el usuario (demo) y contraseña (demo), se valida una palabra dentro de la ventana y cierra la sesión.

# Adjuntos
Se adjunta imagen de Serenty del reporte y archivo PDF de la ejecución correcta
1.	ReporteSerenity.PNG
2.	Serenity Reports.pdf
3.  Pregunta de Dropdown.

----------------------------------------------------------------------------
# Ejercicio 3: Dropdown
De cuántas formas se puede seleccionar un valor de un dropdown usando java y
selenium web driver? Puede mandar un pseudocódigo o un código completo.

#Rpta:
browser.select("//path_to_drop_down", "Value1");
browser.getSelectedValue("//path_to_drop_down");
driver.findElement(By.id("id_dropdown_menu")).click();
driver.findElement(By.xpath("xpath_from_seleniumIDE")).click();