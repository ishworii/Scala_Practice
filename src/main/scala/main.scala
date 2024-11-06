def time[T](block: => T) : T ={
  val before = System.nanoTime
  val result = block
  val after = System.nanoTime
  println("Elapsed time " + (after-before)/1e6+ "ms")
  result
}


def print_primes(arr: Vector[Int]): Unit = {
  arr.zipWithIndex.foreach { case (element, index) =>
    if index % 20 == 0 then println(" ")
    else print(element + " ")
  }
}

@main
def main(): Unit = {
  val limit:Int = 99_991_949
  time(is_prime_basic(limit))
  time(is_prime_sqrt(limit))
  time(is_prime_sqrt_optimized(limit))
  time(is_prime_mod6(limit))

}