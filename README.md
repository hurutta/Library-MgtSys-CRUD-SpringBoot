
# Library Management System - Backend - CRUD - SpringBoot
  
  
<div id="top"></div>

<!-- TABLE OF CONTENTS -->

## Table of Contents

  <ol>
    <li>
      <a href="#about2">About The Project</a>
      <ul>
        <li><a href="#build3">Structure</a></li>
        <li><a href="#build2">Built With</a></li>
      </ul>
    </li>
    <li><a href="#usage2">Usage</a></li>
    <li><a href="#usage3">Feature</a></li>
    <li><a href="#contact2">Contact</a></li>
  </ol>



<div id="about2"></div>


<!-- ABOUT THE PROJECT -->

## About The Project

Its a springBoot CRUD application for library management system. This backend system can receive and send REST API's. See below for further information.  

<p align="right">(<a href="#top">back to top</a>)</p>


<div id="build3"></div>

## Structure
  
### Dependency
  Dependecy imported and used for SpringBoot Application -
  * Spring JPA
  * Spring Web
  * H2 Database

### Directory
```
.
└── LibraryMgtSys/
    ├── BookApplication.java
    ├── controller/
    │   └── BookController.java
    ├── entity/
    │   └── Book.java
    ├── repository/
    │   └── BookRepository.java
    └── service/
        └── BookService.java
```  
<p align="right">(<a href="#top">back to top</a>)</p>    

<div id="build2"></div>
  
## Built With

### Technology used

  * SpringBoot
  * java
  * H2 relational DBMS

### Software used
  
  * Postman
  * Editor (VScode)
  
<p align="right">(<a href="#top">back to top</a>)</p>







<div id="usage2"></div>



<!-- USAGE EXAMPLES -->
## Usage



<p align="right">(<a href="#top">back to top</a>)</p>

Test can be run with a local in-memory H2 DB. I used `Postman` to test REST api's. I've attached few gif's of testing from postman.
* Testing for `GET`, `POST`  
<img src="gifs/1.gif" width=764 align="center">

* Testing for `PUT`, `DELETE`  <br>
<img src="gifs/2.gif" align="center">

Referring <a href="#usage3">Features</a> section for a chart of all working API's.


<div id="usage3"></div>






<!-- USAGE EXAMPLES -->
## Features

  * Rest endpoints 

    * **POST:** http://localhost:8080/save : Add a new book to the database <br>
    Sample JSON for this request:
     ```
      {
          "name": "1",
          "genre": "Roronoa",
          "writer": "Zoro",
          "publishYear": 1999,
          "price": 20.50
      }
      ```
    * **DELETE:** http://localhost:8080/remove/{id} : Delete a book by it's id
    * **PUT:** http://localhost:8080/update/{id} : Update book by it's id
    * **GET:** http://localhost:8080/all/ : Get a list of all book
    * **GET:** http://localhost:8080/price/{from}/{to} : Get a list of books price range between `from` to `to`
 
    
<p align="right">(<a href="#top">back to top</a>)</p>



<div id="contact2"></div>


<!-- CONTACT -->
## Contact

You may contact with me via gmail if needed. All necessary contact info you will find at - 
<a href="https://hurutta.github.io"> my website. <a>


<p align="right">(<a href="#top">back to top</a>)</p>
