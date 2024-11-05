import scala.io.StdIn.readLine

def print_primes(arr: Vector[Int]): Unit = {
  arr.zipWithIndex.foreach { case (element, index) =>
    if index % 20 == 0 then println(" ")
    else print(element + " ")
  }
}

@main
def main(): Unit = {
  println("Enter the number upto which you want to generate primes?")
  val limit = readLine().toInt
  var primes:Vector[Int] = Vector()
  for i <- 1 until (limit+1) do{
    if is_prime_sqrt(i) then primes = primes :+ i
  }
  print_primes(primes)

}