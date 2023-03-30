package com.knoldus

class ListOfOption {
  // method to perform arithmetic operations on list of generic type
  def arithmeticOperations[T: Numeric](listOfOption: List[Option[T]], operationToPerform: String): T = {
    val result = for {
      listElement <- listOfOption.flatten(element => element)
    } yield listElement
    // matching the operation to perform particular operation on list
    operationToPerform match {
      case "Addition" => result.sum
      case "Subtraction" => result.reduceLeft(Numeric[T].minus)
      case "Multiplication" => result.reduceLeft(Numeric[T].times)
      // throwing error for invalid operation
      case _ => throw new IllegalArgumentException(s"Invalid operation: $operationToPerform")
    }
  }
}
