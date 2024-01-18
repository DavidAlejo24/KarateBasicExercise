#Author: david3505@hotmail.com
Feature: Ejemplo basico karate con API

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: create a user and then get it by id
    * def user = read('../data/createData.json')
    Given path 'user'
    And request user
    When method post
    Then status 200

  Scenario: Consulta usuario creado
    Given path 'user/davidAlejo'
    When method get
    Then status 200

  Scenario: Actualiza el nombre y correo del usuario creado
    * def user = read('../data/updateData.json')
    Given path 'user/davidAlejo'
    And request user
    When method put
    Then status 200

  Scenario: Consulta usuario actualizado
    Given path 'user/davidAlejo'
    When method get
    Then status 200

    * def first = response

    Given path 'user/', first.username
    When method get
    Then status 200
    And match response == read('../data/responseData.json')
    #And match response == { id: 26, username: 'davidAlejo', firstName: 'davidUpdated', lastName: 'cruz',email: 'dcruz@nttdataupdated.com',password: "123456", phone: "0999999999", userStatus: 0}



  Scenario: Elimina el usuario creado para la prueba
    Given path 'user/davidAlejo'
    When method delete
    Then status 200


