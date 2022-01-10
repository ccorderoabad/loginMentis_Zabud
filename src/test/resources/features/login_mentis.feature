#language:es
Característica:
  Como usuario
  quiero ingresar a la pagina de Mentis
  para visualizar las diferentes opciones de la pagina

  Escenario:Iniciar sesion de forma correcta
    Dado que el usuario abre la pagina Web de Mentis
    Cuando se ingresan las credenciales correctas
      | username | password |
      | demo     | demo     |
    Entonces se valida que tenga acceso a la pagina
      |validacion|
      |Bootstrap-Admin-Template|