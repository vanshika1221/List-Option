package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class ListOfOptionTest extends AnyFunSuite {
  val listOfOptionObject = new ListOfOption

  test("To perform addition on List of type Int") {
    val list = List(Some(1), Some(2), Some(3), Some(4))
    val result = 10
    assert(listOfOptionObject.arithmeticOperations(list, "Addition") === result)
  }
  test("To perform addition on List of type Double") {
    val list = List(Some(1.1), Some(2.5), Some(3.3), Some(4.4))
    val result = 11.3
    assert(listOfOptionObject.arithmeticOperations(list, "Addition") === result)
  }
  test("To perform subtraction on List of type Int") {
    val list = List(Some(1), Some(2), Some(3), Some(4))
    val result = -8
    assert(listOfOptionObject.arithmeticOperations(list, "Subtraction") === result)
  }
  test("To perform multiplication on List of type Double") {
    val list = List(Some(1.1), Some(2.5), Some(3.3), Some(4.4))
    val result = 39.93
    assert(listOfOptionObject.arithmeticOperations(list, "Multiplication") === result)
  }
  test("To perform invalid operation") {
    val list = List(Some(1.1), Some(2.5), Some(3.3), Some(4.4))
    val exception = intercept[IllegalArgumentException] {
      listOfOptionObject.arithmeticOperations(list, "Power")
    }
    assert(exception.getMessage === "Invalid operation: Power")
  }
}
