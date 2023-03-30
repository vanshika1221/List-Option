package com.knoldus

import scala.util.{Try, Success, Failure}

object Driver extends App {
  val listOfOptionObject = new ListOfOption
  val inputList = List(Some(1.0), Some(2.22), Some(3.9), Some(4.9))
  // using Try match block to handle exceptions
  Try {
    println(listOfOptionObject.arithmeticOperations(inputList, "Multiplication"))
  } match {
    case Success(result) => result
    case Failure(exception) => println(s"An error occurred: ${exception.getMessage}")
  }
}