#Author: your.email@your.domain.com
#Keywords: Summary:
#Feature: List of scenarios.
#Scenario:Business rule through list of steps with
@PruebaLogin
Feature: Realizar login en la pagina demoguru Bank

  @SmockTest
  Scenario: Ingreso a mi Home GTPL Bank
    Given  Yo como usuario quiero ingresar a la pagina del banco
    When Ingreso mi usuario y clave
       | mngr335524 | YturerY |
    Then Deberia ver el "Gtpl Bank"
