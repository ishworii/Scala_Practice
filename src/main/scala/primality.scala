import scala.math._
def is_prime_basic(num : Int) : Boolean = {
  if num < 2 then false
  else {
    for i <- 2 until num do{
      if num % i == 0 then {
        return false
      }
    }
      true
  }
}

def is_prime_sqrt(num : Int) : Boolean = {
  if num < 2 then false
  else{
    for i  <- 2 until (sqrt(num) + 1).toInt do{
      if num % i == 0 then {
        return false
      }
    }
    true
  }
}

def is_prime_sqrt_optimized(num:Int) : Boolean = {
  if num < 2 then false
  else if num == 2 then true
  else if num % 2 == 0 then false
  else{
    for i <- 3 to (sqrt(num) + 1).toInt by 2 do{
      if num % i == 0 then {
        return false
      }
    }
    true
  }
}

def is_prime_mod6(num:Int) : Boolean = {
  if num < 2 then false
  else if num == 2 then true
  else if num % 2 == 0 | num % 3 == 0 then false
  else {
    var limit = (sqrt(num) + 1).toInt
    for i <- 5 to limit by 6 do{
      if num % i == 0 | num % (i+2) == 0 then {
        return false
      }
    }
      true
  }
}